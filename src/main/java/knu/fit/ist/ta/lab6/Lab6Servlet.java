/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jovi
 */
@WebServlet(name = "Lab6Servlet", urlPatterns = {"/lab6"})
public class Lab6Servlet extends HttpServlet {

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
            out.println("<title>Servlet Lab6Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lab6Servlet at " + request.getContextPath() + "</h1>");
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
        Recursion rec = new Recursion();
        Tree tree = new Tree();
        
        tree.add(3);
        tree.add(11);
        tree.add(6);
        tree.add(2);
        tree.add(10);
        tree.add(4);
        tree.add(8);
        tree.add(7);
        
        ArrayList<Integer> getTree = tree.getTree();
        int number = Integer.parseInt(request.getParameter("number"));
        int value = Integer.parseInt(request.getParameter("value"));
        int isValue = Integer.parseInt(request.getParameter("isValue"));
        
        String revnumber = rec.reverseDigits(number);
        int index = tree.getNodeIndex(value);
        boolean contains = tree.containsNode(isValue);
        String traverseInOrder = tree.getTraverseInOrder(tree.root);
        String traversePreOrder = tree.getTraversePreOrder(tree.root);
        String traversePostOrder = tree.getTraversePostOrder(tree.root);
        String traverseLevelOrder = tree.getTraverseLevelOrder(tree.root);
        
        request.setAttribute("number", number);
        request.setAttribute("getTree", getTree);
        request.setAttribute("revNumber", revnumber);
        request.setAttribute("value", value);
        request.setAttribute("index", index);
        request.setAttribute("isValue", isValue);
        request.setAttribute("contains", contains);
        request.setAttribute("traverseInOrder", traverseInOrder); 
        request.setAttribute("traversePreOrder", traversePreOrder);
        request.setAttribute("traversePostOrder", traversePostOrder);
        request.setAttribute("traverseLevelOrder", traverseLevelOrder);
        request.getRequestDispatcher("lab6.jsp").forward(request, response);
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