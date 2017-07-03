package fr.mdarfilal.time.manager.service;

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
		dayDao.save(day);
	}

	/**
	 * Get day
	 */
	@Override
	public Day findDay(String dateOfDay) {
		return dayDao.findByDateOfDay(dateOfDay);
	}

}
