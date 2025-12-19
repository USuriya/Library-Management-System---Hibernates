package library;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.*;

public class libraryClass {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		library lib = new library();
		
		System.out.println("Enter bookID : ");
		int Bid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book Title : ");
		String Title = sc.nextLine();
		System.out.println("Enter author name : ");
		String Author = sc.nextLine();
		System.out.println("Enter Year of published : ");
		int YearPublished = sc.nextInt();
		sc.nextLine(); 
		System.out.println("Enter publisher : ");
		String Publisher = sc.nextLine();
		System.out.println("Enter a genre : ");
		String Genre = sc.nextLine();
		
		
		lib.setBid(Bid);
		lib.setTitle(Title);
		lib.setAuthor(Author);
		lib.setYearPublished(YearPublished);
		lib.setPublisher(Publisher);
		lib.setGenre(Genre);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(lib);
		et.commit();
		System.out.println("Data Saved!");
	}
	

}
