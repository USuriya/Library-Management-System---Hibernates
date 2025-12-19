package library;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
public class fetch_by_column {
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
			
		 Query q = em.createQuery("select lib.title,lib.author,lib.genre from library lib");
		 
		 List<Object[]> l = q.getResultList();
		 for (Object[] o : l) {
			 System.out.println("Title = "+o[0] +" , Author = " +o[1]+ " , Genre = "+o[2]);
		}
	}

}
