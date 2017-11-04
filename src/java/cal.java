/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ijhar-A
 */
public class cal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
         int price1=0;
         int price2=0;
         
        response.setContentType("text/html;charset=UTF-8");
        
        String sirt= request.getParameter("Shirt");
        int Q1 = Integer.parseInt(request.getParameter("Quantity1"));
        int p1 = Integer.parseInt(request.getParameter("Prices1"));
        String tsirt= request.getParameter("tshirt");
        int Q2 = Integer.parseInt(request.getParameter("Quantity2"));
        int p2 = Integer.parseInt(request.getParameter("Prices2"));
       
     if(sirt.equals("on"))
     {
        price1=p1*Q1;
    }
    else
    {
       out.println("not enterd1"); 
    }
          
     if(tsirt.equals("on"))
     {
        price2=p2*Q2;
    }
    else
    {
       out.println("not enterd2");
    }
         
         
         
    int tot=price1+price2;
    ServletContext context=getServletContext();  
    context.setAttribute("price1",price1);  
    context.setAttribute("price2",price2);  
    context.setAttribute("tot",tot);  
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet display</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculted price " + "</h1>");
            out.println("<p>Shirt price =" + price1 +"</p>");
            out.println("T-shirt price =" + price2);
            out.println("<br>Total price = " + tot);
            
            out.println("</body>");
            out.println("</html>");
            RequestDispatcher rd=request.getRequestDispatcher("display");
            rd.forward(request, response);
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

