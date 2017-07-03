package fr.mdarfilal.time.manager.service;

import fr.mdarfilal.time.manager.model.Day;

public interface IDayService {

	void saveDay(Day day);

	Day findDay(String dateOfDay);

}
