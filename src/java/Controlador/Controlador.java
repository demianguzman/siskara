/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


/*colocar los modelos*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Demian
 */
public class Controlador extends HttpServlet{
    String mostrar="Vistas/mostrar.jsp";
    String ingresar="Vistas/mostrar.jsp";
    String editar="Vistas/mostrar.jsp";
    String volver="Vistas/mostrar.jsp";
    Usuario user=new UsuarioDAO();
    int idusuario;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            
        }
    }
    
}
