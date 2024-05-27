package com.wipro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void testAdd() {
		Sum s=new Sum();
		// expected  ,actual
		assertEquals(9,s.add(4, 5));
		assertNotNull(s.add(42, 15));
		//fail("Not yet implemented");
	}

	@Test
	void testProd() {
		Sum s=new Sum();
		assertEquals(10,s.prod(2,5));
		//fail("Not yet implemented");
	}

}
