package practice14_06_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert2 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try {
			Connection c = DriverManager.getConnection(url);
			String insert = "insert into practice.student values('2', 'shiva', 'engineering', 'warangal', 90)";
			
			Statement s = c.createStatement();
			
			int rowsinserted = s.executeUpdate(insert);
			System.out.println(rowsinserted);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
