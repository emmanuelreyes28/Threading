
public class RunnableExample implements Runnable
{
	private String id;
	private Bank b;
	public RunnableExample(String id, Bank b){
		this.id = id;
		this.b = b;
	}
	
	public void run(){
		System.out.println("In thread " + id);
		for(int i = 0; i < 1000; i++){
			b.deposit(10);
		}
	}
/*	private String id;
	
	public RunnableExample(String id){
		this.id = id;
	}
	
	public void run(){
		int i = 0;
		Date now = null;
		try{
			while(true && !Thread.interrupted()){
				now = new Date();
				i++;
				if (i % 100000 == 0){
					System.out.println(now.toString() + i + ": " + Thread.sleep(1000));
				}
			}
		}catch (InterruptedException e){
			System.out.println(now.toString() + " Thread " + id + "interrupted");
		}
		while(true){
			i++;
			if(i % 100000 == 0){
				System.out.println(i + ": " + id);
			}
		}
	}
*/

}
