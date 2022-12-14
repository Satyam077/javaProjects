package com.lab9;
	
class ThreadSupply
{
	int availableProduct=30;
synchronized public void demandMethod(int avail)
	{
		if(availableProduct<avail) 
		{
			try {
				wait(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		else
			availableProduct-=avail;
			System.out.println("Demand product................."+availableProduct);
		}

	synchronized public void supplyMethod(int i)
	{
		availableProduct+=i;
		System.out.println("supply product........"+availableProduct);

		notify();
	}
}
class MyThreadR extends Thread{
	ThreadSupply ts;
	MyThreadR(ThreadSupply ts)
	{
		this.ts=ts;
	}
	public void run()
	{
		ts.demandMethod(8);
	}
}class MyThreadS extends Thread{
	ThreadSupply ts;
	MyThreadS(ThreadSupply ts)
	{
		this.ts=ts;
	}
	public void run()
	{
		ts.supplyMethod(5);
	}
} 
public class DemandSupply {

	public static void main(String[] args) {

		ThreadSupply ts=new ThreadSupply();
			MyThreadR th=new MyThreadR(ts);
			MyThreadS th1=new MyThreadS(ts);
			th.start();
			th1.start();

	}

}