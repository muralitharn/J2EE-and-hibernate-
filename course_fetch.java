package courses;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class course_fetch {

	public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em= emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
	}

}
