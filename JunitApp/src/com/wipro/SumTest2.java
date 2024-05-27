package com.wipro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest2 {
	Sum s;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//db ,once
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//db close
		
	}

	@BeforeEach
	void setUp() throws Exception { //init
		s=new Sum();
	}

	@AfterEach
	void tearDown() throws Exception {  //destroy
		s=null;
	}

	@Test
	void testAdd() {
		// expected  ,actual
		assertEquals(9,s.add(4, 5));
		assertNotNull(s.add(42, 15));
		//fail("Not yet implemented");
	}

	@Test
	void testProd() {
		assertEquals(10,s.prod(2,5));
		//fail("Not yet implemented");
	}
}
