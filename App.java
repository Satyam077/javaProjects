package com.Student_Mgt;

import org.hibernate.Transaction;

import com.Student_Mgt.Student;

public class App {

	public static void main(String[] args) {
		Student s=new Student();
	
	     //we have to enter unique details again to store in table
		    s.setSt_id(1);
	        s.setSname("Chandan");
	        s.setContact("8052XXXXXX");
	        
	       
			StudentDAO.insertStudent(s);
			StudentDAO.getStudent(s);
			StudentDAO.updateStudent(s);
			StudentDAO.deleteStudent(s);
	}

}
