
public class error {
	
	public static void main(String[] args) {
	int a=1000;
	int b=10;
	System.out.println("atmece1");
	try
	{
	System.out.println(a/(b-b));
	}
	catch(ArithmeticException e)
	{
		System.out.println("DIVIDE BY ZERO ERROR  "+e);
	}
		catch(Exception e)
	{
		System.out.println("RUN TIME ERROR  ");
	}
	finally
	{
		System.out.println("ERROR");
	}
	System.out.println("atmece2");
	System.out.println("atmece3");
	System.out.println("atmece4");
	}

}
