package library;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
public class sort_asc {

		
		public static void main(String[] args) {
			 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
			 EntityManager em = emf.createEntityManager();
				
			 Query q = em.createQuery("select lib from library lib order by  lib.title");
			 
			 List<library> l = q.getResultList();
			 for (library lib : l) {
				 System.out.println(lib);
				
			}
			 
			
			
		}

	}

