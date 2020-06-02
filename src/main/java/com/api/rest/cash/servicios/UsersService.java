package com.api.rest.cash.servicios;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import com.api.rest.cash.dao.UsersData;
import com.api.rest.cash.model.User;

/**
 * 
 * @author Ingrith Nazario
 * 
 */

@Path("users")
public class UsersService {
	
	private static List<User> users = UsersData.getUsers();
			
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Response getUsers() {
		
		return Response.ok(users).build();
		
	}

}
