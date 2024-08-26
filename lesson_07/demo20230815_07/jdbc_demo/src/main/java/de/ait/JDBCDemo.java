package de.ait;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL ="jdbc:postgresql://localhost:5432/";
    private static final String DB = "app_43";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "qwerty007";

    public static void  loadDriver() throws ClassNotFoundException {
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Load driver error:" + DRIVER);
        }

    }

    public static Connection getConnection()  {
        try {
            Connection connection = DriverManager.getConnection(URL + DB, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Create connection fail!");
        }
    }

    public static List<User> getAll(){
        String query="SELECT * FROM t_user";

        try (Connection connection = getConnection()){
            if (connection==null){
                throw new SQLException("Connection fail!");
            }
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            List<User> result = new ArrayList<>();
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");

                result.add(new User(id, name, email, password));
            }
            return result;
        } catch (SQLException e){
            throw new RuntimeException("Read data fail!");
        }
    }
}
