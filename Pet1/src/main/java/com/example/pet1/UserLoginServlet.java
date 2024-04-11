package com.example.pet1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import com.example.pet1.BusinessObjects.Customer;
import jakarta.servlet.http.HttpSession;

import static java.lang.Integer.valueOf;
//import jakarta.servlet.annotation.*;
//import org.jetbrains.annotations.NotNull;

@WebServlet(name = "UserLoginServlet", value = "UserLoginServlet", urlPatterns = {"/UserLoginServlet" })

public class UserLoginServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext servletContext = getServletContext();
        //String message;

        try {
            //gets id and password
            String id = request.getParameter("uname");
            String password = request.getParameter("psw");

//           System.out.println("ID : " + id);
//           System.out.println("Password: " + password);
//            servletContext.log("This is a message printed to the server log.");


            HttpSession session;
            session = request.getSession(true);

            //System.out.println("Customer retrieved = " + id);
            Customer c1 = new Customer();
            //c1.SelectDB(Integer.parseInt(id));
            //c1.SelectDB(Integer.valueOf(id));
            c1.SelectDB(1001);

            out.println("<html><body>");
            //out.println("<h1>" + "ID = " + c1.getcustID() +"</h1>");//---works
            //out.println("<h1>" + "Pass = " + c1.getpasswd() +"</h1>"); //---not
            //out.println("<h1>" + "FName = " + c1.firstName +"</h1>");  //---not
            //out.println("<h1>" + "Lname = " + c1.getlastName() +"</h1>");//-not working
            //out.println("</body></html>");

            //System.out.println("First Name = " + c1.getfirstName());


            //---not even running here yet---
//            if (password.equals(c1.getpasswd())) {             //Check to see if Passwords match with database
//
//                session.setAttribute("c1", c1);
//
//                System.out.println("Customer c1 object has been added");
//
//                RequestDispatcher rd = request.getRequestDispatcher("CustomerInfo.jsp");
//                rd.forward(request, response);      //Goes to dentist info page if all is good
//
//            } else {
//                RequestDispatcher rd = request.getRequestDispatcher("CustomerInfo.jsp");
//                rd.forward(request, response);          //Error page if it does not match
//            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }


    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
