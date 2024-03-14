package j2EE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db\",\"root\",\"root\"");
			Statement s=con.createStatement();
			s.executeUpdate("delete from movie where mid=2");
		}
		catch(Exception e) {			
			System.out.println("checek the try block");
		}
		
		
	}
}
