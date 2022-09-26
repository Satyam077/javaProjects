package com.lab9;
import java.io.*;

class Fibonacci extends Thread{
	public void run() {
        int a=0,b=1,c,i,n=10;
		
        System.out.println("\nFibonacci numbs are: ");
		System.out.print(a+" "+b);  //print 0 1
		
		for(i=2; i<n; ++i)  //loop starts from 2 because 0 and 1 are already printed
		{
			c=a+b;
			
			System.out.print(" "+c);
			a=b;
			b=c;
			}
	}
}
class Reverse extends Thread
{
     public void run()
     {
         
               System.out.println("\nReverse numbs are: ");
               
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.println(i+"  ");
               }
             
          }
         }

public class FiboRevThread {

	public static void main(String[] args) {
	 try{
		     Fibonacci fib=new Fibonacci();
		     fib.start();
		     fib.sleep(4000);
		
             Reverse rev = new Reverse();
             rev.start();
		     }catch(Exception ex)
		     {
		    	 System.out.println("ee");
		     }
	}
	}


