package busreservation;

public class BUS {
	private int busno;
	private boolean ac;
	private int capacity; 
	BUS (int no,boolean AC,int cap)
	{
		busno=no;
		ac=AC;
		capacity=cap;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public void setcapacity(int a)
	{
		capacity=a;
	}
	public int getbusno()
	{
		return busno;
	}
	public void setbusno(int a)
	{
		busno=a;
	}
	public boolean getac()
	{
		return ac;
	}
	public void setac(boolean a)
	{
		ac=a;
	}
	public void displaybusinfo()
	{
		System.out.println("BUS NO: " + busno + " AC: " + ac + " BUS CAPACITY: " + capacity);
	}
	
	

}
