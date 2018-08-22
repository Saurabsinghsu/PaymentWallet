package java_multithreading;

public class Thread_using_Extend extends Thread 
{
	@Override
	public void run() 
	{
		int i;
		for(i=0; i<10; i++)
		{
			System.out.println("From Thread "+Thread.currentThread().getName()+" prints  "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String str[]) 
	{
		Thread_using_Extend t1 = new Thread_using_Extend();
		Thread_using_Extend t2 = new Thread_using_Extend();
		t1.start();
		t2.start();
	}
	
}
