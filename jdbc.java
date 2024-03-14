package j2EE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbc {
	public static void main(String[] args)   {
		Connection con=null;
		String str1="insert into movie_db.movie_review "
				+ "(hero,other_main_cast,review_rating,movie_id)"
				+ " values('thatha','sethu','6','24QE')";
		String db_url="com.mysql.cj.jdbc.Driver",
				username="root",
				password="root",
				url_for_specific_db="jdbc:mysql://localhost:3306/movie_db";
		try {
		Class.forName(db_url);
		//1.load the driver class
		
			//2.establish connection
			 con=DriverManager.getConnection(url_for_specific_db,username,password);
			
			//3.create java query in to sql query;
			Statement s=con.createStatement();
			
		
		//int k=s.executeUpdate("insert into movie_db.movie_review (hero,other_main_cast,review_rating,movie_id) values ('vj','sethupathi','2','24QE')");
			//4.excute query
			//excuteupdate() == used to insert,update,delete;
			
			//excutequery()==resultset-->select
			// s.executeUpdate(url_for_specific_db)
			
			//int [] -->excutebatch()-->batch
			
			//boolean -->execute-->any      java-->db-->false;
			                            //db-->java-->true;
			
			
			int y=s.executeUpdate(str1);	
			
	      /*  boolean k=s.execute("select*from movie_review");
	        if(k) {
	        	ResultSet rs=s.getResultSet();
	        	while(rs.next()) {
	        		System.out.println(rs.getInt(1));
	        		System.out.println(rs.getString(2));
	        	}
	        		
	        }  */
	        	        
		System.out.println(y);
		}
		catch(Exception e) {
			System.out.println("error ocurred");
		}
		finally {
			try {
				if(con!=null) {
				con.close();
				System.out.println("connection closed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//select database name =select._globalname
		
	}
}
