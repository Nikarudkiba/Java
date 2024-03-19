package com.example.pet1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import com.example.pet1.BusinessObjects.Customer;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.*;

@WebServlet(name = "/UserLoginServlet", value = "/UserLoginServlet")

public class UserLoginServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String id, pw;
            id = request.getParameter("uname");
            pw = request.getParameter("psw");

            Customer c1 = new Customer();
            c1.SelectDB(Integer.parseInt(id));

            // Put Customer object in session
            HttpSession ses1;
            ses1 = request.getSession();
            ses1.setAttribute("c1", c1);
            System.out.println("Customer session");

            // Put Inventory object in session
            HttpSession ses2;
            ses2 = request.getSession();
            ses2.setAttribute("c1", c1);
            System.out.println("Inventory session");

            // if database password and id matches client password and id run the following code if not run else
            if (c1.getpasswd().equals(pw) && c1.getcustID() == Integer.parseInt(id)) {
                RequestDispatcher rd = request.getRequestDispatcher("/Pet1/Pet_Store/PetStore/Checkout.html");
                rd.forward(request, response);
                System.out.println("Redirecting");
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
                rd.forward(request, response);
            }
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
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
        }// </editor-fold>


    }
