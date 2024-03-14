package courses;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

public class getSingleResultSet {
	
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	
	EntityManager em= emf.createEntityManager();
	javax.persistence.Query q=em.createQuery("select p from course1 p where p.course='java' ");
	Object o=q.getSingleResult();
	course1 core=(course1)o;
	System.out.println(core);
}
}
