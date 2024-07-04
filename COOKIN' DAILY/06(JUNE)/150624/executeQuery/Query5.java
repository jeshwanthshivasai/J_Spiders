package executeQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query5 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		try {
			Connection c = DriverManager.getConnection(url);
			String query = "select * from practice.apple_ecosystem";
			
			Statement s = c.createStatement();
			
			ResultSet rs = s.executeQuery(query);
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					System.out.println("---->" + "\t" + "\n" + "type - " + rs.getString(1) + "\t" + "\n" + "OS - " + rs.getString(2) + "\t" + "\n" + "name - " + rs.getString(3) + "\t" + "\n" + "model - " + rs.getString(4) + "\t" + "\n" + "price - " + rs.getString(5) + "\t" + "\n" + "battery - " + rs.getString(6) + "\t" + "\n" + "camerasystem - " + rs.getString(7) + "\t" + "\n" + "charging - " + rs.getString(8) + "\t" + "\n" + "cpu - " + rs.getString(9) + "\t" + "\n" + "protection - " + rs.getString(10));
					System.out.println("\n");
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
