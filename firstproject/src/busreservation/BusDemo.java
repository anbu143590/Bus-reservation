package busreservation;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
	public static void main(String[] args)
	{int useropt=1;
	ArrayList<BUS> buses = new ArrayList<BUS>();
	ArrayList<Booking> bookings=new ArrayList<Booking>();
	buses.add(new BUS(1,true,5) );
	buses.add(new BUS(2,false,50) );
	buses.add(new BUS(3,true,55) );
	Scanner scanner=new Scanner (System.in);
	
	for(BUS b:buses)
	{
	     b.displaybusinfo();
	}
	
		while(useropt==1)
		{ System.out.println("\n");
		 System.out.println("Enter 1 to Book and 2 to exit");
		 useropt=scanner.nextInt();
		 if(useropt==1)
		 {
			Booking booking = new Booking();
			if(booking.available(bookings,buses)==true)
			{
				bookings.add(booking);
				System.out.println("YOUR BOOKING IS CONFIRMED,KINDLY GIVE YOUR FEEDBACK AFTER TRAVEL: ");
			}
			else
			{   System.out.println("\n");
				System.out.println("SORRY,BUS IS FULL(WE ARE NOTIFIES YOU ,IF YOUR BUS AVAILABLE IN YOUR TRAVEL DATE)");	
			}
			
		  }
		   
		}
		
	}

}
