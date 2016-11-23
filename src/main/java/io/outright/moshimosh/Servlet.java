package io.outright.moshimosh;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.inject.Singleton
public class MoshimoshServlet extends HttpServlet {

    @javax.inject.Inject
    private MoshimoshService moshimoshService;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(moshimoshService.hello("Moshimosh"));
    }
}
