package executeQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query4 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try {
			Connection c = DriverManager.getConnection(url);
			String query = "select name, price from practice.apple_ecosystem where type = 'arheadset'";
			
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(query);
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					System.out.println("---->" + "\t" + rs.getString("name") + "\n" + "\t" + rs.getString("price"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}