package edu.esprit.lundi.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.lundi.persistence.Todo;

@Remote
public interface TodoServiceRemote {
	List<Todo> findAll();
}
