package org.main;

import org.domain.Address;
import org.domain.Customer;
import org.domain.Store;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.Date;
import java.sql.Timestamp;

public class DBControl {
    private final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    public DBControl() {
    }

    public void createNewCustomer(String firstname,String LastName, String email) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
//            Store store =
            //session.merge(address);
            //session.merge(store);
            Customer customer = new Customer
                    ((short)999,session.createQuery("from Store where store_id=2", Store.class).getSingleResult(),firstname,LastName,email,session.createQuery(" from Address where address='28 MySQL Boulevard'", Address.class)
                            .getSingleResult(),1,Date.valueOf("2023-05-06"),
                            new Timestamp(1750680629));
            session.persist(customer);
            session.getTransaction().commit();
        }
    }
}