package com.yash;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("newresourcejson")
public class NewResourceJSON {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Resource getResource() {
		System.out.println("yash console");
		Resource r = new Resource();
		r.setName("Aman");
		r.setMarks(100);
		return r;

	}

}
