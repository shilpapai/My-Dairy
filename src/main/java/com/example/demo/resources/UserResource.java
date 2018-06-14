package com.example.demo.resources;

import com.example.demo.data.dao.DairyDao;
import com.example.demo.data.dao.UserDao;
import com.example.demo.data.model.Dairy;
import com.example.demo.data.model.User;
import com.example.demo.resources.request.DairyContent;
import com.example.demo.resources.request.LoggableUser;
import com.example.demo.utils.PeaceUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/user")
@Controller
public class UserResource {

    @Autowired
    UserDao userDao;

    @Autowired
    DairyDao dairyDao;

    @POST
    @Consumes("application/json")
    @Path("/login")
    public Response login(LoggableUser loggableUser) {

        if (loggableUser == null || !loggableUser.isValid()) {
            return Response.status(Response.Status.BAD_REQUEST).entity("User name / Password cannot be empty").build();
        }

        User user = userDao.findByUserName(loggableUser.getUserName());
        if (user == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("User not found. Please signup").build();
        }

        if (user.getPasswordHash().equals(PeaceUtils.getMD5(loggableUser.getPassWord()))) {
            return Response.status(Response.Status.OK).build();

        }

        return Response.status(Response.Status.UNAUTHORIZED).build();

    }

    @POST
    @Consumes("application/json")
    @Path("/dairy")
    public Response saveDairy(DairyContent dairyContent) {

        dairyDao.save(new Dairy(new Date(), dairyContent.getContent()));
        return Response.status(Response.Status.OK).build();
    }
}
