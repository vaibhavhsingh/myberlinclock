package com.ubs.opsit.interviews.pojos;

public class Time {

	private String hours;
	
	private String minutes;
	
	private String seconds;
	
	public Time(String hours, String minutes, String seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	
	public String getHours() {
		return hours;
	}

	public String getMinutes() {
		return minutes;
	}

	public String getSeconds() {
		return seconds;
	}

	public String toString() {
		return getHours() + ":" + getMinutes() + ":" + getSeconds();
	}
	
}
