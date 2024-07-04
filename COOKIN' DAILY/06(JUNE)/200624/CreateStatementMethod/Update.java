package CreateStatementMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		try {
			Connection c = DriverManager.getConnection(url);
			String query = "update practice.jspider set education = ? where education = 1999";
			
			PreparedStatement p = c.prepareStatement(query);
			p.setInt(1, 2001);
			int rowsupdated = p.executeUpdate();
			System.out.println(rowsupdated);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
