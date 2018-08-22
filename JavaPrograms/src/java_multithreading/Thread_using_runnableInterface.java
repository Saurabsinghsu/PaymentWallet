package java_multithreading;

public class Thread_using_runnableInterface implements Runnable {

	@Override
	public void run() 
	{
		
		for(int i=0; i<10; i++)
		{
			System.out.println("From Thread "+Thread.currentThread().getName()+" prints  "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Thread_using_runnableInterface obj = new Thread_using_runnableInterface();
		Thread t1 = new Thread(obj);
		t1.start();
		
		Thread t2 = new Thread(new Thread_using_runnableInterface());
		t2.start();
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				for (char ch = 'a'; ch <= 'z'; ch++)
			         System.out.println("Thread t3 "+ch);
			}
		});
		t3.start();
	}

}
