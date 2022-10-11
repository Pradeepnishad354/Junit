package com.unit.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.unit.test.dao.LoginDao;
import com.unit.test.service.LoginMngtService;
import com.unit.test.service.LoginMngtServiceImpl;

public class LoginMngtServiceTestsAnno {
	
	@InjectMocks
	private  LoginMngtServiceImpl loginService;
	
	@Mock
	private LoginDao loginDaoMock;
	
//	@Spy
//	private LoginDao loginDaoSpy;
//	
	public LoginMngtServiceTestsAnno() {
		
		MockitoAnnotations.openMocks(this);
	}
	
	
	
	
	
	@Test
	public void testLoginWithValidCredentials() {
		
		//provide stub(temporory functionalities) for Dao authenticate method
		
		/*
		 * Mockito.when(loginDaoMock.authenticate("pritesh", "pradeep")) .thenReturn(1);
		 */
		//behaviour driven development
		BDDMockito.given(loginDaoMock.authenticate("pritesh","pradeep")).willReturn(1);
		//Unit test
		assertTrue(loginService.login("pritesh","pradeep"));
		
	}
	@Test
	public void testLoginWithInValidCredentials() {
		
		//provide stub(temporory functionalities) for Dao authenticate method
		
		Mockito.when(loginDaoMock.authenticate("pritesh","pradeep1"))
		.thenReturn(0);
		
		//Unit test
		assertFalse(loginService.login("pritesh","pradeep1"));
		
	}
	
	@Test
	public void testLoginWithNoCredentials() {
		
		
		assertThrows(IllegalArgumentException.class,()->{
			loginService.login("","");
			
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


