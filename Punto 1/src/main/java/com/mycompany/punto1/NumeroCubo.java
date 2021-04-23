//JUAN PABLO MEJIA PEREZ
package com.mycompany.punto1;
import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/numerocubo")

public class NumeroCubo extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)throws ServletException, IOException {
        PrintWriter out = respuesta.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang\"es\">");
        out.println("<head>");
        out.println("<title>Numero Al cubo</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> El numero:  " +peticion.getParameter("base")+ "  al cubo es:  " + 
                Math.pow(Integer.valueOf (peticion.getParameter("base")),3) +"</h1>");
        out.println("</body>");
        out.println("</html>");
}

}
