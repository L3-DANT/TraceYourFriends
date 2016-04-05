package com.traceyourfriend.inventory;

import com.google.gson.Gson;
import com.traceyourfriend.beans.User;
import com.traceyourfriend.dao.UsersDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * This class manage Coordinates
 *
 * Created by romann on 17/03/2016.
 */
@Path("/coor")
@Produces(MediaType.APPLICATION_JSON)
public class CoorInventory {

    /**
     * This methode will return the actual coordinate of a user from the name
     * parameter.
     * <p/>
     * http://localhost:8080/TraceYourFriends/api/coor/getCoorWithName/romann
     *
     * @param name - user Name
     * @return - json string with coordinate
     */
    @GET
    @Path("/getCoorWithName/{name}")
    public String GetCoorWithName(@PathParam("name") final String name) throws SQLException {
        UsersDAO uDao = new UsersDAO();
        String coor = "";
        List<User> lUser = uDao.findAll();

        for (User u : lUser){
            if(name.equals(u.getName())){
                coor = u.getCoor();
            }
        }

        return new Gson().toJson(coor);
    }
}
