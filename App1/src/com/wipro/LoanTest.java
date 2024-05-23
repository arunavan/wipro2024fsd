package com.wipro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest {

	@Test
	void testGetEmi() {
		Loan l=new Loan();
		assertEquals(6000,l.getEmi(60000));
	}

}
