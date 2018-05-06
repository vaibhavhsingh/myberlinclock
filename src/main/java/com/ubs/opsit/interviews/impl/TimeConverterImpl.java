package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.pojos.Time;
import com.ubs.opsit.interviews.utils.DateTimeUtils;

public class TimeConverterImpl implements TimeConverter{

	@Override
	public String convertTime(String aTime) {
		StringBuilder sb = new StringBuilder();
		try {
			Time time = DateTimeUtils.getTime(aTime);
			
			String hours = new BerlinHourConverter().convertTime(time.getHours());
			String minutes = new BerlinMinutesConverter().convertTime(time.getMinutes());
			String seconds = new BerlinSecondsConverter().convertTime(time.getSeconds());
			
			sb.append(seconds).append("\n");
			sb.append(hours);
			sb.append(minutes);
			
			System.out.println(aTime);
			System.out.println(sb.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sb.toString().trim();
	}

	public static void main(String args[]) {
		TimeConverter c = new TimeConverterImpl();
		String time ="24:00:00";
		c.convertTime(time);
	}
}
