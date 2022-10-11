package com.unit.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockVsSpyTest {
	
	
	@Test
	public void testList() {
		
		//its totally Mock Class
		List<String> listMock=Mockito.mock(ArrayList.class);//Mock
		
		Mockito.when(listMock.size()).thenReturn(10);//stub on mock obj
		
		//its happening with partially mock class
//		List<String> listSpy=Mockito.spy(ArrayList.class);//spy 
		List<String> listSpy=Mockito.spy(new ArrayList());// spy or
		
		Mockito.when(listSpy.size()).thenReturn(10);//stub on spy obj
		
		System.out.println(listMock.size()+" "+listSpy.size());
		
		
	}

}
