package method.passing;

import static org.junit.Assert.*;

import org.junit.Test;

public class BadPassingExample {
	public static void swapString(String s1, String s2) {
		String t = s1;
		s1 = s2;
		s2 = t;
	}
	
	@Test
	public void testSwapString() {
		String s1 = "Hello";
		String s2 = "World";
		BadPassingExample.swapString(s1,s2);
		assertEquals(s1,"World");
		assertEquals(s2,"Hello");
	}
}
