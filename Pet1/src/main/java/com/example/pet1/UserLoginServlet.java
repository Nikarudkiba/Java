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

@WebServlet(name = "/UserLoginServlet", value = "/UserLogin")

public class UserLoginServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = request.getWriter();
    try {

    String id,pw;
    id =request.getParameter("id");
    pw = request.getParameter("password");

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
           ses2.setAttribute("c1",c1);
           System.out.println("Inventory session");

        // if database password and id matches client password and id run the following code if not run else
        if(c1.getpasswd().equals(pw) &&  c1.getcustID()==Integer.parseInt(id)){
            RequestDispatcher rd = request.getRequestDispatcher("/Pet_Store/PetStore/Checkout.html");
            rd.forward(request, response);


        }else{
            RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
            rd.forward(request, response);
        }


    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }
}
