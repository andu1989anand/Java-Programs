//Array in java

import java.util.Scanner;

class array
{	
public static void main(String [] args)
	{
Scanner s=new Scanner(System.in);

System.out.println("enter array size:");
	int n=s.nextInt();
	int  a[] =new int[n];
		
System.out.println("enter array elements:");
	for(int i=0;i<n;i++)
	a[i]=s.nextInt();

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
11
22
33
44
55
entered array elements:
11
22
33
44
55
*/
