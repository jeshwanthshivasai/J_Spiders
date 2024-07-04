package executeUpdate.learninghowtodelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB3 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try {
			Connection c = DriverManager.getConnection(url);
			String delete = "delete from practice.apple_ecosystem where typex = 'mobile'";
			
			Statement s = c.createStatement();
			
			int rowsdeleted = s.executeUpdate(delete);
			System.out.println(rowsdeleted);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}