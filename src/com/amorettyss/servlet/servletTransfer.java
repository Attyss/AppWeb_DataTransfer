package com.amorettyss.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

@WebServlet("/transfer")
public class servletTransfer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        //methos request Attriv to keep and getParam to call the value
        req.setAttribute("id_serv", req.getParameter("id_form"));
        req.setAttribute("name_serv",req.getParameter("name_form"));
        req.setAttribute("surname_serv",req.getParameter("surname_form"));
        //Choose the index of you prefer
        RequestDispatcher dispT = req.getRequestDispatcher("/index2.jsp");
        dispT.forward(req,resp);

    }
}
