package com.spring.Spring_Project;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext sp=new ClassPathXmlApplicationContext("Spring_Project.xml");
       
        Student st1=(Student)sp.getBean("Studentbean1");
        Student st2=(Student)sp.getBean("Studentbean2");
       
        
        System.out.println(st1);
        System.out.println(st2);
        
    }
}
