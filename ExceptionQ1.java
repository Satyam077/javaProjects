package Chandan3;
import java.util.*;
import java.lang.*;

public class ExceptionQ1 {

	

		void exceptionHandle(int p, int q) {
			int divide=0;
			try {
				divide=p/q;
				System.out.println(" "+p+"/"+q+" is : "+divide);
			} catch (ArithmeticException e) {
				System.out.println("Can't divide "+ p +"/"+q+". Arithmetic Exception");
			}
		}
		public static void main(String args[]) {
			System.out.println("Enter the values of a and b : ");
			//string 1
			Scanner sc= new Scanner(System.in);
			String str= sc.next();
//			String 2
			Scanner sc1= new Scanner(System.in);
			String str1= sc1.next();
			//Parse string 1 to n
			int n= Integer.parseInt(str);
			//Parse string 2 to n1
			int n1= Integer.parseInt(str1);
			//Object of class ExceptionHandle
			ExceptionQ1 obj = new ExceptionQ1();
			obj.exceptionHandle(n,n1);
		}
	}

