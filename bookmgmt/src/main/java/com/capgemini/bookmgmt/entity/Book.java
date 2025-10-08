package com.capgemini.bookmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostLoad;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
 
@Entity
@Table(name="book")
public class Book {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	@Column(name="book_name")
	String bookName;
	
	@Column(name="book_author_first_name")
	String authorFirstName;

	@Column(name="book_author_last_name")
	String authorLName;

	@Transient
	String authorFullName;
	
	
	public Book(String bookName, String authorFirstName, String authorLName) {
		super();
		this.bookName = bookName;
		this.authorFirstName = authorFirstName;
		this.authorLName = authorLName;
	}

	public Book() {
		super();
		 
	}

	 @PostLoad
	  private void onLoad() {
		 authorFullName=authorFirstName + " " + authorLName;
	  }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLName() {
		return authorLName;
	}

	public void setAuthorLName(String authorLName) {
		this.authorLName = authorLName;
	}
	
	
	

	public String getAuthorFullName() {
		return authorFullName;
	}

	public void setAuthorFullName(String authorFullName) {
		this.authorFullName = authorFullName;
	}
	
	 

	@Override
	public String toString() {
		//authorFullName=authorFirstName + " " + authorLName;
		
		return "Book [id=" + id + ", bookName=" + bookName + ", authorFirstName=" + authorFirstName + ", authorLName="
				+ authorLName + ", authorFullName=" + authorFullName + "]";
	}

	 

	 
 
	
	

}



