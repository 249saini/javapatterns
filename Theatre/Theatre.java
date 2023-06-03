package com.jsp.Theatre;

public class Theatre {
	private String theatre_name;
	private int seating_capacity;
	
	
//ticket
	private Ticket ticket;
	
	//constructor
	public Theatre(String theatre_name, int seating_capacity) {
	this.theatre_name=theatre_name;
	this.seating_capacity=seating_capacity;
	
	}
	//public geeter setter

	public String getTheatre_name() {
		return theatre_name;
	}

	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}

	public int getSeating_capacity() {
		return seating_capacity;
	}

	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	//functionalities
public void bookTicket() {
	if(ticket.getNo_of_tickets()!=0 &&  ticket.getNo_of_tickets()<= seating_capacity) {
		seating_capacity=seating_capacity-ticket.getNo_of_tickets();
		System.out.println("your Booking of" + ticket.getNo_of_tickets()+ "has been booked");
 	}else {
 		System.out.println("Booking not successful");
	}
}
	
	//check Availability
public void checkAvailability() {
	System.out.println(seating_capacity);
	}
	
//cancel
public void cancelTicket(int cancel_tickets) {
	if(cancel_tickets!=0 && cancel_tickets<=ticket.getNo_of_tickets()) {
		ticket.setNo_of_tickets(ticket.getNo_of_tickets()-cancel_tickets);
		System.out.println("Ticket cancelled");
	}
	
}
  public void showTicketDetails() {
	  System.out.println("your ticket Details are as followa");
	  System.out.println("ticket.getMovie_name");
	  System.out.println("ticket.getNo_of_tickets()");
  }

}












