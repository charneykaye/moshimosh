package io.outright.moshimosh;

import com.google.inject.Inject;
import io.outright.moshimosh.service.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@javax.inject.Singleton
public class Servlet extends HttpServlet {

    private final Logger logger;

    @Inject
    public Servlet(Logger logger) {
        this.logger = logger;
    }

    @javax.inject.Inject
    private Service service;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info(req.getMethod() + " " + req.getRequestURI());
        resp.getWriter().write(service.hello(req.getRequestURI()));
    }
}
