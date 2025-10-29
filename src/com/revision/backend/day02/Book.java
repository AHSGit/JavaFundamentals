package com.revision.backend.day02;

public class Book {

	// Encapsulation of data members with private access modifiers
	private String title;
	private String author;
	private int pages;
	private Genre genre;
	
	// Default constructor
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.pages = 0;
		this.genre = Genre.OTHER;
	}
	
	// Overloaded parameterized constructor : 3 parameters
	public Book(String title, String author, int pages) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPages(pages);
		setGenre(null);
	}
	
	// Overloaded parameterized constructor : all parameters
	public Book(String title, String author, int pages, Genre genre) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPages(pages);
		this.setGenre(genre); 
	}
	
	// Getters and setters : controlled access to private fields
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = (genre != null) ? genre : Genre.OTHER;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = (title != null && !title.trim().isBlank()) ? title : "Unknown";
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = (author != null && !author.trim().isBlank()) ? author : "Unknown";
	}

	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		if(pages > 0)
			this.pages = pages;
		else {
			throw new IllegalArgumentException("\nError creating book \'" + this.title + "\': Page count must be greter than 0");
		}		
	}
	
	// Method overloading : no parameters
	public void displayInfo() {
		System.out.println("\nTitle: " + title + "\nAuthor: " + author + "\nPages: " + pages + "\nGenre: " + genre);
	}
	
	// Method overloading : parameterized
	public void displayInfo(boolean showPages) {
		if(showPages)
			System.out.println("\nTitle: " + title + ", Author: " + author + ", Pages: " + pages);
		else displayInfo();
	}
}
