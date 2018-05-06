package com.ubs.opsit.interviews.impl;

import static com.ubs.opsit.interviews.TimeConstants.MINUTES_RED;
import static com.ubs.opsit.interviews.TimeConstants.MINUTES_YELLOW;
import static com.ubs.opsit.interviews.TimeConstants.MINUTES_OFF;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BerlinMinutesConverterTest {

	@Test
	public void shouldInstantiateTheBerlinMinutesConverter() {
		assertNotNull(new BerlinMinutesConverter());
	}
	
	@Test
	public void shouldHave3rdAnd6thLampsOfTopMinutesRowREDFor30Minutes() {
		String minutes = "30";
		String expectedTime [][] = 
			{
				{MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_RED,MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_RED,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF},
				{MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF}
			};
		String time = new BerlinMinutesConverter().convertTime(minutes);
		assertEquals(time, getStringTime(expectedTime));
		
	}
	
	@Test
	public void shouldNotHaveAnyRedLampsONBUT3YellowLampsof2ndRowON13Minutes() {
		String minutes = "13";
		String expectedTime [][] = 
			{
				{MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF},
				{MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_YELLOW,MINUTES_OFF}
			};
		String time = new BerlinMinutesConverter().convertTime(minutes);
		assertEquals(time, getStringTime(expectedTime));
		
	}
	
	private String getStringTime(String [][]arr) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
