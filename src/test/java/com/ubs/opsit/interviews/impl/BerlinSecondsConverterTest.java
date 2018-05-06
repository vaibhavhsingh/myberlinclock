package com.ubs.opsit.interviews.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static com.ubs.opsit.interviews.TimeConstants.SECONDS_EVEN;
import static com.ubs.opsit.interviews.TimeConstants.SECONDS_ODD;


import org.junit.Test;

public class BerlinSecondsConverterTest {

	@Test
	public void shouldInstantiateTheBerlinSecondsConverter() {
		assertNotNull(new BerlinSecondsConverter());
	}
	
	@Test
	public void shouldHaveYellowLightOnFor24Seconds() {
		String expectedString = SECONDS_EVEN;
		String secondTime = "24";
		String seconds = new BerlinSecondsConverter().convertTime(secondTime);
		assertEquals(seconds, expectedString);
	}
	
	@Test
	public void shouldHaveYellowLightOFFFor31Seconds() {
		String expectedString = SECONDS_ODD;
		String secondTime = "31";
		String seconds = new BerlinSecondsConverter().convertTime(secondTime);
		assertEquals(seconds, expectedString);
	}
	
	@Test
	public void shouldHaveYellowLightONFor00Seconds() {
		String expectedString = SECONDS_EVEN;
		String secondTime = "00";
		String seconds = new BerlinSecondsConverter().convertTime(secondTime);
		assertEquals(seconds, expectedString);
	}
}
