package fr.mdarfilal.time.manager.dao;

import java.util.List;

import fr.mdarfilal.time.manager.model.Day;

public interface IDayDao {

	public void saveDay(Day day);

	public Day getDay(Day day);

	public List<Day> getLastTenDays();
}
