package com.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMessage {
	
	// decalre variables
	private Message m;
	private String expected;
	private String actual;

	//provide -init data
	@BeforeEach
	public void setUp() {
		m=new Message();
		expected="Welcome :saurabh";
		actual="";
	}
	// Do Unit test
	@Test
	public void testshowMsg() {
		
		String actual = m.showMsg("saurabh");
		assertEquals(expected, actual,"may be data is not matched");

	}
	// clean the heap memory/data
	@AfterEach
	public void clean() {
		
		m=null;
		expected=null;
		actual=null;
	}
	
	
	
	/*
	 * @Test public void testA() { String expected="HELLO1"; String actual="HELLO";
	 * 
	 * //Assertions.assertEquals(expected, actual);
	 * 
	  
//	 assertEquals(expected,actual,"may be values are not same ");
//	}*/

}
