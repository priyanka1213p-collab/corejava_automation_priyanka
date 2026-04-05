
package Multithreading;

public class Thread_1 extends Thread
{
	
	public void run() {
		
		//print 1 to 10 
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
		
	}
	
public static void main(String[] args) throws InterruptedException  {
	Thread_1 th=new Thread_1();
	//th.setName("forloop_task");

	th.start();
	th.join();
	Thread_1 th1=new Thread_1();
	
	th1.start();
	th1.join();
	
	Thread_1 th2=new Thread_1();
	
	th2.start();
	th.join();
}
}

