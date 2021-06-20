/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jovi
 */
@WebServlet(name = "Lab5Servlet", urlPatterns = {"/lab5"})
public class Lab5Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
        int t1 = Integer.parseInt(request.getParameter("task1"));
        Sorting list = new Sorting(t1);
        Searching text = new Searching();
        request.setAttribute("unsortedList", list.getUnsortedList());
        request.setAttribute("unsortedText", list.getUnsortedText());
        int t2 = Integer.parseInt(request.getParameter("task2"));
        request.setAttribute("task2", text.linearSearch(t2, list.getUnsortedList()));
        request.setAttribute("sortedList", list.sortApproach3());
        request.setAttribute("sortedListv2", list.sortApproach2());
        request.setAttribute("sortedText", list.sortApproach22());
        String t3 = request.getParameter("task3");
        request.setAttribute("task3", text.linearSearch(t3, list.getUnsortedText()));
        //request.setAttribute("task1", t1);
        request.getRequestDispatcher("lab5.jsp").forward(request,response);
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