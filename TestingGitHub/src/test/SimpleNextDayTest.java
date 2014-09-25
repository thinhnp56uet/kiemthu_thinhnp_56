package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.SimpleNextDay;

public class SimpleNextDayTest {

	@Test
	public void testNextDate() {
		SimpleNextDay test = new SimpleNextDay();
		String result=test.nextDate(25, 9, 2014);
		assertEquals(result,"Not A Valid Date");
	}

}
