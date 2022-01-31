package com.axonactive.sample.service;

import com.axonactive.sample.dao.DepartmentDAO;
import com.axonactive.sample.entities.Department;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("department")
public class DepartmentService {
    @Inject
    private DepartmentDAO departmentDAO;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response getDepartment(@PathParam("id") Long id){
        Department department = departmentDAO.findDepartmentById(id);
        return Response.status(200).entity(department).build();
    }
}
