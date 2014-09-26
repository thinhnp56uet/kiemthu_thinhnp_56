package test;

import static org.junit.Assert.*;
import org.junit.Test;
import code.CheckTamGiac;

public class CheckTamGiacTest {
	
	@Test
	public void testCheckTamGiac() {
		CheckTamGiac test=new CheckTamGiac();
		String result = test.checkTamGiac(4, 5, 6);
		assertEquals(result,"Scalene");
	}
	@Test
	public void testCheckTamGiacCan() {
		CheckTamGiac test=new CheckTamGiac();
		String result = test.checkTamGiac(4, 4, 6);
		assertEquals(result,"Isosceles");
	}

}
