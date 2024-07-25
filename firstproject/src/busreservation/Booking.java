package busreservation;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Booking {
	String passengername;
	int  busno;
	Date date;
	Booking()
	{
		System.out.println("Enter the name of the passenger: ");
		Scanner scanner=new Scanner(System.in);
		passengername=scanner.next();
		System.out.println("Enter BUS NO: ");
		busno=scanner.nextInt();
		System.out.println("Enter the DATE (format like DD-MM-YYYY)  of your travel: ");
		String dateinput=scanner.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
			try {
				date=dateformat.parse(dateinput);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
	}
		
		boolean available(ArrayList<Booking> a,ArrayList<BUS> b)
		{
			int capacity=0;
			for(BUS i: b)
			{
				if(i.getbusno()==busno)
				{
					capacity=i.getcapacity();
				}
			}
				int booked = 0;
				for( Booking j:a)
				{
					if(j.busno == busno && j.date.equals(date))
					{
					booked++;
					}
				}
				return booked<capacity?true:false;
			
		}
		
		
		
		
		
		
	}
	


