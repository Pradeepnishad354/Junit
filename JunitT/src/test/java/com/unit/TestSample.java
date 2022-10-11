package com.unit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestSample {
	
	
	@Test
	public void testSample() {
		
		int expected[]= {10,20};
		int actual[]= {10,20};
		
		
		assertArrayEquals(expected,actual);
		
	}
	
	public void testNormal() {
		
		boolean exist=false;
		assertTrue(exist,"data may be not exists");
	}

}
