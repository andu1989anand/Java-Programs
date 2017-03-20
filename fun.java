//User defined function:

class fun
{	
	int a;
	float b;
	String c;
	double d;
	
	public fun()
	{
		a=100;
		b=89f;
		c="atmece cse";
		d=34.98877666665555566555;
		
	}
	
	public void display()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
	
	public static void main(String [] args)
	{
	fun c=new fun();
		
	c.display();
	}
	}
/*
OUTPUT:
		a=100;
		b=89;
		c="atmece cse";
		d=34.98877666665555566555;
    */
