package org.main;

import lombok.Getter;
import org.domain.Address;
import org.domain.Customer;
import org.domain.Store;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.Date;
import java.sql.Timestamp;
@Getter
public class DBControl {
    private final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    public DBControl() {
    }

    public void createNewCustomer(short id, Store store,String FirstName, String LastName,String email, Address address, int active, Date create_date, Timestamp last_update ) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(new Customer(id,store,FirstName,LastName,email,address,active,create_date,last_update));
            session.getTransaction().commit();
    }
    }

}