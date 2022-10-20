package com.User_Mgt_Project;

import java.sql.Connection;
import java.util.Scanner;


public class UsersMain {

	public static void main(String[] args) {
		
	
		while(true)
		{
			System.out.println("Press 1 to Create a User:");
			System.out.println("Press 2 to Update password :");
			System.out.println("Press 3 to Delete a User :");
			System.out.println("Press 4 to Retrieve a User :");
			System.out.println("Press 5 to List of all User :");
			System.out.println("Press 6 to Exit :");
			
			Scanner scan =new Scanner(System.in);
			int n=scan.nextInt();
			boolean flag;
			switch(n) {
			
			//add Users and password
			case 1:
			{
				System.out.println("Enter User Name :");
				String uname=scan.next();
				flag=users.insertusers(uname);
				
				/*System.out.println("Enter User password :");
				String password=scan.next();
				flag=users.insertusers(password, password);*/
				if(flag)
					System.out.println("User added successfully....");
				else
					System.out.println("Something Went Wrong....");
			}
			break;
			
			//Update password
			case 2:
			{
				
				System.out.println("Enter User's password :");
				String password=scan.next();
				flag=users.updateusers(password);
				if(flag)
					System.out.println("password updated successfully....");
				else
					System.out.println("Something Went Wrong....");
			}
			break;
			
			//Delete a User
			case 3:
			{
				System.out.println("Enter User Name :");
				String uname=scan.next();
				flag=users.deleteusers(uname);
				
				if(flag)
					System.out.println("Deleted User name successfully....");
				else
					System.out.println("Something Went Wrong....");
			}
			break;
			
			
			//Retrieve a User
			case 4:
			{
				System.out.println("Enter User Name :");
				String uname=scan.next();
				flag=users.retrieveusers(uname);
				
				if(flag)
					System.out.println("retrieved a User name successfully....");
				else
					System.out.println("Something Went Wrong....");
			}
			break;
			
			//Show List of  User name
			case 5:
			{
				System.out.println("Enter User Name :");
				String uname=scan.next();
				flag=users.Showusers(uname);
				
				if(flag)
					System.out.println("Show List of  User name successfully....");
				else
					System.out.println("Something Went Wrong....");
			}
			break;
			
			case 6:
			{
				System.out.println("Exit");
			}
			
			
			}

			}
			
	   }
	}



