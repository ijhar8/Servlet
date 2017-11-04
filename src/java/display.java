/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ijhar-A
 */
public class display extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        ServletContext context=getServletContext();  
//String n=  (String) context.getAttribute("price1");  
//String n2=(String) context.getAttribute("price2");  
  
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet display</title><style>h1{"
                    + "color:red;font-size:20px;border:solid green;}"
                    + "#con{background-color: lightgrey;\n" +
"    width: 100%px;\n" +
"    border: 25px solid green;\n" +
"    padding: 25px;\n" +
"    margin: 25px;\n" +
"    position:absolute;\n" +
"    top: 10%;\n" +
"    left: 30%;\n" +
"    margin: 0 auto;\n" +
"    margin-top: 20px;\n" +
"    width: 34%}</style>");            
            out.println("</head>");
            out.println("<body bgcolor='lightblue'>");
            out.println("<div id='con'>");
            
            out.println("<h1>price of Shirt = " + context.getAttribute("price1") + "</h1>");
            out.println("<h1>price of T-shirt =" + context.getAttribute("price2") + "</h3>");
            out.println("<h1>Total price =" + context.getAttribute("tot") + "</h3>");
             out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
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
