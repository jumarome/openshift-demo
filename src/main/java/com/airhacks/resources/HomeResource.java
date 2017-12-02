package com.airhacks.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("home")
public class HomeResource {

    @GET
    public String hello(){
        return "Hello from Home";
    }
}
