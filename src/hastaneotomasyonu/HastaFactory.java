package hastaneotomasyonu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HastaFactory {
    
    public static Hasta getHasta(int hastaid) {
        Hasta hasta = null;
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            String query = "SELECT * FROM hastalar WHERE hastaid = ?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, hastaid);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    int kimlikno = resultSet.getInt("kimlikno");
                    String hastadi = resultSet.getString("hastadi");
                    String hastasoyadi = resultSet.getString("hastasoyadi");
                    if ("HastaKayit".equalsIgnoreCase(hastadi)) {
                        hasta = new HastaKayit(hastaid, kimlikno, hastadi, hastasoyadi);
                    } else if ("İkinciHastaKayit".equalsIgnoreCase(hastadi)) {
                        hasta = new İkinciHastaKayit(hastaid, kimlikno, hastadi, hastasoyadi);
                    }
                }
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return hasta;
    }
}
