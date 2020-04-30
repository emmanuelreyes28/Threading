
public class Week6
{

	public static void main(String[] args)
	{
		/*MyThread t = new MyThread();
		t.start();
		MyThread t2 = new MyThread();
		t2.start();*/
		
	/*	RunnableExample r1 = new RunnableExample("r1");
		RunnableExample r2 = new RunnableExample("r2");
		RunnableExample r3 = new RunnableExample("r3");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();*/
		
		Bank b = new Bank();
		RunnableExample r1 = new RunnableExample("r1", b);
		RunnableExample r2 = new RunnableExample("r2", b);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		try{
			Thread.sleep(5000);
		} catch(InterruptedException e){}
		System.out.println(b.getBalance()); // !=$20,000
		
		

	}

}
