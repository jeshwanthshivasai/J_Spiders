package practice14_06_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update2 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		try {
			Connection c = DriverManager.getConnection(url);
			String update = "update practice.student set name='jesse' where department='architecture'";
			
			Statement s = c.createStatement();
			
			int rowsupdated = s.executeUpdate(update);
			System.out.println(rowsupdated);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
