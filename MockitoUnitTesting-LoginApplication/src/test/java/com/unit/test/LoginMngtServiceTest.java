package com.unit.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.unit.test.dao.LoginDao;
import com.unit.test.service.LoginMngtService;
import com.unit.test.service.LoginMngtServiceImpl;

public class LoginMngtServiceTest {
	
	private static LoginMngtService loginservice;
	private static LoginDao loginDaoMock;
	
	
	@BeforeAll
	public static void  setOnce() {
		
		// internally in memory class are implements the LoginDao
		//create mock/fake, dummy object
		loginDaoMock=Mockito.mock(LoginDao.class);
		
		System.out.println(loginDaoMock.getClass()+" "+Arrays.toString(loginDaoMock.getClass()
		.getInterfaces()));
		
		//create Service class object
		
loginservice=new LoginMngtServiceImpl(loginDaoMock);
		
	}
	
	@AfterAll
	public static void clearOnce() {
		loginservice=null;
		loginDaoMock=null;
	}
	
	@Test
	public void testLoginWithValidCredentials() {
		
		//provide stub(temporory functionalities) for Dao authenticate method
		
		Mockito.when(loginDaoMock.authenticate("pritesh", "pradeep"))
		.thenReturn(1);
		
		//Unit test
		assertTrue(loginservice.login("pritesh","pradeep"));
		
	}
	@Test
	public void testLoginWithInValidCredentials() {
		
		//provide stub(temporory functionalities) for Dao authenticate method
		
		Mockito.when(loginDaoMock.authenticate("pritesh","pradeep1"))
		.thenReturn(0);
		
		//Unit test
		assertFalse(loginservice.login("pritesh","pradeep1"));
		
	}
	
	@Test
	public void testLoginWithNoCredentials() {
		
		
		assertThrows(IllegalArgumentException.class,()->{
			loginservice.login("","");
			
		});
		
		
	}
	
	@Test
	public void testRegisterUserWithSpy() {
		
		LoginDao loginDaoSpy=Mockito.spy(LoginDao.class);
		
		LoginMngtService loginService=new LoginMngtServiceImpl(loginDaoSpy);
		
		loginService.registerUser("shubham","admin");
		loginService.registerUser("jay","visitor");
		loginService.registerUser("ashu","");
		
		Mockito.verify(loginDaoSpy,Mockito.times(1)).addUser("shubham","admin");
		Mockito.verify(loginDaoSpy,Mockito.times(0)).addUser("jay","visitor");
		Mockito.verify(loginDaoSpy,Mockito.never()).addUser("ashu","");
	}
	


}
