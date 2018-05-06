package com.ubs.opsit.interviews.impl;

import static com.ubs.opsit.interviews.TimeConstants.HOURS_OFF;
import static com.ubs.opsit.interviews.TimeConstants.HOURS_RED;
import static com.ubs.opsit.interviews.TimeConstants.MINUTES_OFF;
import static com.ubs.opsit.interviews.TimeConstants.MINUTES_YELLOW;
import static com.ubs.opsit.interviews.TimeConstants.MINUTES_RED;
import static com.ubs.opsit.interviews.TimeConstants.SECONDS_ODD;
import static com.ubs.opsit.interviews.TimeConstants.SECONDS_EVEN;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TimeConverterImplTest {

	@Test
	public void shouldInstantiateTheTimeConverterImpl() {
		assertNotNull(new TimeConverterImpl());
	}
	
	@Test
	public void shouldTestTheBerlinClockTimePM() {
		String expectedTime [][] = 
			{
				{SECONDS_ODD},
				{HOURS_RED,HOURS_RED,HOURS_RED,HOURS_RED},
				{HOURS_OFF,HOURS_OFF,HOURS_OFF,HOURS_OFF},
				{MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF},
				{MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_OFF}
			};
		
		String time = "20:13:59";
		String actualTime = new TimeConverterImpl().convertTime(time);
		assertEquals(actualTime, getStringTime(expectedTime));
	}

	@Test
	public void shouldTestTheBerlinClockTimeAM() {
		String expectedTime [][] = 
			{
				{SECONDS_EVEN},
				{HOURS_OFF,HOURS_OFF,HOURS_OFF,HOURS_OFF},
				{HOURS_OFF,HOURS_OFF,HOURS_OFF,HOURS_OFF},
				{MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_RED,MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_RED,MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_RED,MINUTES_YELLOW,MINUTES_YELLOW},
				{MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_YELLOW}
			};
		
		String time = "00:59:12";
		String actualTime = new TimeConverterImpl().convertTime(time);
		assertEquals(actualTime, getStringTime(expectedTime));
	}
	
	private String getStringTime(String [][]arr) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString().trim();
	}
}
