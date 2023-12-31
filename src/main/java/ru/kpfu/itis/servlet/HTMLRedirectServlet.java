package ru.kpfu.itis.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * put for test http://localhost:8080/lab10/htmlredirect
 */

@WebServlet("/htmlredirect")
public class HTMLRedirectServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Writer writer = response.getWriter();

        writer.write(
                "<html><meta http-equiv='Refresh' content='0; URL=http:/lab10/'></html>");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);
    }

}