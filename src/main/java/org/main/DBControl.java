package org.main;

import lombok.Getter;
import org.domain.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Getter
public class DBControl {
    private final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    public DBControl() {
    }

    public Customer createNewCustomer(short id, Store store,String FirstName, String LastName,String email, Address address, int active, Date create_date, Timestamp last_update ) {
        Customer c;
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            c = new Customer(store,FirstName,LastName,email,address,active,create_date,last_update);
            session.save(c);
            session.getTransaction().commit();
        }
        return c;
    }
    public void returnRentalFilm(Customer customer) {
        try(Session session=sessionFactory.openSession()){
            session.beginTransaction();
            Rental rental = session.createNativeQuery("Select * FROM rental WHERE customer_id="+customer.getCustomer_id(), Rental.class).getSingleResult();
            rental.setReturnDate(new Date(System.currentTimeMillis()));
            session.getTransaction().commit();
        }
    }
    public void RentalFilm(Customer customer, Inventory  inventory, Staff staff) {
        try(Session session=sessionFactory.openSession()){
            session.beginTransaction();
            Rental rental = new Rental(new Date(System.currentTimeMillis()), inventory, customer, null, staff, new Timestamp(System.currentTimeMillis()));
            session.persist(rental);
        }
    }
    public Film createNewFilm(String title, Language language, List<Actor> actors, String Description, int rental_duration, BigDecimal rental_rate,
                              int length, BigDecimal replacement_cost, String rating, String special_features, List<Category> categories, List<Store> stores) {
        Film film;
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            film = new Film(title, Description, (short) 20250624, language, null, rental_duration, rental_rate,(short) length, replacement_cost, rating, special_features, new Timestamp(System.currentTimeMillis())  );
            session.persist(film);
            for(Actor actor : actors){
                Film_Actor f_a = new Film_Actor(actor,film, new Timestamp(System.currentTimeMillis()));
                session.persist(f_a);
            }
            for (Category category : categories){
                Film_Category f_c = new Film_Category(film, category, new Timestamp(System.currentTimeMillis()));
                session.persist(f_c);
            }
            // Где будет доступно
            for (Store store : stores){
                Inventory inventory = new Inventory( film, store, new Timestamp(System.currentTimeMillis()) );
                session.persist(inventory);
            }
            Film_text film_text = new Film_text(film, new Timestamp(System.currentTimeMillis()), title, Description );
            session.persist(film_text);
            session.getTransaction().commit();
        }
        return film;
    }

}