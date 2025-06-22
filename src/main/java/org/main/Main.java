package org.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    private final SessionFactory sessionFactory = new Configuration().configure().addPackage("domain").buildSessionFactory();
    public static void main(String[] args) {

    }
}
