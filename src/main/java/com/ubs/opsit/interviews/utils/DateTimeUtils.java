package com.ubs.opsit.interviews.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.ubs.opsit.interviews.exceptions.DateParseException;
import com.ubs.opsit.interviews.pojos.StandardTime;
import com.ubs.opsit.interviews.pojos.Time;

public class DateTimeUtils {

	public static StandardTime getCalendarTime(String strTime) throws ParseException {
		DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date = sdf.parse(strTime);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		StandardTime time = new StandardTime(calendar);
		return time;
	}
	
	public static Time getTime(String strTime) throws DateParseException {
		
		String timeArr[] =  strTime.split(":");
		
		if(timeArr==null || timeArr.length>3) {
			throw new DateParseException("Incorrect Date format "+strTime+". Correct format [HH:mm:ss] e.g. 13:14:40 ");
		}
		
		Time time = new Time(timeArr[0],timeArr[1],timeArr[2]);
		return time;
	}
}
