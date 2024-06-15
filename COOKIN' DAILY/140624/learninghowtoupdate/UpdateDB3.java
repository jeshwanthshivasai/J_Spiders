package executeUpdate.learninghowtoupdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB3 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try {
			Connection c = DriverManager.getConnection(url);
			String update = "update practice.apple_ecosystem set cpu='m3' where cpu='m4'";
			
			Statement s = c.createStatement();
			
			int rowsupdated = s.executeUpdate(update);
			System.out.println(rowsupdated);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

}
