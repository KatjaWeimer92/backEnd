package de.ait;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class JDBCDemoBook {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL ="jdbc:postgresql://localhost:5432/";
    private static final String DB = "app_book";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "qwerty007";

    public static void loadDriver() throws ClassNotFoundException {
        try{
            Class.forName(DRIVER);
        }catch (ClassNotFoundException e){
            throw new RuntimeException("Load driver error:" + DRIVER);
        }
    }

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL+DB, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e){
            throw new RuntimeException("Create connection fail!");
        }
    }

    public static List<Book> getAllBooks() {
        String query = "SELECT * FROM t_book";

        try (Connection connection = getConnection()){
            if (connection==null){
                throw new SQLException("Connection fail!");
            }
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);



        List<Book> result = new ArrayList<>();
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                Integer year = resultSet.getInt("year");

                result.add(new Book(id, title, author, genre,year));
            }
            return result;
    } catch (SQLException e) {
            throw new RuntimeException("Read data fail!");
        }
    }

}
