//Program to show Array of objects:

import java.util.Scanner;

class emplo
{
	String name;
	int usn;
	
	public emplo()
	{
		Scanner s=new Scanner(System.in);
System.out.println("Enter student name:");
		name=s.nextLine();
		
System.out.println("Enter student usn:");
		usn=s.nextInt();
	}
	
	public void printinfo()
	{
		System.out.println(name+"\t"+usn);
	}
	public static void main(String [] args)
	{		
		Scanner s=new Scanner(System.in);
System.out.println("Enter total number of students:");
		int n=s.nextInt();
		
		emplo e[]=new emplo[n];
		
System.out.println("Enter student details:");
		for(int i=0;i<n;i++)
		e[i]=new emplo();
		
System.out.println("entered details are:");
		System.out.println("--------------------");
System.out.println("Name\tUSN");
System.out.println("--------------------");
		for(int i=0;i<n;i++)
		e[i].printinfo();	
System.out.println("--------------------");
	}

}

/*
OUTPUT:

Enter total number of students:
3
Enter student details:
Enter student name:
raghav
Enter student usn:
111
Enter student name:
prabhu
Enter student usn:
222
Enter student name:
yashas
Enter student usn:
333
entered details are:
--------------------
Name	USN
--------------------
raghav	111
prabhu	222
yashas	333
--------------------
*/
