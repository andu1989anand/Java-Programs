
class table
{
	
	 synchronized void display(int m)
	{
	for(int i=1;i<=10;i++)
	{
		System.out.print(Thread.currentThread());
		System.out.println(m+" X "+i+" = "+i*m);
	}
	}
}




class x1 extends Thread {

	table t1;
	
	x1(table t)
	{
		t1=t;
	}
	public void run()
	{
		t1.display(2);
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
	
	class x2 extends Thread
	{
		table t2;
		x2(table t)
		{
			t2=t;
		}
		public void run()
		{
			t2.display(100);
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
		public class sync{
		
public	static void main(String[] args) {
		
	table x=new table();
	x1 d1=new x1(x);		
		x2 d2=new x2(x);
		d1.start();
		d2.start();
	
	}
	}
/* OUTPUT

Thread[Thread-0,5,main]2 X 1 = 2
Thread[Thread-0,5,main]2 X 2 = 4
Thread[Thread-0,5,main]2 X 3 = 6
Thread[Thread-0,5,main]2 X 4 = 8
Thread[Thread-0,5,main]2 X 5 = 10
Thread[Thread-0,5,main]2 X 6 = 12
Thread[Thread-0,5,main]2 X 7 = 14
Thread[Thread-0,5,main]2 X 8 = 16
Thread[Thread-0,5,main]2 X 9 = 18
Thread[Thread-0,5,main]2 X 10 = 20
Thread[Thread-1,5,main]100 X 1 = 100
Thread[Thread-1,5,main]100 X 2 = 200
Thread[Thread-1,5,main]100 X 3 = 300
Thread[Thread-1,5,main]100 X 4 = 400
Thread[Thread-1,5,main]100 X 5 = 500
Thread[Thread-1,5,main]100 X 6 = 600
Thread[Thread-1,5,main]100 X 7 = 700
Thread[Thread-1,5,main]100 X 8 = 800
Thread[Thread-1,5,main]100 X 9 = 900
Thread[Thread-1,5,main]100 X 10 = 1000
*/
