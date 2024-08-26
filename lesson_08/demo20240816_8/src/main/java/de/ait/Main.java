package de.ait;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        JDBCDemo.loadDriver();
       /* List<User> users = JDBCDemo.getAll();

        System.out.println(users);


        User u1 = new User( "Georg1", "georg1@mail.com", "piejfkkndv");

        User createdUser = JDBCDemo.create(u1);

        users =JDBCDemo.getAll();
        System.out.println(users);

        createdUser.setName(("Vika"));
        createdUser.setEmail("vika@mail.com");

        System.out.println("------------update-----------");

        JDBCDemo.update(createdUser);
        users =JDBCDemo.getAll();
        System.out.println(users);


        System.out.println("---------------------");
        users = JDBCDemo.getAll();
        User user = users.get(0);
        user.setEmail("1234567890");
        JDBCDemo.update(user);

        users = JDBCDemo.getAll();
        System.out.println(users);

        */

        System.out.println("_______-----------__________");

        User user3 = JDBCDemo.findById(3L);
        System.out.println(user3);
    }


}