package library;

import jakarta.persistence.*;
import jakarta.*;

@Entity
public class library {
	
	@Id
	private int bid;
	private String title;
	private String author;
	private int yearPublished;
	private String publisher;
	private String genre;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "library [bid=" + bid + ", title=" + title + ", author=" + author + ", yearPublished=" + yearPublished
				+ ", publisher=" + publisher + ", genre=" + genre + "]";
	}
	
	

}
