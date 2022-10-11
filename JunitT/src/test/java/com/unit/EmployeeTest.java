package com.unit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class EmployeeTest {
//	@BeforeAll
//	public static void onceSetUp() {
//		System.out.println("from one time setUp");
//	}

//	@BeforeEach
//	public void setUp() {
//		System.out.println("SETUP");
//	}

//	
//	@Test
//	@DisplayName("Testing save method")
//	@Order(value =1)
//	public void testSave() {
//		
//		System.out.println("Employee save");
//	}

//	@Test
//	@Disabled
//	@Order(value=3)
//	public void testUpdate() {
//		
//		System.out.println("Employee Update");
//	}

//	@Test
//	@Order(value=2)
//	public void testDelete() {
//		
//		System.out.println("Employee Delete");
//	}

//	@AfterEach
//	public void Clear() {
//		System.out.println("clear data");
//	}

//	@AfterAll
//	public static void onceEnd() {
//		System.out.println("One at End ");
//	}

	/*
	 * @Test
	 * 
	 * @RepeatedTest(value=4
	 * ,name="{displayName} - {currentRepetition}/{totalRepetitions}")
	 * 
	 * @DisplayName("check the multiple things") public void testMulti(TestInfo
	 * info) {
	 * 
	 * // System.out.println("Hello"+info.getTestClass().get().getName()); //
	 * System.out.println("Hello"+info.getTestMethod().get().getName());
	 * System.out.println("hello"+info.getDisplayName());
	 * 
	 * }
	 */
	 

	@Test
	@Tag("dev")
	public void testA() {
System.out.println("this is test A");
	}
	
	@Test
	@Tag("prod")
	public void testB() {
		System.out.println("this is test B");
	}
}
