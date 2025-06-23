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

public class DBControl {
    private final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public DBControl() {
    }

    public Customer createNewCustomer(String firstname,String LastName, String email) {
        Customer c;
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Address address = session.createNativeQuery("SELECT * from movie.address where address='23 Workhaven Lane'", Address.class)
                    .getSingleResult();
            Store store = session.createNativeQuery("SELECT * from movie.store where store_id=1", Store.class).getSingleResult();
            Customer customer = new Customer((short) 101, store,firstname,LastName,email,address,1,Date.valueOf("2023-05-06"), Timestamp.valueOf("2023-05-06"));
            c =customer;
            session.persist(customer);
            session.getTransaction().commit();
        }
        return c;
    }
}