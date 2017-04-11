
public class error {
	
	public static void main(String[] args) {
	int a=1000;
	int b=10;
	int x[]=new int[10];
	System.out.println("atmece-inside main");
	
	try
	{
	System.out.println("atmece-outer try block p1");

	try{
		System.out.println("atmece-inner try block");
		System.out.println(a/(b-b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("inner-DIVIDE BY ZERO ERROR  "+e);
		}
	finally
	{
		System.out.println("inner-FINALLY BLOCK");
	}
	System.out.println("atmece-outer try block p2");
	
	for(int i=0;i<15;i++)
	{
		x[i]=i;
	System.out.println(x[i]);
	}
	
	}

	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ARRAY INDEX ERROR  " +e);
	}
	catch(ArithmeticException e)
	{
		System.out.println("outer-DIVIDE BY ZERO ERROR  "+e);
	}
	
		catch(Exception e)
	{
		System.out.println("GENERAL ERROR  "+e);
	}
	finally
	{
		System.out.println("outer-FINALLY BLOCK");
	}
	
	
	System.out.println("atmece2");
	System.out.println("atmece3");
	System.out.println("atmece4");
	}

}


/* OUTPUT

atmece-inside main
atmece-outer try block p1
atmece-inner try block
inner-DIVIDE BY ZERO ERROR  java.lang.ArithmeticException: / by zero
inner-FINALLY BLOCK
atmece-outer try block p2
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
ARRAY INDEX ERROR  java.lang.ArrayIndexOutOfBoundsException: 10
outer-FINALLY BLOCK
atmece2
atmece3
atmece4
*/
