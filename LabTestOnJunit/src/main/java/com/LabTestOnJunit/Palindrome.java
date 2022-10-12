package com.LabTestOnJunit;

public class Palindrome {
	public String  isPalindrome(String r) {
		StringBuilder b=new StringBuilder(r);
		b.reverse();
		return b.toString();
		}
	}
