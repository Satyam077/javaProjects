package com.springorm.Service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springorm.LabourDAO.LabourDAO;
import com.springorm.entity.Labour;

//Chandan Chauhan
public class App 
{
    public static void main( String[] args )
    {
       
        System.out.println("Welcome to Labour Details!!!");
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		LabourDAO ldao = (LabourDAO) ac.getBean("lbdao");
		Labour l1=new Labour(1001,"Sunil", 40,"UP");
		Labour l2=new Labour(1002,"Anil", 42,"AP");
		Labour l3=new Labour(1003,"Jaspreet", 41,"Punjab");
		Labour l4=new Labour(1004,"Owaish Shah", 44,"Andhra Pradesh");
		Labour l5=new Labour(1005,"Ramesh", 37,"UP");
		
		
		//To Insert Labour details into the table
		 /* ldao.insertLabour(l1);
		  ldao.insertLabour(l2); 
		  ldao.insertLabour(l3); 
		  ldao.insertLabour(l4); 
		  ldao.insertLabour(l5); */
		  
		  //To get Labours by ID
		 //l2=ldao.getLabour(1002);
		
           
	  //To Update Details
		/*l2.setLabourName("Harun");
		ldao.updateLabour(l2);
		 System.out.println(l2);*/
		 
		 
       //To Delete any LabourDetails
		// ldao.deleteLabour(l5);
		
		 //Get All LabourDetails in one short
		List<Labour> Lblist = ldao.getAllLabours();

			System.out.println(Lblist);

	
    }
}
