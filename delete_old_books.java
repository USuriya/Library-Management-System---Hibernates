package library;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class delete_old_books {

	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		library lib = em.find(library.class,4);
		
		if(lib!= null) {
			et.begin();
			em.remove(lib);
			et.commit();
			
			System.out.println("Data deleted !");
		}
		else {
			System.out.println("Data not present. ");
		}
	}
}
