package Employer;
import java.util.Scanner;
public class Producer {
	Scanner s=new Scanner(System.in);
	Scanner r=new Scanner(System.in);
protected String Name;
protected String address;
protected String Phone_number;
protected float salary;
protected float hoursworked;
protected float budget;
public Producer()
{ }
public Producer(String Name,String address,String Phone_number,float salary,float hoursworked,float budget)
{
	this.Name=Name;
	this.address=address;
	this.Phone_number=Phone_number;
	this.salary=salary;
	this.hoursworked=hoursworked;
	this.budget=budget;
}
public void getdata()
{
	System.out.print("Enter Name: ");
	Name=s.next();
	System.out.print("Enter address: ");
	address=s.next();
	System.out.print("Enter Phone_number: ");
	Phone_number=s.next();
	System.out.print("Enter salary: ");
	salary=r.nextFloat();
	System.out.print("Enter hoursworked: ");
	hoursworked=r.nextFloat();
	System.out.print("Enter budget: ");
	budget=r.nextFloat();
}
public void displaydata()
{
	System.out.println("\nName: "+Name);
	System.out.println("address: "+address);
	System.out.println("Phone_number: "+Phone_number);
	System.out.println("salary: "+salary);
	System.out.println("hoursworked: "+hoursworked);
	System.out.println("budget: "+budget);
}
}
