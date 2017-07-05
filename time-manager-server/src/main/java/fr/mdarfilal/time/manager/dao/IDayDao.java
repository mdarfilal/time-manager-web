package fr.mdarfilal.time.manager.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import fr.mdarfilal.time.manager.model.Day;

@Transactional
public interface IDayDao extends CrudRepository<Day, Serializable> {

	Day findByDateOfDay(String dateOfDay);

	@Override
	List<Day> findAll();

}
