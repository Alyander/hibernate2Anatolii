package org.main;

import org.domain.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Set;

public class Main {
    private static final SessionFactory sessionFactory = new Configuration().configure().addPackage("domain").buildSessionFactory();
    public static void main(String[] args) {
        List<Film> set;
        try (Session session = sessionFactory.openSession()) {
            set = session.createQuery("from Film f", Film.class).list();
        }
        System.out.println(set);
    }
}
