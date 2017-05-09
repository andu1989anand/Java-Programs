class m
{
	
	int val;
	boolean f=false;
	
	synchronized void put(int v) 
	{
		if(f)
			try {
				wait();
			} 
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("interrupted exception");
			}
		
		val=v;
		f=true;
		System.out.println("producer producing: "+val);
		notify();
					
	}
	

	synchronized int get() 
	{
		if(!f)
			try {
				wait();
			} 
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("interrupted exception");
			}
		System.out.println("consumer consuming: "+val);
		f=false;
		notify();
		return val;
			
	}
}

class producer extends Thread
{
	m m1;
	producer(m x)
	{
		m1=x;
	}
	public void run()
	{
		for (int i=0;i<10;i++)
			m1.put(i);
	}
	
}
class consumer extends Thread
{
	m m1;
	consumer(m x)
	{
		m1=x;
	}
	public void run()
	{
		for (int i=0;i<10;i++)
			m1.get();
	}
	
}


public  class interthread {

	
	public static void main(String[] args) {
		m obj=new m();
		producer p=new producer(obj);
		consumer c=new consumer(obj);
		p.start();
		c.start();
	}
}

/*OUTPUT

producer producing: 0
consumer consuming: 0
producer producing: 1
consumer consuming: 1
producer producing: 2
consumer consuming: 2
producer producing: 3
consumer consuming: 3
producer producing: 4
consumer consuming: 4
producer producing: 5
consumer consuming: 5
producer producing: 6
consumer consuming: 6
producer producing: 7
consumer consuming: 7
producer producing: 8
consumer consuming: 8
producer producing: 9
consumer consuming: 9
*/


