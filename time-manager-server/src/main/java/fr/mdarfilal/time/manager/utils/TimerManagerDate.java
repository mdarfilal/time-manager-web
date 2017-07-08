package fr.mdarfilal.time.manager.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerManagerDate {

	private final static SimpleDateFormat DATE_OF_DAY_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	public static String getDateOfDayFormatted(Date date) {
		return DATE_OF_DAY_FORMAT.format(date);
	}
}
