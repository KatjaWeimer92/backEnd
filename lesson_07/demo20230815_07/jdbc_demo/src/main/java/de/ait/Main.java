package de.ait;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        JDBCDemo.loadDriver();
        List<User> users = JDBCDemo.getAll();

        System.out.println(users);
    }
}