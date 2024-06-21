package CreateStatementMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		try {
			Connection c = DriverManager.getConnection(url);
			String query = "delete from practice.jspider where id=29";
			
			PreparedStatement p = c.prepareStatement(query);
			
			int rowsdeleted = p.executeUpdate();
			System.out.println(rowsdeleted);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}