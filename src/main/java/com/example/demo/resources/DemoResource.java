package com.example.demo.resources;

import com.example.demo.data.dao.UserDao;
import com.example.demo.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/demo")
@Controller
public class DemoResource {

    @Autowired
    UserDao userDao;


    @Path("/ping")
    @Produces("application/json")
    @GET
    public Response ping(){

        User u = userDao.findByUserName("hittudiv");
       /* User user = new User(2,"hitesh","mantrala","hittudiv", "123");
        user = userDao.save(user);*/
        return Response.status(Response.Status.OK).entity(u).build();
    }
}
