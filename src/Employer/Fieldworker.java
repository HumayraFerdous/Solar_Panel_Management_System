package Employer;
import java.util.*;
public class Fieldworker {
	Scanner s=new Scanner(System.in);
	Scanner r=new Scanner(System.in);
protected String Name;
protected String address;
protected float salary;
protected float hoursworked;
public Fieldworker()
{ }
public Fieldworker(String Name,String address,float salary,float hoursworked)
{
	this.Name=Name;
	this.address=address;
	this.salary=salary;
	this.hoursworked=hoursworked;	
}
public void getdata()
{
	System.out.print("Enter Name: ");
	Name=s.next();
	System.out.print("Enter address: ");
	address=s.next();
	System.out.print("Enter salary: ");
	salary=r.nextFloat();
	System.out.print("Enter hoursworked: ");
	hoursworked=r.nextFloat();
}
public void displaydata()
{
	System.out.println("\nName: "+Name);
	System.out.println("address: "+address);
	System.out.println("salary: "+salary);
	System.out.println("hoursworked: "+hoursworked);
	System.out.println();
}
}
