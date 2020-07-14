package com.devanshi.leapyear;

/**
 * Hello world!
 *
 */
public class LeapYearApp 
{
	/**
	 * @param year
	 * @return
	 */
	public Boolean isLeapYear(int year) {
		 return (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);
	}
}
