
 class t1 extends Thread {

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.print(Thread.currentThread());
			System.out.println(i);
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
	
	class t2 extends Thread
	{
		public void run()
		{
			for(int i=11;i<=20;i++)
			{
				System.out.print(Thread.currentThread());
				System.out.println(i);
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
		public class multithread{
		
public	static void main(String[] args) {
		
		t1 d1=new t1();
		t2 d2=new t2();
		d1.start();
		d2.start();
	
	}
	}
/* OUTPUT

Thread[Thread-0,5,main]0
Thread[Thread-1,5,main]11
Thread[Thread-0,5,main]1
Thread[Thread-0,5,main]2
Thread[Thread-1,5,main]12
Thread[Thread-0,5,main]3
Thread[Thread-1,5,main]13
Thread[Thread-0,5,main]4
Thread[Thread-0,5,main]5
Thread[Thread-1,5,main]14
Thread[Thread-0,5,main]6
Thread[Thread-0,5,main]7
Thread[Thread-1,5,main]15
Thread[Thread-0,5,main]8
Thread[Thread-0,5,main]9
Thread[Thread-1,5,main]16
Thread[Thread-0,5,main]10
Thread[Thread-1,5,main]17
Thread[Thread-1,5,main]18
Thread[Thread-1,5,main]19
Thread[Thread-1,5,main]20
*/
