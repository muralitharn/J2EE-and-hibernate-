package courses;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class course_save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em= emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
int id=sc.nextInt();	
int prices=sc.nextInt();
String coursecode=sc.next();
String course=sc.next();


		course1 c1=new course1();
		c1.setId(id);
		c1.setPrices(prices);
		c1.setCourse_code(coursecode);
		c1.setCourse(course);
		
		
		et.begin();
		em.persist(c1);
		et.commit();
		
}
}