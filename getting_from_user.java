package j2EE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class getting_from_user {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Scanner sc =new Scanner (System.in);
		int id=sc.nextInt();
		//String name=sc.next();
		String hero=sc.next();		
		String villan=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db\",\"root\",\"root\"");
			//Statement s=con.createStatement();
			PreparedStatement ps=con.prepareStatement("update movie_db hero=?,villan=?,id=?");
			ps.setString(1, villan);
			ps.setString(2,hero);
			ps.setInt(1, id);
			
		}
		catch(Exception e) {			
			System.out.println("checek the try block");
		}
	}
}
