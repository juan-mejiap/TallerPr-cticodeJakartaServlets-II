//JUAN PABLO MEJIA PEREZ
package com.mycompany.punto3;
import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/Contse")

public class ContSesion extends HttpServlet{    
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
        throws ServletException, IOException {
        Integer ValSes =0;
        PrintWriter out = respuesta.getWriter();
        HttpSession se = peticion.getSession();
        ValSes = (Integer)se.getAttribute("num");
        if(ValSes == null){
            ValSes = 0;
        }
        out.println("<!DOCTYPE html>");
        out.println("<html lang\"es\">");
        out.println("<head>");
        out.println("<title>Hipotenusa</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> USTED HA INGRESADO "+ ValSes +"</h1>");
        out.println("</body>");
        out.println("</html>");
        ValSes++;
        se.setAttribute("num", ValSes);
    }
}
