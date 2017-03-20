//Parameterized Constructor:

class pconst
{	
	int a;
	float b;
	String c;
	double d;
	
public pconst(int x,float y,String s,double z)
	{
		a=x;
		b=y;
		c=s;
		d=z;
		
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
pconst c=new pconst(899,33,"atmece mys",543.4543);
		
	c.display();
	}
}

/*
OUTPUT:
a=899
b=33.0
c=atmece mys
d=543.4543
*/
