package courses;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class for_set_parameter_method {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String s= sc.next();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em= emf.createEntityManager();
		Query q=em.createQuery("select p from course1 p where p.id=?1");
		
		q.setParameter(1,s );
		Object o=q.getSingleResult();  // or getResultList() ->
		course1 core=(course1)o;
		System.out.println(core);
		
	}

}
