package com.ubs.opsit.interviews.pojos;

import java.util.Calendar;

public class StandardTime {
	private Calendar time;
	
	public StandardTime(Calendar calendar) {
		this.time = calendar;
	}

	public int getHours() {
		return time.get(Calendar.HOUR_OF_DAY);
	}

	public int getMinutes() {
		return time.get(Calendar.MINUTE);
	}

	public int getSeconds() {
		return time.get(Calendar.SECOND);
	}

	public Calendar getTime() {
		return time;
	}
	
	public String toString() {
		return getHours() + ":" + getMinutes() + ":" + getSeconds();
	}
		
}
