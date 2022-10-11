package com.unit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.unit.db.DbUtil;

public class DbUtilTest {
	
	@Test
	public void testDbCon() {
		
		DbUtil dbu=new DbUtil();
	Connection con1=dbu.getCon();
	Connection con2=dbu.getCon();
	
	assertNotNull(con1," not created ");
	
	if(con1==null || con2==null  ) {
		
		fail("connection are not created ");
	}
	
	assertSame(con1, con2,"connection are not same");
		
		
		
		
		
	}

}
