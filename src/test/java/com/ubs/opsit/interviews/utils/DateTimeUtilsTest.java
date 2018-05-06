package com.ubs.opsit.interviews.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;

import org.junit.Test;

import com.ubs.opsit.interviews.exceptions.DateParseException;
import com.ubs.opsit.interviews.pojos.StandardTime;
import com.ubs.opsit.interviews.pojos.Time;

public class DateTimeUtilsTest {

	@Test
	public void shouldTestBerlineTimeCalendarTime() throws ParseException {
		String strTime = "12:13:14";
		StandardTime time = DateTimeUtils.getCalendarTime(strTime);
		
		assertEquals(time.getHours(),12);
		assertEquals(time.getMinutes(),13);
		assertEquals(time.getSeconds(),14);
		assertNotNull(time.getTime());
	}
	
	@Test
	public void shouldTestGetTime() throws DateParseException{
		String strTime = "12:13:14";
		Time time = DateTimeUtils.getTime(strTime);
		assertEquals(time.getHours(),"12");
		assertEquals(time.getMinutes(),"13");
		assertEquals(time.getSeconds(),"14");
	}
	
	@Test(expected = DateParseException.class)
	public void shouldThrowExceptionWithInvalidDateFormatTestGetTime() throws DateParseException{
		String strTime = "12:13:4:4";
		Time time = DateTimeUtils.getTime(strTime);
	}
}
