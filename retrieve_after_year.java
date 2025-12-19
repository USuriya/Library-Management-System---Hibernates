package library;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.*;
import java.util.*;

public class retrieve_after_year {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
			
		 
		 //after year 2000 pulished books
		 Query q = em.createQuery("select lib from library lib where lib.yearPublished >= 2000 ");
		 
		 List<library> l = q.getResultList();
		 for (library lib : l) {
			 System.out.println(lib);
			
		}
		 
		
		
	}

}
