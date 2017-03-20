//Object creation and Default Constructor

class constru
{	
	int a;
	float b;
	String c;
	double d;
	
	public constru()
	{
		a=100;
		b=89.5f;
		c="atmece cse";
		d=34.98877666665555566555;
		
	}
	
	public static void main(String [] args)
	{
	constru c=new constru();
		
	System.out.println("a="+c.a);
	System.out.println("b="+c.b);
	System.out.println("c="+c.c);
	System.out.println("d="+c.d);
	
	}
}


OUTPUT:
a=100
b=89.5
c=atmece cse
d=34.98877666665555
