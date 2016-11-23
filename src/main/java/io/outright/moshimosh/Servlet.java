package io.outright.moshimosh;

import io.outright.moshimosh.service.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.inject.Singleton
public class Servlet extends HttpServlet {

    @javax.inject.Inject
    private Service service;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(service.hello(req.getRequestURI()));
    }
}
