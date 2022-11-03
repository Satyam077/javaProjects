package com.hibernateProject;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class App {

	public static void main(String[] args) {
	System.out.println("hello");
	
	Employee e1=new Employee();
	e1.setName("AVINASH");
	e1.setEmp_id(101);
	e1.setDept("HR");
	e1.setSalary(50000);

	
	Employee e2=new Employee();
	e2.setName("ADITYA");
	e2.setEmp_id(102);
	e2.setDept("SDE");
	e2.setSalary(55000);
	
	Employee e3=new Employee();
	e3.setName("SATWIK");
	e3.setEmp_id(103);
	e3.setDept("JUNIOR-SDE");
	e3.setSalary(40000);
	
	
	Emp_Details ed1=new Emp_Details();
	ed1.setEd_id(1);
	ed1.setBank_Account("789876543456");
	ed1.setAddress("New Delhi");
	ed1.setGender("Male");

	
	Emp_Details ed2=new Emp_Details();
	ed2.setEd_id(2);
	ed2.setBank_Account("894876353663");
	ed2.setAddress("Noida");
	ed2.setGender("Male");
	
	Emp_Details ed3=new Emp_Details();
	ed3.setEd_id(3);
	ed3.setBank_Account("3232323543456");
	ed3.setAddress("New Delhi");
	ed3.setGender("Male");
	
	
	
	 Session session=HibernateUtil.getSession();
     
     Transaction t=session.beginTransaction();
      
     session.save(e1);
    session.save(ed1);
    session.save(e2);
    session.save(ed2);
    session.save(e3);
    session.save(ed3);
   
      
     t.commit();
   
     session.close();
	
	

	}

}
