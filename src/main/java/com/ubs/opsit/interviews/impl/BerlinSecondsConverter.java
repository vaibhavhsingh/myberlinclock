package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;
import static com.ubs.opsit.interviews.TimeConstants.SECONDS_EVEN;
import static com.ubs.opsit.interviews.TimeConstants.SECONDS_ODD;

public class BerlinSecondsConverter implements TimeConverter{

	@Override
	public String convertTime(String aTime) {
		int seconds = Integer.parseInt(aTime);

		return 0 == seconds%2 ? SECONDS_EVEN : SECONDS_ODD ;
	}

}
