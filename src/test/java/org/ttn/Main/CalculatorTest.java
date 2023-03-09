package org.ttn.Main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void calTest() {
		Calculator cal = new Calculator();
		assertEquals(15, cal.cal(10, 5));
	}
}
