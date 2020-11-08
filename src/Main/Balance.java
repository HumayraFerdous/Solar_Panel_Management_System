package Main;
import java.util.*;
public class Balance {
Scanner s=new Scanner(System.in);
protected float balance;
protected float cost;
protected float profit;
protected float loss;
protected float sponsoredfrom;
protected float calculation;
public Balance()
{ }
public Balance(float balance,float cost,float sponsoredfrom)
{
this.balance=balance;
this.cost=cost;
this.sponsoredfrom=sponsoredfrom;

}
public void getdata()
{
	System.out.print("Enter Total balance: ");
	balance=s.nextFloat();
	System.out.print("Enter cost: ");
	cost=s.nextFloat();
	System.out.print("Enter sponsoredfrom: ");
	sponsoredfrom=s.nextFloat();
}
public void displaydata()
{
	calculation=(balance+sponsoredfrom)-cost;
	if(calculation<=0 || calculation<balance)
		{
		loss=calculation;
	System.out.println("\nLoss of the project.And the company have to spend "+loss+"$ more money to evaluate success.");
		}
	else if(calculation>0 && calculation>balance)
	{
		profit=calculation;
		System.out.println("\nThe company makes a profit of: "+profit+"$");
	}
	else if(calculation==balance)
	{
		System.out.println("\nThe company neither losses nor makes profit!Its total balance is: "+calculation);
	}
	System.out.println();
}
}
