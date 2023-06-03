package com.jsp.Theatre;

public class Ticket {
	
	private String movie_name;
	private int no_of_tickets;
	
	public Ticket() {
		System.out.println("Ticket booking under progress...");
		
	}
	//constructor
	public Ticket(String movie_name, int no_of_tickets) {
		this.movie_name=movie_name;
		this.no_of_tickets=no_of_tickets;
		}
	//publlic getter and seeters
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getNo_of_tickets() {
		return no_of_tickets;
	}
	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	
	//to print ticket details
	public void printTicketDetails() {
		System.out.println("=======Ticket=======");
		System.out.println(movie_name);
		System.out.println(no_of_tickets + "booked");
		
	}

}
