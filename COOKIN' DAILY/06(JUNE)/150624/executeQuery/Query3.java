package executeQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query3 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try {
			Connection c = DriverManager.getConnection(url);
			String query = "select name, location, email from practice.employee where id = 1";
			
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(query);
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					System.out.println("---->" + "\t" + rs.getString("name") + "\n" + "\t" + rs.getString("location") + "\n" + "\t" + rs.getString("email"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
