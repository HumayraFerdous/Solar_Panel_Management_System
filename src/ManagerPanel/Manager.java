package ManagerPanel;
import java.util.*;
public class Manager {
	protected String name;
	Scanner s=new Scanner(System.in);
	Scanner p=new Scanner(System.in);
	protected int age;
	protected String Phone_number;
	protected float Salary;
	public Manager()
	{ }
	public Manager(String name,int age,String Phone_number,float Salary)
	{
		this.name=name;
		this.age=age;
		this.Phone_number=Phone_number;
		this.Salary=Salary;
	}
	public void getData()
	{
	System.out.print("Enter New Manager name: ");
	name=s.next();
	System.out.print("Enter Age: ");
	age=p.nextInt();
	System.out.print("Enter Phone Number: ");
	Phone_number=p.next();
	System.out.print("Enter Salary: ");
	Salary=s.nextFloat();
	}
	public void DisplayData()
	{
		System.out.println("\nNew Manager Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Phone_number: "+Phone_number);
		System.out.println("Salary: " +Salary);
		System.out.println();
	}
	
	
}
