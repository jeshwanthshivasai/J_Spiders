package executeUpdate.learninghowtoconnecttodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB1 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try {
			Connection c = DriverManager.getConnection(url);
			String insert = "insert into practice.apple_ecosystem values('mobile', 'iOS', 'iPhone', '15promax', '$USD 1000', '4000mah', 'triplecamerawithlidar', 'lightningport', 'A15Bionic', 'IP68')";
			
			Statement s = c.createStatement();
			
			int rowsinserted = s.executeUpdate(insert);
			System.out.println(rowsinserted);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}