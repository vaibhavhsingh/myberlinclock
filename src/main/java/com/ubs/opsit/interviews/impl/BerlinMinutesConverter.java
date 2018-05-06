package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;
import static com.ubs.opsit.interviews.TimeConstants.MINUTES_OFF;
import static com.ubs.opsit.interviews.TimeConstants.MINUTES_RED;
import static com.ubs.opsit.interviews.TimeConstants.MINUTES_YELLOW;;


public class BerlinMinutesConverter implements TimeConverter{

	private String[][] minutes = {
			{MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF},
			{MINUTES_OFF,MINUTES_OFF,MINUTES_OFF,MINUTES_OFF}
		};
	
	public BerlinMinutesConverter() {

	}
	
	@Override
	public String convertTime(String aTime) {
		int minute = Integer.parseInt(aTime);
		
		// 1st Row
		for(int i=0;i<minute/5;i++) {
			if((i+1)%3==0) {
				// Quarter update
				minutes[0][i]=MINUTES_RED;
			}else {
				minutes[0][i]=MINUTES_YELLOW;
			}
		}
		
		// 2nd Row
		for(int i=0;i<minute%5;i++) {
			minutes[1][i]=MINUTES_YELLOW;
		}
		return getStringTime();
	}
	
	private String getStringTime() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<minutes.length;i++) {
			for(int j=0;j<minutes[i].length;j++) {
				sb.append(minutes[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
