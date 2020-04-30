import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank
{
	//Create bank class that only handles deposits 
	private double totalBalance;
	private Lock balanceLock;
	
	public Bank(){
		totalBalance = 0;
		balanceLock = new ReentrantLock();}
	
	public void deposit (double amount){
		balanceLock.lock();
		totalBalance += amount;
		balanceLock.unlock();
	}
	
	public double getBalance(){
		return totalBalance;
	}
	

}
