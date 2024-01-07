package com.example.mygenericservlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NameServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String fname = servletRequest.getParameter("fname");
        String lname = servletRequest.getParameter("lname");

        PrintWriter out = servletResponse.getWriter();
        out.println("<html><body>");
        out.println("Your full name is " + fname + " " + lname);
        out.println("</body></html>");

    }
}
