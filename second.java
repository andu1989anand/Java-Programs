class first{
	
	int a;
	int b;
	
	first()
	{
		
	}
 first(int x,int y)
	{
		a=x;
		b=y;
	}
	
	void show()
	{
    System.out.println("a="+a+"    b="+b);
	}
}

public class second
{
public static void main(String []args) {

		first fobj=new first(22,33);
		fobj.show();
	}
	
}
//OUTPUT:
//a=22    b=33
