package de.ait;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/";
    private static final String DB = "app_43";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "qwerty007";

    public static void loadDriver() throws ClassNotFoundException {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Load driver error:" + DRIVER);
        }

    }

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL + DB, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Create connection fail!");
        }
    }

    public static List<User> getAll() {
        String query = "SELECT * FROM t_user";

        try (Connection connection = getConnection()) {
            if (connection == null) {
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
        } catch (SQLException e) {
            throw new RuntimeException("Read data fail!");
        }
    }

    public static User create(User user) {
        String query = "INSERT INTO t_user (name, email, password) VALUES (?, ?, ?)";

        try (Connection connection = getConnection()) {
            if (connection == null) {
                throw new SQLException("Connection fail!");
            }
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());

            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Create user fail:" + user);
            }
            ResultSet resultSet = statement.getGeneratedKeys();
            if (!resultSet.next()) {
                throw new SQLException("Get new user id fail!");
            } else {
                Long id = resultSet.getLong(1);
                user.setId(id);
                return user;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public static User update(User user) {
        String query = "UPDATE t_user SET name = ?, email = ?, password = ? WHERE id = ?";
        try (Connection connection = getConnection()) {
            if (connection == null) {
                throw new SQLException("Connection fail!");
            }
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setLong(4, user.getId());

            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("User with id:" + user.getId() + " not updated!");
            }
            if (affectedRows > 1) {
                throw new SQLException("Error! Updated " + affectedRows + " users. Duplicate keys in DB");
            }
            return user;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static User findById(Long id) {
        String query = "SELECT * FROM t_user WHERE id = ?";
        try (Connection connection = getConnection()) {
            if (connection == null) {
                throw new SQLException("Connection fail");
            }
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next()) {
                return null;
            } else {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                return new User(id, name, email, password);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static User save(User user) {
        if (user.getId() != null) {
            return update(user);
        } else {
            return create(user);
        }
    }

}
