package courses;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java .util.*;
public class fetch_3_coloum {
public static void main(String[] args) {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");	
		EntityManager em= emf.createEntityManager(); 
		
		/*Query q=em.createQuery("select p.id,p.course_code,p.course from course1 p");
		List <Object[]> list=q.getResultList();
		 for(Object arr[]:list) {
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]); 
		 }  */
		
		Query q=em.createQuery("select p.course from course1 p where p.course like  null");
	List<String> list=	q.getResultList();
	for (String  l:list) {
		System.out.println(l);
}
}

}
