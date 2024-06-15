package executeQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try {
			Connection c = DriverManager.getConnection(url);
			String query = "select * from practice.employee";
			
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(query);
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + "\n" + rs.getString(2) + "\t" + "\n" +  rs.getString(3) + "\t" + "\n" +  rs.getString(4) + "\t" + "\n" +  rs.getString(5) + "\t" + "\n" +  rs.getString(6));
					System.out.println("\n");
//					System.out.println(rs.getString("id") + rs.getString("name") + rs.getString("number") +  rs.getString("location") + rs.getString("email") + rs.getString("sex"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
