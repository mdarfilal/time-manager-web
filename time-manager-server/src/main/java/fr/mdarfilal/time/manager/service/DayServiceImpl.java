package fr.mdarfilal.time.manager.service;

import java.util.List;

import org.joda.time.Period;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mdarfilal.time.manager.dao.IDayDao;
import fr.mdarfilal.time.manager.model.Day;

@Service
public class DayServiceImpl implements IDayService {

	@Autowired
	private IDayDao dayDao;

	/**
	 * Save day
	 */
	@Override
	public void saveDay(Day day) {
		updateTotalOfDay(day);
		dayDao.saveDay(day);
	}

	/**
	 * Get day
	 */
	@Override
	public Day getDay(Day day) {
		return dayDao.getDay(day);
	}

	/**
	 * Get last ten days for chart and tab
	 */
	@Override
	public List<Day> getLastTenDays() {
		return dayDao.getLastTenDays();
	}

	/**
	 * Update totalOfDay
	 * 
	 * @param day
	 */
	private void updateTotalOfDay(Day day) {
		if (day != null && day.getBeginOfDay() != null && day.getBeginOfLunch() != null && day.getEndOfLunch() != null
				&& day.getEndOfDay() != null) {

			Period morningPeriod = new Period(day.getBeginOfDay().getTime(), day.getBeginOfLunch().getTime());
			Period afterNoonPeriod = new Period(day.getEndOfLunch().getTime(), day.getEndOfDay().getTime());

			day.setTotalOfDay(
					morningPeriod.plus(afterNoonPeriod).normalizedStandard().toStandardDuration().getMillis());
		}
	}
}
