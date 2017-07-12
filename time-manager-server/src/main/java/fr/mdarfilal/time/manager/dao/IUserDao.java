package fr.mdarfilal.time.manager.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.mdarfilal.time.manager.model.User;

public interface IUserDao extends JpaRepository<User, Serializable> {

	User findByUserName(String userName);

}
