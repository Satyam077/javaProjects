package com.lab82;
import java.util.TreeSet;
class Book implements Comparable<Book>{
	
    int bid;
    String Subject;
    String author;
    Book(int bid,String Subject,String author){
    	this.bid=bid;
    	this.Subject=Subject;
    	this.author=author;
    }
    public int compareTo(Book b) {    
        if(bid>b.bid){    
            return 1;    
        }else if(bid<b.bid){    
            return -1;    
        }else{    
        return 0;    
        }    
    }   
    
}
public class BookTree {

	public static void main(String[] args) {
		
		TreeSet<Book> list1=new TreeSet <Book>();
		Book b1=new Book(1001,"CPP","D Ritchie");
		Book b2=new Book(1002,"java","J Gosling");
		Book b3=new Book(1003,"python","Guido Van R");
		
		list1.add(b1);
		list1.add(b2);
		list1.add(b3);
        System.out.println(list1.size());
		
		for(Book b:list1){    
			    System.out.println(b.bid+" "+b.author);
	}
}

}
