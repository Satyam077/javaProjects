package com.User_Mgt_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;



public class users {
	
	//Insert users

	public static boolean insertusers(String uname)
	{
		try {
			
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("insert into users (uname)values(?)");
			pstmt.setString(1, uname);
			//pstmt.setString(1, password);
		    
		     
		     pstmt.executeUpdate();
		     
		     return true;
		  
		   
		    
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		return false;
		}
		
		
	
	//update password
		public static boolean updateusers(String password1) {
			try {
				
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("update users set password=XYZABZ (password)values(?)");
			pstmt.setString(1, password1);

		    
		     
		     pstmt.executeUpdate();
		     return true;
		  
		   
		    
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			
			
			
			return false;

		}
		
		//delete users
		
			public static boolean deleteusers(String uname) {
				try {
					
				Connection con=ConnectionProvider.createConnection();
				PreparedStatement pstmt=con.prepareStatement("alter table users drop uname (uname)values(?)");
				pstmt.setString(1, uname);

			    
			     
			     pstmt.executeUpdate();
			     return true;
			  
			   
			    
				}catch(Exception e) {
					e.printStackTrace();
					}
				
				return false;

			}
			
			//Retrieve a User
			public static boolean retrieveusers(String uname) {
				try {
					
				Connection con=ConnectionProvider.createConnection();
				PreparedStatement pstmt=con.prepareStatement("select uname from users (uname)values(?)");
				pstmt.setString(1, uname);

			    
			     
			     pstmt.executeUpdate();
			     return true;
			  
			   
			    
				}catch(Exception e) {
					e.printStackTrace();
					}
				
				return false;

			}
			
			//See users list
			public static boolean Showusers(String uname) {
				try {
					
				Connection con=ConnectionProvider.createConnection();
				PreparedStatement pstmt=con.prepareStatement("select *from users (uname)values(?)");
				pstmt.setString(1, uname);

			    
			     
			     pstmt.executeUpdate();
			     return true;
			  
			   
			    
				}catch(Exception e) {
					e.printStackTrace();
					}
				
				return false;

			}
			
			//Exit
			


			

		}

	

	

