package Main;
import java.util.*;
import Main.Balance;
import Employer.Accountant;
import Employer.Fieldworker;
import Employer.Producer;
import ManagerPanel.Admin;
import ManagerPanel.Manager;
import Public.User;
import Public.Viewer;
import Service.Elements;
import Service.Topublic;
import Service.Touser;
public class Control {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try
		{
		 System.out.print("\n           SOLAR PANEL MANAGEMENT AND DISTRIBUTION SYSTEM      \n");
		    System.out.print("          --------------------------------------------------------    \n\n");
		    int choose1,choose2,choose3;
		    Fieldworker f=new Fieldworker("Shushanto","Jatrabri,Dhaka",15000,6);
		    Producer p=new Producer("Sinthia","Baridhara","7789123",60000,6,15000);
		    Accountant ac=new Accountant("Basir","Mirpur","990123",45000,6);
		    Topublic top=new Topublic(5,12,"Good",220,6,"Mirpur");
		    Touser tou=new Touser(1,23,"Excellent",220,6,1234);
		    User u1=new User(23,"234",2344);
		    Viewer v1=new Viewer(12,"23/1/2018");
		    Elements E1=new Elements(22);
		    Balance b1=new Balance(100000,2000,50000);
		    Manager m1=new Manager("Nurul Islam Nahid",55,"962345",100000);
		    Admin a1=new Admin("123456");
		    Admin a2=new Admin();
		    do
		    {
		        System.out.print("\n******** Main Menu *******\n\n");
		        System.out.print("\t1.Admin-mode\n");
		        System.out.print("\t2.Manager-mode\n");
		        System.out.print("\t3.Producer-mode\n");
		        System.out.print("\t4.Accountant\n");
		        System.out.print("\t5.Fieldworker\n");
		        System.out.print("\t6.Elements for Public\n");
		        System.out.print("\t7.Elements for User\n");
		        System.out.print("\t8.User-mode\n");
		        System.out.print("\t9.Income of Company\n");
		        System.out.print("\t10.Exit\n");
		        System.out.print("\n**************************\n");
		        System.out.print("\nEnter your choice: ");
		        choose1=s.nextInt();
		        if(choose1==1)
		        {
		        	System.out.println();
		        	a2.getId();
		        	a2.displayId();
		        	int i=a1.compto(a2);
		            if(i==0)
		              { 
		            	System.out.print("\n    ----------------");
		                System.out.print("\n\tLogged in");
		                System.out.print("\n    ----------------\n\n");
		                do
		                {
		                	System.out.print("\n........ADMINISTRATOR MENU......\n\n");
		                	System.out.println("1.View Accountant");
		                	System.out.println("2.View Fieldworker");
		                	System.out.println("3.View Producer");
		                	System.out.println("4.View Manager");
		                	System.out.println("5.View User");
		                	System.out.println("6.View Service to user");
		                	System.out.println("7.View Service for public");
		                	System.out.println("8.Check for Balance");
		                	System.out.print("\nEnter your choice: ");
		    		        choose2=s.nextInt();
		    		        if(choose2==1)
		    		        {
		    		        	
		    		        	ac.displaydata();
		    		        }
		    		        else if(choose2==2)
		    		        {
		    		        	f.displaydata();
		    		        }
		    		        else if(choose2==3)
		    		        {
		    		        	p.displaydata();
		    		        }
		    		        else if(choose2==4)
		    		        {
		    		        	m1.DisplayData();
		    		        }
		    		        else if(choose2==5)
		    		        {
		    		        	u1.displaydata();
		    		        }
		    		        else if(choose2==6)
		    		        {
		    		        	tou.displaydata();
		    		        }
		    		        else if(choose2==7)
		    		        {
		    		        	top.displaydata();
		    		        }
		    		        else if(choose2==8)
		    		        {
		    		        	b1.displaydata();
		    		        }

		                	
		                }while(choose2<9);
		              }
		            else
		            {
		            	System.out.print("\n    -------------------------------");
		                System.out.print("\n\tOOPS!!! "+"Wrong password!!!");
		                System.out.print("\n    -------------------------------\n\n");
		            }
		        }
		        else if(choose1==2)
		        {
		        	System.out.print("\n........MANAGER MENU......\n\n");
		        	Manager m2=new Manager();
		        	m2.getData();
		        	System.out.println("\nSample Example for Manager");
		        	m1.DisplayData();
		        	m2.DisplayData();
		        }
		        else if(choose1==3)
		        {
		        	System.out.print("\n........PRODUCER MENU......\n\n");
		        	Producer p2=new Producer();
		        	p2.getdata();
		        	System.out.println("\nSample Example for Producer");
		        	p.displaydata();
		        	p2.displaydata();
		        }
		        else if(choose1==4)
		        {
		        	System.out.print("\n........ACCOUNTANT MENU......\n\n");
		        	Accountant ac2=new Accountant();
		        	ac2.getdata();
		        	System.out.println("\nSample Example for Accountant");
		        	ac.displaydata();
		        	ac2.displaydata();   	
		        }
		        else if(choose1==5)
		        {
		        	System.out.print("\n........FIELDWORKER......\n\n");
		        	Fieldworker f2=new Fieldworker();
		        	f2.getdata();
		        	System.out.println("\nSample Example for Fieldworker");
		        	f.displaydata();
		        	f2.displaydata();
		        }
		        else if(choose1==6)
		        {
		        	System.out.print("\n........SERVICE FOR PUBLIC......\n\n");
		        	Topublic top1=new Topublic();
		        	top1.getdata();
		        	System.out.println("\nSample Example for Public Service");
		        	top.displaydata();
		        	E1.publiccomp(top1);	
		        }
		        else if(choose1==7)
		        {
		        	System.out.print("\n........SERVICE TO USER......\n\n");
		        	Touser tou1=new Touser();
		        	tou1.getdata();
		        	System.out.println("\nSample Example for Individual Service");
		        	tou.displaydata();
		            E1.usercomp(tou1);
		        }
		        else if(choose1==8)
		        {
		        	System.out.print("\n........USER-MODE......\n\n");
		        	System.out.println("\t1.User");
		        	System.out.println("\t2.Viewer");
		        	System.out.print("\nEnter Choice: ");
		        	choose3=s.nextInt();
		        	if(choose3==1)
		        	{
		            User u2=new User();
		        	u2.getData();
		        	System.out.println("\nSample Example for User");
		        	u1.displaydata();
		        	u2.displaydata();
		        	}
		        	else if(choose3==2)
		        	{
		        		Viewer v2=new Viewer();
		        		v2.getdata();
		        		System.out.println("\nSample Example for Viewer");
		        		v1.viewdata();
		        		v2.viewdata();
		        	}
		        }
		        else if(choose1==9)
		        {
		        	System.out.print("\n........Income of Company......\n\n");
		        	Balance b2=new Balance();
		        	b2.getdata();
		        	System.out.println("\nSample Example of Income");
		        	b1.displaydata();
		        	b2.displaydata();
		        }
         if(choose1==10)
        	 {
        	 System.out.print("--------------------------------");
        	 System.out.print("\n--------------------------------");
        	 System.out.println("\n\tProgram Terminated\n");
              break;
        	 }
	} while(choose1<10);
}
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    }
}
}
		
