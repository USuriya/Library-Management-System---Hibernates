package library;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class update_book_details {
	
	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		library lib = em.find(library.class,1);
		lib.setAuthor("William Shakespeare");
		
		et.begin();
		em.merge(lib);
		et.commit();
		
		System.out.println("Data updated");
	}
	

}
