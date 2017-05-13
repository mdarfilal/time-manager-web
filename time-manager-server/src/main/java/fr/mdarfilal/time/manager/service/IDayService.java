package fr.mdarfilal.time.manager.service;

import java.util.List;

import fr.mdarfilal.time.manager.model.Day;

public interface IDayService {

	void saveDay(Day day);

	Day getDay(Day day);

	List<Day> getLastTenDays();

}
