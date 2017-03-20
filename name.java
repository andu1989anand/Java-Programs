//Reading name and age from keyboard:
import java.util.Scanner;
class name
{
	public static void main(String [] args)
	{
		String name;
		int age;
		Scanner s=new Scanner(System.in);
System.out.println("Enter your name:");
		name=s.nextLine();
System.out.println("Enter your age:");
		age=s.nextInt();
System.out.println("HAI "+name+", you are "+age+" years old");
	}
}
/*
OUTPUT:
Enter your name:
kumar
Enter your age:
30
HAI kumar, you are 30 years old
*/
