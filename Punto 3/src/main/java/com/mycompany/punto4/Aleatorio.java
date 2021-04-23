//JUAN PABLO MEJIA PEREZ
package com.mycompany.punto4;
import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/aleatorios")

public class Aleatorio extends HttpServlet{
    private int[] arreglo; 
    @Override
    public void init(){
       arreglo= new int[10];
       for (int x=0;x<arreglo.length;x++)
        arreglo[x] = (int) (Math.random()*20)+1;
    }
    
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
        throws ServletException, IOException {
        PrintWriter out = respuesta.getWriter();
        int aux=0;
        String salida="";
        out.println("<!DOCTYPE html>");
        out.println("<html lang\"es\">");
        out.println("<head>");
        out.println("<title>Hipotenusa</title>");            
        out.println("</head>");
        out.println("<body>");
        for (int x=0;x<arreglo.length;x++){
        salida+=arreglo[x]+"   |   ";
        aux+= arreglo[x];
        }
        out.println("<h1> Arreglo "+"</h1>");
        out.println("<h1>"+salida+"</h1>");
        out.println("<h1> Suma "+"</h1>");
        out.println("<h1>"+aux+"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
