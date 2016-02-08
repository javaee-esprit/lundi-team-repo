package edu.esprit.lundi.services;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.lundi.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
