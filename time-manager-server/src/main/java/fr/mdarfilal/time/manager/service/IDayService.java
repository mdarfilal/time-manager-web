package fr.mdarfilal.time.manager.service;

import java.util.List;

import fr.mdarfilal.time.manager.model.Day;

public interface IDayService {

	/**
	 * Get day by dateOfDay param
	 * 
	 * @param dateOfDay
	 * @return Day
	 */
	Day findDay(String dateOfDay);

	/**
	 * Get all days
	 * 
	 * @return all days
	 */
	List<Day> findAllDays();

	/**
	 * Save the day
	 * 
	 * @param day
	 */
	void saveDay(Day day);

}
