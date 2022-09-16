package com.lab8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


class Book{
	
	int bid;
    String Subject;
    String author;
    Book(int bid,String Subject,String author){
    	this.bid=bid;
    	this.Subject=Subject;
    	this.author=author;
    }
    
}
public class BookList {
	public static void main(String[] args) {
		//list1
		Book b1=new Book(1001,"CPP","D Ritchie");
		Book b2=new Book(1002,"java","J Gosling");
		Book b3=new Book(1003,"python","Guido Van R");
		
		ArrayList<Book> list1=new ArrayList <Book>();
		list1.add(b1);
		list1.add(b2);
		list1.add(b3);
		//System.out.println(list1);
		Iterator itr=list1.iterator();  
		
		  while(itr.hasNext()){  
		    Book st=(Book)itr.next();  
		    System.out.println(st.bid+" "+st.Subject+" "+st.author);  
		  }
		  
		  //list2
		   /* Book b1=new Book(1001,"CPP","D Ritchie");
			Book b2=new Book(1002,"java","J Gosling");
			Book b3=new Book(1003,"python","Guido Van R");
			
			ArrayList<Book> list1=new ArrayList <Book>();
			list1.add(b1);
			list1.add(b2);
			list1.add(b3);
			//System.out.println(list1);
			Iterator itr=list1.iterator();  
			
			  while(itr.hasNext()){  
			    Book st=(Book)itr.next();  
			    System.out.println(st.bid+" "+st.Subject+" "+st.author);  
			  }*/
		
		 	

	}

}
