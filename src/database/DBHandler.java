package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHandler extends config {
    static private Connection connection;

    static private PreparedStatement preparedStatement;

    public Connection getDbconnection() throws SQLException {
        String connectionUrl = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?" + dbTimezone;
        connection = DriverManager.getConnection(connectionUrl,
                dbUser, dbPassword);

        return connection;
    }

    public static void writeToDB(String firstname, String lastname, String userName, String email, String password)
            throws SQLException {
        DBHandler dbHandler = new DBHandler();
        connection = dbHandler.getDbconnection();
        String insert = "INSERT INTO users(firstname,lastname,username,email,password)" +
                "VALUES(?,?,?,?,?)";

        preparedStatement = (PreparedStatement) connection.prepareStatement(insert);
        preparedStatement.setString(1, firstname);
        preparedStatement.setString(2, lastname);
        preparedStatement.setString(3, userName);
        preparedStatement.setString(4, email);
        preparedStatement.setString(5, password);
        preparedStatement.executeUpdate();
    }

    public static void readFromDB() throws SQLException {
        DBHandler dbHandler = new DBHandler();
        connection = dbHandler.getDbconnection();
        String query = "SELECT firstname, password FROM users";
        preparedStatement = (PreparedStatement) connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Names " + resultSet.getString("firstname"));
            System.out.println("password" + resultSet.getString("password"));
        }
    }

    // public static void main(String[] args) throws SQLException {
    // readFromDB();
    // }

    // public ResultSet isUserLoggedIn() {
    // return resultSet;
    // };
}
