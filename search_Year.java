package library;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class search_Year {
	
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
			
		 Query q = em.createQuery("select lib from library lib where lib.yearPublished = 2008 ");
		 
		 Object o = q.getSingleResult();
		 library lib = (library) o;
		 System.out.println(lib);
		
		 
	}

}
