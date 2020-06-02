package com.api.rest.cash.model;

import com.sun.istack.logging.Logger;

public class User {
	private final static Logger logger = Logger.getLogger(User.class);
	private int id;
	private String mail;
	private String first_name;
	private String last_name;
	private float deuda;

	public User(int id, String mail, String first_name, String last_name, float total) {
		this.id = id;
		this.mail = mail;
		this.first_name = first_name;
		this.last_name = last_name;
		this.deuda = total;
	}
	

}
