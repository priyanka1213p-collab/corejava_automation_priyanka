package Multithreading;
 class thread_task{
	 synchronized void task(int n) {
		 for (int i = 0; i<=10;i++) {
			 
			 try {
				Thread.sleep(3000);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			 System.out.println(n*i);
			 
			 
		 } 
			 	 			 
	 }
 }
 
 class thread_1  extends Thread{
	 thread_task thread_task;
	 public thread_1 (thread_task thread_task) {
		 this.thread_task = thread_task;
		 
	 }
	 public void run() {
		 thread_task.task(5);
	 }
 }

 
 class thread_2 extends Thread{
	 thread_task thread_task;
	 public thread_2(thread_task thread_task) {
		 this.thread_task = thread_task;
		 
	 }
	 
	 public void run() {
		 thread_task.task(2);
	 }
 }




public class multithread_task {
public static void main(String[] args) {
	thread_task thread_task = new thread_task();
	thread_1 th1 = new thread_1 (thread_task );
	thread_2 th2 = new thread_2 (thread_task) ;
	th1.start();
	th2.start();

	
	
}

}
