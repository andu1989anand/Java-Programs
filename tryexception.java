
public class error {
	
	public static void main(String[] args) {
	int a=1000;
	int b=10;
	int x[]=new int[13];
	System.out.println("atmece0");
	
	try
	{
	System.out.println("atmece1");
	
	for(int i=0;i<15;i++)
	{
		x[i]=i;
	System.out.println(x[i]);
	if(i==10)
		throw new Exception("Maximum limit crossed");
	}
	
	}

	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ARRAY INDEX ERROR  " +e);
	}
	catch(ArithmeticException e)
	{
		System.out.println("DIVIDE BY ZERO ERROR  "+e);
	}
	
		catch(Exception e)
	{
		System.out.println("GENERAL ERROR  "+e);
	}
	finally
	{
		System.out.println("IN FINALLY BLOCK");
	}
	try{
	System.out.println(a/(b-b));
	}
	catch(ArithmeticException e)
	{
		System.out.println("DIVIDE BY ZERO ERROR  "+e);
	}
	
	System.out.println("atmece2");
	System.out.println("atmece3");
	System.out.println("atmece4");
	}

}


/* OUTPUT:

atmece0
atmece1
0
1
2
3
4
5
6
7
8
9
10
GENERAL ERROR  java.lang.Exception: Maximum limit crossed
IN FINALLY BLOCK
DIVIDE BY ZERO ERROR  java.lang.ArithmeticException: / by zero
atmece2
atmece3
atmece4
*/
