package de.ait;

import de.ait.entity.User;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        HibernateConfiguration hibernateConfiguration = new HibernateConfiguration();
        UserXmlHibernateRepository repository = new UserXmlHibernateRepository(hibernateConfiguration);

        List<User> users = repository.findAll();
        System.out.println(users);

        System.out.println("_______________find by id____________");
        User userById = repository.findById(2L);
        System.out.println(userById);
        }
    }
