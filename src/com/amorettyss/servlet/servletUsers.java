package com.amorettyss.servlet;

import com.amorettyss.controler.userService;
import com.amorettyss.controler.userTransformer;
import com.amorettyss.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/users")
public class servletUsers extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        //Calling to userService methods
        userService users = new userService();
        //Call all the items from userService
        //creating a list for save the items
        List<User> usersList = users.getAll();

        // transform the data to Json
        String jsonItems = userTransformer.toJson(usersList);
        //this contentType is very important for show this items
        resp.setContentType("application/json");
        resp.getWriter().write(jsonItems);
    }
}


