package hastaneotomasyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/HastaneOtomasyonu"; // Veritabanı URL
    private static final String USER = "postgres"; // Veritabanı kullanıcı adı
    private static final String PASSWORD = "314159"; // Veritabanı şifresi

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

