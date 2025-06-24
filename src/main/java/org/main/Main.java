package org.main;

import org.domain.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DBControl db = new DBControl();
//        SessionFactory sessionFactory = db.getSessionFactory();
//        try (Session session = sessionFactory.openSession()) {
//            session.beginTransaction();
//            Address address = session.createQuery("FROM Address where address_id = 2", Address.class).getSingleResult();
//            Store store = session.createQuery("FROM Store where store_id = 2", Store.class).getSingleResult();
//            // Creation New Customer
            int  c = db.createNewCustomer(1, "Mixail", "Makovodnick", "animeSoGOOD@gmail.com", 1, 1, Date.valueOf("1900-04-05"), new Timestamp(System.currentTimeMillis()));
//            Inventory inventory = session.createQuery("FROM Inventory where inventory_id = 2", Inventory.class).getSingleResult();
//            Staff staff = session.createNativeQuery("SELECT * from staff where store_id = "+store.getStore_id(), Staff.class).getSingleResult();
//            // Rental Film
//            db.RentalFilm(c, inventory, staff, session);
//            // Return Rental Film
//            db.returnRentalFilm(c, session);
//            // Create Film
//            Language language = session.createQuery("FROM Language where name = 'en'", Language.class).getSingleResult();
//            List<Actor> actors = session.createQuery("from Actor where first_name like '%n'",  Actor.class).list();
//            List<Category> categories = session.createQuery("from Category where name like '%a'",  Category.class).list();
//            db.createNewFilm("Postgresql vs Mysql", language, actors, null, 10, BigDecimal.valueOf(7.6), 12, BigDecimal.valueOf(12.3), "RC-17", "nothing", categories, List.of(store), session);
//            session.getTransaction().commit();
//        }
        System.out.println(c);
    }
}