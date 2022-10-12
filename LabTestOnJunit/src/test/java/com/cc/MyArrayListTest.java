package com.cc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.LabTestOnJunit.MyArrayList;

public class MyArrayListTest {
	//method-1 to check whether the arraylist is empty or not
		@Test
		public void isEmpty()
		{
			assertEquals(false,MyArrayList.myArrayListMain().isEmpty());
		}
		//method-2 to check the size of the 
		@Test
		public void sizeArrayListTest()
		{
			assertEquals(5,MyArrayList.myArrayListMain().size());
		}

}
