package com.devanshi.leapyear;

import org.junit.Test;
import org.junit.*;

public class Year {
	
	//test All years divisible by 400 ARE leap years
	@Test
	public void divisibleBy400() {
		LeapYearApp l=new LeapYearApp();
		Assert.assertEquals(true, l.isLeapYear(2000));
		}
}
