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
	
	//test All years divisible by 100 but not by 400 are NOT leap years 
		@Test
		public void divisibleBy100butNotBy400() {
			LeapYearApp l=new LeapYearApp();
			Assert.assertEquals(false, l.isLeapYear(2100));
			}
	//test All years divisible by 4 but not by 100 ARE leap years
		@Test
		public void divisibleBy4ButNotBy100() {
			LeapYearApp l=new LeapYearApp();
			Assert.assertEquals(true, l.isLeapYear(2016));
			
		}
		// test All years not divisible by 4 are NOT leap years
		@Test
		public void notDivisibleBy4() {
			LeapYearApp l=new LeapYearApp();
			Assert.assertEquals(false, l.isLeapYear(2017));
			
		}

}
