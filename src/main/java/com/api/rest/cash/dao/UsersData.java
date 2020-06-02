package com.api.rest.cash.dao;

import java.util.ArrayList;
import java.util.List;

import com.api.rest.cash.model.User;
import com.sun.istack.logging.Logger;

public class UsersData {
	private final static Logger logger = Logger.getLogger(UsersData.class);
	private static List<User> users;

	public UsersData() {
		this.users = new ArrayList<User>();
		this.cargarUsuariosDePrueba();
	}

	private void cargarUsuariosDePrueba() {
		User usuario = new User(1, "gretty@g.com", "ingrith", "nazario", 500);
		User usuario2 = new User(2, "alan@g.com", "alan", "gimenez", 1500);
		User usuario3 = new User(3, "bren@aylas.com", "brenda", "aylas", 3000);
		this.users.add(usuario);
		this.users.add(usuario2);
		this.users.add(usuario3);
	}

	public static List<User> getUsers() {
		return users;
	}

}
