package dtu.example;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class PersonService {
    Client c = ClientBuilder.newClient();
    WebTarget baseURL = c.target("http://localhost:8080/");

    public Person getPerson(){
        return baseURL.path("person").request().get(Person.class);

    }
    public void setPerson(Person person) throws PersonException{
        Response response = baseURL.path("person").request().put(Entity.entity(person, MediaType.APPLICATION_JSON));
        if (response.getStatus() != 204){
            throw new PersonException(response.readEntity(String.class));

        }
    }

}
