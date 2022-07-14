package com.yash;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("newresourcexml")
public class NewResourceXML {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Resource getResource() {
		System.out.println("yash console");
		Resource r = new Resource();
		r.setName("Aman");
		r.setMarks(100);
		return r;

	}

}
