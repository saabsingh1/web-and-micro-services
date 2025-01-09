package dtu.example;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;


public class HelloService {

    public String hello() {
        Client c = ClientBuilder.newClient();
        WebTarget baseURL =
                c.target("http://localhost:8080/");
        return baseURL.path("hello").request().get(String.class);
    }
}
