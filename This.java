 //Program to demonstrate this keyword
 
 class b1{
	
	public int x,y;
	
	 b1(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	 void add()
	 {
		 	 System.out.println(x+y);
	 }
}
 
 

 class This{
	 
	 public static void main(String []args) {

		
		b1 bb=new b1(10,20);
		bb.add();
	}
	
}
