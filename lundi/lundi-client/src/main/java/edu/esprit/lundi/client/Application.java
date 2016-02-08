package edu.esprit.lundi.client;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.lundi.persistence.Todo;
import edu.esprit.lundi.services.TodoServiceRemote;

public class Application {

	public static void main(String[] args) throws NamingException {
		Context ctx = new InitialContext();

		TodoServiceRemote proxy = (TodoServiceRemote) ctx.lookup("lundi-ear/lundi-ejb/TodoService!edu.esprit.lundi.services.TodoServiceRemote");
		List<Todo> todos = proxy.findAll();
		todos.forEach(System.out::println);
	}

}
