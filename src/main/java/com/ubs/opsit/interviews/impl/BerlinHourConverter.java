package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;
import static com.ubs.opsit.interviews.TimeConstants.HOURS_OFF;
import static com.ubs.opsit.interviews.TimeConstants.HOURS_RED;


public class BerlinHourConverter implements TimeConverter{
	
	private String [][] hours = {
			{HOURS_OFF,HOURS_OFF,HOURS_OFF,HOURS_OFF},
			{HOURS_OFF,HOURS_OFF,HOURS_OFF,HOURS_OFF}
		};
	
	public BerlinHourConverter() {

	}

	@Override
	public String convertTime(String aTime) {
		int hour = Integer.parseInt(aTime);
		
		// 1st Row
		for(int i=0;i<hour/5;i++) {
			hours[0][i]=HOURS_RED;
		}
		
		//2nd Row
		for(int i=0;i<hour%5;i++) {
			hours[1][i]=HOURS_RED;
		}
		
		return getStringTime();
	}

	private String getStringTime() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<hours.length;i++) {
			for(int j=0;j<hours[i].length;j++) {
				sb.append(hours[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
