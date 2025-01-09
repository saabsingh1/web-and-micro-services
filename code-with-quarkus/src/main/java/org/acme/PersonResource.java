package org.acme;

import jakarta.annotation.PreDestroy;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/person")

public class PersonResource {

    PersonService service = new PersonService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person person() {
        return service.getPerson();

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setPerson(Person person) throws PersonException{
        try{
            service.setPerson(person);
            return Response.noContent().build();
        } catch (PersonException e) {
            return Response.status(400).entity(e.getMessage()).build();
        }


    }

}
