package courses;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class unlike_object_getting_spcific_coloum_from_db {

	
	public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");	
		EntityManager em= emf.createEntityManager(); 
		
	Query q=	em.createQuery("select p.course_code from course1 p ");
		List<String>list =q.getResultList();
		for (String s:list) {
			System.out.println(s);
		}
	}
}
