package com.teamtreehouse.contactmgr;

import com.teamtreehouse.contactmgr.model.Contact;
import com.teamtreehouse.contactmgr.model.Contact.ContactBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Application {
    // Hold a reusable to a SessionFactory
    //private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        // Create a StandardServiceRegistry
        final ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

        return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public static void main(String[] args) {

        Contact contact = new ContactBuilder("Chris","Ramacciotti")
                .withEmail("rama@teamtreehoues.com")
                .withPhone(7735554535L)
                .build();
        System.out.println(contact);
    }
}