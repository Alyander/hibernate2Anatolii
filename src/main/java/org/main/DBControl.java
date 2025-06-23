package org.main;

import org.domain.Address;
import org.domain.City;
import org.domain.Customer;
import org.domain.Store;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Random;

public class DBControl {
    private final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    private final Random random = new Random();
    public DBControl() {
    }

    public void createNewCustomer(String firstname,String LastName, String email) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Address address = session.createQuery(" from Address where address='23 Workhaven Lane'", Address.class)
                    .getSingleResult();
            Store store = session.createQuery("from Store where store_id=1", Store.class).getSingleResult();
//            session.merge(address);
//            session.merge(store);
            Customer customer = new Customer
                    ((short)999,store,firstname,LastName,email,address,1,Date.valueOf("2023-05-06"),
                            new Timestamp(1750680629));
//            session.merge(address);
//            session.merge(store);
            session.merge(customer);
            session.persist(customer);
            session.getTransaction().commit();
        }
    }
}