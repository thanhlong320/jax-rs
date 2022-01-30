package com.axonactive.sample;

import com.axonactive.sample.entities.Department;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloWorld {

    @GET
    public String getGreet(){
        return "Hello World";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDepartment(){
        Department department = new Department(1L,"YURICH","TPHCM");
        return Response.status(200).entity(department).build();
    }

}
