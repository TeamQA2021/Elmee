package com.junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitLearn {
	
 @Test
 public void getname() {
	 System.out.println("This is from first test");
	 
 }
 @Before
public void getdata() {
	System.out.println("This is from before");
	 
 }
 @BeforeClass
public static void getage() {
	System.out.println("This is from before class");
}
 @Test
public void getpro() {
	System.out.println("This is from second test");
}


 @AfterClass
 public static void getnum() {
		System.out.println("This is from after class");
	}
 @Test
 public void gettest() {
		System.out.println("This is from third test");
	}
	 
	 
}
