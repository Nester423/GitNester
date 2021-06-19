/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jovi
 */
@WebServlet(name = "Lab4Servlet", urlPatterns = {"/lab4"})
public class Lab4Servlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lab4Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lab4Servlet at " + request.getContextPath() + "</h1>");
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
        Lab4Task lab4t = new Lab4Task();
        StringProcessing sp = new StringProcessing();
        StringMatching sm = new StringMatching();
        List list = sp.getList(sp.text);
        Set set = sp.getSet(sp.text);
        
        request.setAttribute("list", list);
        request.setAttribute("cleanText", sp.getCleanText());
        request.setAttribute("listSize", list.size());
        request.setAttribute("setSize", set.size());
        request.setAttribute("6MostFrequentWords", sp.find6MostFrequentWords(sp.text));
        request.setAttribute("AmountOfWordsWithoutV", sp.findAmountOfWordsWithoutV(sp.getText()));     
        request.setAttribute("AmountOfWordsWith3UniqueLet", sp.findAmountOfWordsWith3UniqueLet(sp.getText()));
        request.setAttribute("find4MostPopular3Sequences", sp.find4MostPopular3Sequences(sp.getText()));
        
        request.getRequestDispatcher("lab4.jsp").forward(request, response);
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