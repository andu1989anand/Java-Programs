
public class outer {

	int a=100;
	 
	void dis()
	{
		inner in=new inner();
		in.dis();
	}
	
	class inner{
		
		void dis()
		{
			System.out.println("a value:"+a);
		}
	}
	
	
	public static void main(String[] args) {
		
		outer ot=new outer();
		ot.dis();

	}

}
