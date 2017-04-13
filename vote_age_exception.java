import java.util.Scanner;


public class err {

	int age;
	
	void show ()
	{
					if(age<18)
				throw new ArithmeticException("Your are not allowed to vote");
			else
				System.out.println("You are allowed to vote");
		
		}
	
	
	public static void main(String[] args) {
	
		err r=new err();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age:");
		r.age=s.nextInt();
		try{
		r.show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
/* OUTPUT:

enter your age:
12
java.lang.ArithmeticException: Your are not allowed to vote


enter your age:
24
You are allowed to vote
*/
