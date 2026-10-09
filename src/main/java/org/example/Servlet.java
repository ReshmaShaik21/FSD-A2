package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Get values from the HTML form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Set response type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login Result</title>");
        out.println("</head>");

        out.println("<body>");

        // Check login credentials
        if ("admin".equals(username) && "1234".equals(password)) {

            out.println("<h2>Login Successful</h2>");
            out.println("<p>Welcome, " + username + "</p>");

        } else {

            out.println("<h2>Login Failed</h2>");
            out.println("<p>Invalid username or password</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
