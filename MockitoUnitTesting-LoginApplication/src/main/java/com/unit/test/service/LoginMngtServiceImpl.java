package com.unit.test.service;

import com.unit.test.dao.LoginDao;

public class LoginMngtServiceImpl implements LoginMngtService{

	private LoginDao loginDao;
	
	
	public LoginMngtServiceImpl(LoginDao loginDao) {
		
		this.loginDao=loginDao;
	}
	
	
	@Override
	public boolean login(String username, String password) {
		
		if(username.equals("")||password.equals(""))
			
			throw new IllegalArgumentException("empty credentials");
	int count=loginDao.authenticate(username, password);
	
	System.out.println("service:loging:count"+count);
		
	if(count==0) 
		return false;
	else 
		return true;

	}
	
	
	
	
	public String registerUser(String user,String role) {
		
		if(!role.equalsIgnoreCase("")&&!role.equalsIgnoreCase("visitor")) {
			
			loginDao.addUser(user, role);
		
		return "user Added";
		
		}else {
			
			return "user not added";
		}
		
		
		
		
		
	}
	
	

}
