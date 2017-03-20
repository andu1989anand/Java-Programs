//Reading two numbers and adding: 

import java.util.Scanner;

class sum
{
public static void main(String [] args)
	{
		int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter a and b values:");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
System.out.println(a+"+"+b+"="+c);
	}
}

/*
OUTPUT:
Enter a and b values:
871
232
871+232=1103
*/
