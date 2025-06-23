package org.main;

import org.domain.Address;
import org.domain.Store;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Date;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        DBControl db = new DBControl();
        SessionFactory sessionFactory = db.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Address address = session.createQuery("FROM Address where address_id = 2", Address.class).getSingleResult();
            Store store = session.createQuery("FROM Store where store_id = 2", Store.class).getSingleResult();
            db.createNewCustomer((short) 999, store, "Andrey", "Ivanov", "tochoNEspam@gmail.com", address, 1, Date.valueOf("2003-04-05"), new Timestamp(1750680629));
        }
    }
}
