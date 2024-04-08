package com.example.pet1;

import java.io.*;

import com.example.pet1.BusinessObjects.Customer;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet", urlPatterns = {"/hello-servlet"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("uname");
        String pw = request.getParameter("psw");

        Customer c1 = new Customer();
        c1.SelectDB(Integer.parseInt(id));

        HttpSession session = request.getSession();
        session.setAttribute("c1", c1);

        if (c1.getpasswd().equals(pw) && c1.getcustID() == Integer.parseInt(id)) {
            RequestDispatcher rd = request.getRequestDispatcher("Checkout.html");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
            rd.forward(request, response);
        }
    }

//    public void destroy() {
//    }
}