package Public;
import java.util.*;
public class User {
	 protected int userId;
	 protected String pass;
	 protected float balance;
	  Scanner s=new Scanner(System.in);
	  Scanner p=new Scanner(System.in);
	  public User()
	  { };
	  public User(int userId,String pass,float balance)
	  {
	    this.userId=userId;
	    this.pass=pass;
	    this.balance=balance;
	  }
	  public void getData()
	  { 
		  System.out.print("Enter Userid: ");
		  userId=p.nextInt();
		  System.out.println("Enter Password: ");
		  pass=s.next();
		  System.out.println("Enter Balance: ");
		  balance=p.nextFloat();
		  
	  }
	  public void displaydata()
	  {
		  System.out.println("\nUserId: "+userId);
		    System.out.print("Pass: ");
		    int l;
		    for(l=0;l<pass.length();l++)
		    {
		      System.out.print("*");
		    }
		    System.out.println();
		  
	  System.out.println("Balance: "+balance);
	  System.out.println();
	  }
}
