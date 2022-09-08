package com.lab2;

public class Student {
		 static String Institute_name;
		 String name;
		 int roll_no;
		 int age;
		 
		 public static String getInstitute_name() {
				return Institute_name;
			}

			public static void setInstitute_name(String institute_name) {
				Institute_name = institute_name;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getRoll_no() {
				return roll_no;
			}

			public void setRoll_no(int roll_no) {
				this.roll_no = roll_no;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}
		 
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		Student(){
			
		}

		
		 
		 
	}


