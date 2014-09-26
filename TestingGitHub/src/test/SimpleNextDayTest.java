package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.SimpleNextDay;

public class SimpleNextDayTest {

	@Test
	public void testNextDate() {
		SimpleNextDay test = new SimpleNextDay();
		String result = test.nextDate(25, 9, 2014);
		assertEquals(result, "Not A Valid Date");
	}

	@Test
	public void testNextDateSangNam() {
		SimpleNextDay test = new SimpleNextDay();
		String result = test.nextDate(31, 12, 2010);
		assertEquals(result, "1/1/2011");
	}

	@Test
	public void testNextDateThang2Nhuan() {
		SimpleNextDay test = new SimpleNextDay();
		String result = test.nextDate(28, 2, 2000);
		assertEquals(result, "29/2/2000");
	}
}
