package com.jsp.design;

public class BookDriver {
	
	public static void main(String[] args) {
		Book b1=new Book("Krishna","methology",500);
	    b1.setAuthor(new Author("Jay","jay12@gmail.com","810886989l"));
		b1.getAuthor().setAddress(new Address("Vashi","Mumbai","Maharashtra"));
		b1.printbookDetails();

}
}