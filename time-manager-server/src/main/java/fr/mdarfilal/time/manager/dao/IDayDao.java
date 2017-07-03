package fr.mdarfilal.time.manager.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import fr.mdarfilal.time.manager.model.Day;

@Transactional
public interface IDayDao extends CrudRepository<Day, Serializable> {

	public Day findByDateOfDay(String dateOfDay);
}
