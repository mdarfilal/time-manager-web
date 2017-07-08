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
	 * Save day
	 * 
	 * @param day
	 */
	void saveDay(Day day);

	/**
	 * Create day
	 * 
	 * @param day
	 */
	void createDay();

	/**
	 * Delete day
	 * 
	 * @param day
	 */
	void deleteDay(Day day);

	/**
	 * Get the actual day or creates it
	 * 
	 * @return
	 */
	Day getToday();

}
