package com.jsp.design;

public class Book {
private String book_name;
private String genre;
private double price;

 private Author author;
 //constructor
 public Book(String book_name,String genre,double price) {
	 this.book_name=book_name;
	 this.genre=genre;
	 this.price=price;
	 }
 //getter setter 
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
 //print book details
public void printbookDetails(){
	System.out.println("=========Book===========");
	System.out.println(book_name);
	System.out.println(genre);
	System.out.println(price);
if(author!=null) {
	author.printAuthorDetails();
	}else
	{
		System.out.println("Author details are missing");
	}
}
	
}


