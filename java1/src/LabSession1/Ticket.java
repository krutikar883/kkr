package LabSession1;
import java.util.Scanner;
public class Ticket {
	private int ticketid;
    private int price;
    private static int availableTickets;
    public int getTicketid()
    {
        return ticketid;
    }

    public void setTicketid(int ticketid)
    {
        this.ticketid = ticketid;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public static int getAvailableTickets() 
    {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets >= 0) {
            Ticket.availableTickets = availableTickets;
        }
    }
    
    public int calculateTicketCost(int noOfTickets)
    {
        if (noOfTickets <= availableTickets)
        {
            availableTickets -= noOfTickets;
            return noOfTickets * price;
        }
        else 
        {
            return -1;
        }
    }


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int numBookings = sc.nextInt();

        System.out.print("Enter the available tickets: ");
        int availableTickets = sc.nextInt();

        
	}

}
