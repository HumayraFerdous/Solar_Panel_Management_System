package Public;
import java.util.*;
public class Viewer {
protected int auth_no;
protected String date;
Scanner t=new Scanner(System.in);
public Viewer()
{ }
public Viewer(int auth_no,String date)
{
	this.auth_no=auth_no;
	this.date=date;
}
public void getdata()
{
	System.out.print("Enter Authentication Number: ");
	auth_no=t.nextInt();
	System.out.print("Enter Date of Authentication: ");
	date=t.next();
}
public void viewdata()
{
	System.out.println("\nAuthentication done by: "+auth_no);
	System.out.println("Authentication Date: "+date);
}
}
