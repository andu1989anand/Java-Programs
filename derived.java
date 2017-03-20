//Calling Base Class construcotr from derived class using Super

 class base {
	
	int m;
	int n;
	
	base()
	{
		
	}
 base(int x,int y)
	{
		m=x;
		n=y;
	}
	
	void show()
	{
		System.out.println("m="+m+"    n="+n);
	}
}

public class derived extends base{
	
	derived()
	{
		super(11,2222);
	}
		public static void main(String []args) {

		derived dobj=new derived();
		dobj.show();
	}
}

//OUTPUT:
//m=11    n=2222
