package courses;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class fetch_by_prices {

	public static void main(String[] args) {
 Scanner sc = new Scanner ( System.in);
 int f =sc.nextInt();
 int too= sc.nextInt();
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em= emf.createEntityManager(); 
	if(true) {
		Query q=	em.createQuery("select p form course1 p where p.prices between ?1 and ?2");
		
		
		q.setParameter(1, f);
		q.setParameter(2, too);
		
		List<course1> list= q.getResultList();
		
		for (course1 c:list){
			System.out.println(c);
		}}
	int start =sc.nextInt();
	int end = sc.nextInt();
		
		if(false) {
			Query q1=	em.createQuery("select p from course1 p where p.prices between :start1 and :end1 order by p.prices desc");
			q1.setParameter("start1", start);
			q1.setParameter("end1",end);
			
			List<course1> list1=q1.getResultList();
			for ( course1 c2:list1) {
				System.out.println(c2);
			}
		}
	}

}
