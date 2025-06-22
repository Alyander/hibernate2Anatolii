package org.main;

import org.domain.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Main {
    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    public static void main(String[] args) {
        List<Film> set;
        try (Session session = sessionFactory.openSession()) {
            set = session.createNativeQuery("SELECT * FROM film", Film.class).list();
        }
        for (Film f : set) {
            System.out.println(f.getDescription());
        }
    }
}
