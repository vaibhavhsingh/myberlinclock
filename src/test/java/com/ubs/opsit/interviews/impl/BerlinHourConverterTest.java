package com.ubs.opsit.interviews.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static com.ubs.opsit.interviews.TimeConstants.HOURS_OFF;
import static com.ubs.opsit.interviews.TimeConstants.HOURS_RED;
import org.junit.Test;

public class BerlinHourConverterTest {

	@Test
	public void shouldInstantiateTheBerlinHourConverter() {
		assertNotNull(new BerlinHourConverter());
	}
	
	@Test
	public void shouldHaveAllLampsOfTopRowREDAsONFor20Hours() {
		String hours = "20";
		String expectedTime [][] = {
									{HOURS_RED,HOURS_RED,HOURS_RED,HOURS_RED},
									{HOURS_OFF,HOURS_OFF,HOURS_OFF,HOURS_OFF}
								  };
		String time = new BerlinHourConverter().convertTime(hours);
		assertEquals(time, getStringTime(expectedTime));
		
	}
	
	@Test
	public void shouldHaveAllLampsOfTopRowREDAsONANDTwoLampsOf2ndRowOnFor22Hours() {
		String hours = "22";
		String expectedTime [][] = {
									{HOURS_RED,HOURS_RED,HOURS_RED,HOURS_RED},
									{HOURS_RED,HOURS_RED,HOURS_OFF,HOURS_OFF}
								  };
		String time = new BerlinHourConverter().convertTime(hours);
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
