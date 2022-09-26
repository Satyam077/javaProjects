package com.lab9;

public class MyThread extends Thread {
	public void run() {
		int n=10;
		
		System.out.println("Odd numbers are: ");
		for(int i = 1; i <= n; i = i + 2)
	
		{
			
			System.out.println(" "+i); 
		}
	}
	public void run1()
	{
		int n=10;
		

		System.out.println("Even Numbers are:"); 
	
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(" "+i);
			}
		}	
	}

	public static void main(String[] args) {
		try {
			MyThread t1=new MyThread();
			t1.run();
			t1.sleep(3000);
			t1.run1();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		 
		
				

	}

}
