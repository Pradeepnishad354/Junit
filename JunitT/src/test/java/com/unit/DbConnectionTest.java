package com.unit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.unit.db.DbConnection;

public class DbConnectionTest {
	
	
	
	  private DbConnection dbc;
	  private Connection con;
	  
	  
	  @BeforeEach
	  public void setUp() {
		  dbc=new DbConnection();
	  
	  }
	  
	  @Test 
	  public void testdbCon() { 
		  assertDoesNotThrow(()->{
			  con=dbc.getCon();
		  });
		  
//		  con=dbc.getCon(); //Expected con is Not null
	  assertNotNull(con,"connection is not created please check"); }
	  
	  @AfterEach 
	  public void clean() { 
		  dbc=null; con =null; }
	 
	
	  // direct 
	  
	/*
	 * @Test public void tdbCon() {
	 * 
	 * DbConnection db=new DbConnection(); Connection con= db.getCon();
	 * 
	 * assertNotNull(con);
	 * 
	 * 
	 * }
	 */

}
