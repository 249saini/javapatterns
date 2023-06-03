package com.jsp.Theatre;
import java.util.Scanner;

public class BoxOffice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theatre theatre = new Theatre("INOX",500);
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1. Availability Status");
			System.out.println("Enter 2. Book your Ticket");
			System.out.println("Enter 3. Show booking details");
			System.out.println("Enter 4. Cancek Ticket");
			System.out.println("Enter 5. Exit");
			
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					theatre.checkAvailability();
				}break;
				case 2:{
					System.out.println("Enter the numberof seats");
					int seats = sc.nextInt();
					System.out.println("Enter movie name");
					String movie = sc.next();
					theatre.setTicket(new Ticket(movie,seats));
					theatre.bookTicket();
					}break;
				case 3:
					
				{
					theatre.showTicketDetails();
				}break;
				case 4:{
					System.out.println("Enter number");
					int cancel=sc.nextInt();
					theatre.cancelTicket(cancel);
				}break;
				case 5:
				{
					System.out.println("Thank You");
					flag = false;
				}break;
				default :{
					System.out.println("wrong input");
				}
		}
		}
	}
}



