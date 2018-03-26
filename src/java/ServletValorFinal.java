/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.pow;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Andrade
 */
@WebServlet(urlPatterns = {"/juros.html"})
public class ServletValorFinal extends HttpServlet {
    
    private double taxa = 0.01;
    private double montante;
    private double capital = 5000.00;
    private int tempo = 12;

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    montante = capital*pow((1+taxa),12);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletValorFinal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Para um investimento inicial de R$"
                    + capital +" a uma taxa de juros compostos de "
                            + taxa +"ao mês, você terá R$"
                                    + montante +" ao final de "
                                            + tempo +" meses!</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
}
