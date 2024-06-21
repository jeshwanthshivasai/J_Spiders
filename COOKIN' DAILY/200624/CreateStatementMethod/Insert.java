package CreateStatementMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		try {
			Connection c = DriverManager.getConnection(url);
			String query = "insert into practice.jspider values (?, ?, ?)";
			
			PreparedStatement p = c.prepareStatement(query);
			p.setInt(1, 29);
			p.setString(2, "January");
			p.setInt(3, 1999);
			int rowsinserted = p.executeUpdate();
			System.out.println(rowsinserted);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
