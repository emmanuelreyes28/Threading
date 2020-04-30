
public class MyThread extends Thread
{
	public void run(){
		//This is the code that will be executed on this thread...
		int i = 0;
		while(true){
			i++;
			if(i % 100000 == 0)
				System.out.println(i);
		}
	}
}
