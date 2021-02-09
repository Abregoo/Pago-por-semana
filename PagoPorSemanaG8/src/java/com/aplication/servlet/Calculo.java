/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ale_a
 */
@WebServlet(name = "HorasTrabajador", urlPatterns = {"/HorasTrabajador"})
public class Calculo extends HttpServlet {

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
            String txtnombre = request.getParameter("txtnombre");
            int hnormal = 0, hdoble = 0, htriple = 0;
            double ptotal = 0, pnormal = 0, pdoble = 0, ptriple = 0;
            if (txtnombre != null) {
                int txthoras = Integer.valueOf(request.getParameter("txthoras"));
                double txtprecio = Double.valueOf(request.getParameter("txtprecio"));

                if (txthoras <= 44) {
                    //hora
                    hnormal = txthoras;
                    //pago
                    pnormal = txthoras * txtprecio;
                    ptotal = pnormal;
                }
                if (txthoras > 44 && txthoras <= 50) {
                    //horas
                    hnormal = 44;
                    hdoble = txthoras - 44;

                    //pago
                    pnormal = hnormal * txtprecio;
                    pdoble = hdoble * (2 * txtprecio);
                    ptotal = pnormal + pdoble;
                }
                if (txthoras > 50) {
                    //horas
                    hnormal = 44;
                    hdoble = 6;
                    htriple = txthoras - 50;

                    //pago
                    pnormal = hnormal * txtprecio;
                    pdoble = hdoble * (2 * txtprecio);
                    ptriple = htriple * (3 * txtprecio);
                    ptotal = pnormal + pdoble + ptriple;
                }

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
                out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">");
                out.println("<title>Formulario Trabajador</title>");
                out.println("</head>");

                out.println("<body>");
                out.println("<div class=\"container\">");
                out.println("&nbsp;&nbsp;");
                out.println("<h1 class=\"text-secondary border border-primary border-top-0 border-left-0 border-right-0\">Resultados - GRUPO 8</h1>");
                out.println("&nbsp;&nbsp;");
                out.println("</body>");
                
                out.println("<table class=\"table table-bordered  table-info\">");
                out.println("<tr><td colspan=\"2\"><h2 class=\"text-secondary\">Resultados del trabajador.</h2></td></tr>");
                out.println("<tr><td>Nombre del empleado: </td><td>" + txtnombre + "</td></tr>");
                out.println("<tr><td>Total horas trabajadas:</td><td>" + txthoras + "</td></tr>");
                out.println("<tr><td>Horas trabajadas normales:</td><td>" + hnormal + "</td></tr>");
                out.println("<tr><td>Horas trabajadas dobles:</td><td>" + hdoble + "</td></tr>");
                out.println("<tr><td>Horas trabajadas triples:</td><td>" + htriple + "</td></tr>");
                out.println("<tr><td>Pago de horas normales:</td><td> $" + pnormal + "</td></tr>");
                out.println("<tr><td>Pago de horas dobles:</td> <td>$" + pdoble + "</td></tr>");
                out.println("<tr><td>Pago de horas triples:</td><td>$" + ptriple + "</td></tr>");
                out.println("<tr><td>Pago Neto:</td><td>$" + ptotal + "</td></tr>");
                out.println("</table>");
                
                out.println("<a href=\"/PagoPorSemanaG8/\"><h4  class=\"text-primary border border-primary border-top-0 border-left-0 border-right-0\">Regresar Formulario Trabajador</h4></a>");
                out.println("</div>");
                out.println(" <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>");
                out.println("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>");
                out.println(" <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>");
                
                out.println("</body>");
                out.println("</html>");

            }
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
