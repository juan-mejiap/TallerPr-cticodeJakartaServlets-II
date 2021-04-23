//JUAN PABLO MEJIA PEREZ
package com.mycompany.punto2;
import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/hipotenusa")

public class CalcularH extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
        throws ServletException, IOException {
        PrintWriter out = respuesta.getWriter();
        
        String c1 = peticion.getParameter("cateto1");
        String c2 = peticion.getParameter("cateto2");
        out.println("<!DOCTYPE html>");
        out.println("<html lang\"es\">");
        out.println("<head>");
        out.println("<title>Hipotenusa</title>");            
        out.println("</head>");
        out.println("<body>");
        
        if(c1.isEmpty()|| c2.isEmpty()){
            out.println("<h1> SE OMITIO UNO DE LOS CATETOS "+"</h1>");
        }else {
            out.println("<h1> La hipotenusa de los catetos  "+c1+"  y  "+c2+"  es:  "+
                Math.hypot(Double.valueOf(c1), Double.valueOf(c2))+"</h1>");
        }
        out.println("</body>");
        out.println("</html>");
    }

}
