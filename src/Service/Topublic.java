package Service;
import java.util.*;
public class Topublic {
	
		Scanner l=new Scanner(System.in);
		public int elementid;
		protected int quantity;
		protected String quality;
		protected int voltagelevel;
		protected int hoursserviced;
		protected String location;
		public Topublic()
		{ }
		public Topublic(int elementid,int quantity,String quality,int voltagelevel,int hoursserviced,String location)
		{
			this.elementid=elementid;
			this.quantity=quantity;
			this.quality=quality;
			this.voltagelevel=voltagelevel;
			this.hoursserviced=hoursserviced;
			this.location=location;
		}
		public void getdata()
		{
			System.out.print("Enter Element Id: ");
			elementid=l.nextInt();
			System.out.print("Enter Quantity: ");
			quantity=l.nextInt();
			System.out.print("Enter Quality: ");
			quality=l.next();
			System.out.print("Enter voltage level: ");
			voltagelevel=l.nextInt();
			System.out.print("Enter Hours Serviced: ");
			hoursserviced=l.nextInt();
			System.out.print("Enter Location: ");
			location=l.next();	
		}
		public void displaydata()
		{
			System.out.println("\nElement Id: "+elementid);
			System.out.println("Quantity: "+quantity);
			System.out.println("Quality: "+quality);
			System.out.println("Voltage_level: "+voltagelevel);
			System.out.println("Hours Serviced: "+hoursserviced);
			System.out.println("Location: "+location);
			System.out.println();
		}
	}


