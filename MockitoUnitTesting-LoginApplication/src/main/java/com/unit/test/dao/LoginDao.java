package com.unit.test.dao;

public interface LoginDao {
	
	public int authenticate(String user,String Pass);
	
	public String addUser(String user,String role);
		
		
	

}
