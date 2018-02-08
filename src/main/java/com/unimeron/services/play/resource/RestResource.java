package com.unimeron.services.play.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path( "/")
public class RestResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path( "hello")
    public String hello() {
        return new Date() + " Greetings from Spring Boot";
    }
}
