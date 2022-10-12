package com.cc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.LabTestOnJunit.Palindrome;

public class TestPalindrome {
		Palindrome p=new Palindrome();
		
		@Test
		public void TestRev() {
			assertEquals("NAMAN",p.isPalindrome("NAMAN"));
		}
  }