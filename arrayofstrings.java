//Array of STRINGS

import java.util.Scanner;

class arrayofstrings
{	
	public static void main(String [] args)
	{
		
Scanner s=new Scanner(System.in);
System.out.println("enter array size:");
		int n=s.nextInt();
		s.nextLine();
    
String  a[] =new String[n];
System.out.println("enter array elements:");
		for(int i=0;i<n;i++)
		a[i]=s.nextLine();
		
System.out.println("enter array elements:");
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
	}
}

/*
OUTPUT:
enter array size:
5
enter array elements:
atmece
mysore
computer science
ananda
kumar

entered array elements:
atmece
mysore
computer science
ananda
kumar
*/
