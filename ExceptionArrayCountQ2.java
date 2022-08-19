package Chandan3;
import java.util.*;
import java.lang.*;

public class ExceptionArrayCountQ2 {
	

		void countVowels(String str) {
			int strLength= str.length();
			//Creating array of string length
			char []arr= new char[strLength];
			int i;
			//Copying string character into array 
			for(i=0;i<strLength;i++) {
				arr[i]=str.charAt(i);
				
			}
			//Showing characters in array format
			System.out.print("The array is: ");
			for(i=0;i<strLength;i++) {
				System.out.print(" "+ arr[i]+" ");
			}
			System.out.println(" ");
			
			//Print vowels	
			int count=0;
			System.out.print("The vowels: ");
			for(i=0;i<strLength;i++) {
				if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
					System.out.print(" "+arr[i]+" ");
					count+=1;
					
				}
				
			}
			System.out.println(" ");
			System.out.println("The number of vowels: "+ count);

			
			//Exception
			try {
				for(i=0;i<strLength;i++) {
					if(arr[i]=='x') throw new Exception();
					
				}
			}catch(Exception a) {
				System.out.println("Oops! Exception as array contains x");
			}
				
			
		}
		
		public static void main(String args[]) {
			
			System.out.println("Enter any string: ");
			Scanner sc= new Scanner(System.in);
			String str= sc.next();
			
			ExceptionArrayCountQ2 obj= new ExceptionArrayCountQ2();
			obj.countVowels(str);
			
			
		}
	}


