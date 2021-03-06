package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashRegTest {

	@Test
	public void testChange() {
		CashReg cr = new CashReg();
		
		StringBuffer result = new StringBuffer();
		cr.change(200, 1000, result);
		// Examine the result
		String expected = "Change: 800 Baht\n-- 500x1\n-- 100x3\n";
		assertEquals(expected,result.toString());
		
		result = new StringBuffer();
		cr.change(340, 500, result);
		// Examine the result
		expected = "Change: 160 Baht\n-- 100x1\n-- 50x1\n-- 10x1\n";
		assertEquals(expected,result.toString());
	}

}
