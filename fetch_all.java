package courses;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import com.mysql.cj.Query;



public class fetch_all {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory( "dev");
	EntityManager em=emf.createEntityManager();
	// craete query() method is used to take jpql(java peristences query lauange ) and return type is ouery
	
	 javax.persistence.Query q=em.createQuery("select p from course1 p");

	 // this is for getting multiple results from database we  use get resultlist
List<course1> l=q.getResultList();

	 for (course1 c:l) {
		 System.out.println(c);
	 }
}
}
