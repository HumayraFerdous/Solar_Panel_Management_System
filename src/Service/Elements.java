package Service;
import java.util.*;
import Service.Touser;
import Service.Topublic;
public class Elements {
	Touser a;
	Topublic b;
Scanner s=new Scanner(System.in);
protected int elementid;
int i=0,j=0;
public Elements()
{ }
public Elements(int elementid)
{
	this.elementid=elementid;
}
public void getId()
{
	System.out.print("Enter Element id: ");
	elementid=s.nextInt();
}
public void usercomp(Touser a)
{
	if(elementid==a.elementid)
		
		{
		System.out.println("\nMatched");
		a.displaydata();

		}	
	else 
		{
		i=0;
		System.out.println("\nNot matched!Such number does not exist");
		}
}
public void publiccomp(Topublic b)
{
	if(elementid==b.elementid)
		
		{
		System.out.println("\nMatched");
		b.displaydata();
		}
	else
		{
		j=0;
		System.out.println("\nNot matched!Such number does not exist");
		}
}
}

