package executeUpdate.learninghowtoconnecttodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB4 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try {
			Connection c = DriverManager.getConnection(url);
			String insert = "insert into practice.apple_ecosystem values ('laptop', 'MacOS', 'Macbook', 'Pro', '$USD 4000', '8000mah', 'none', 'magsafe', 'm4', 'none')";
			
			Statement s = c.createStatement();
			
			int rowsinserted = s.executeUpdate(insert);
			System.out.println(rowsinserted);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
