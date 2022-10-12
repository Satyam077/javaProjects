package com.cc;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.LabTestOnJunit.AdditionMultiplication;


	public class TestAdditionMultiplication {
		@Test
		public void AddMulTest() {
			
	    	 //Addition
	    	 assertEquals(35,AdditionMultiplication.Addition(12,23));
	    	 
	    	 //Multiplication
	    	 assertEquals(276, AdditionMultiplication.Multiplication(12,23));
	    	 
		}
}
