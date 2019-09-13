/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


/*colocar los modelos*/
import Modelo.Cliente;
import ModeloDAO.ClienteDAO;
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
    String mostrar="Vistas/listar.jsp";
    String ingresar="Vistas/add.jsp";
    String editar="Vistas/edit.jsp";
    String volver="Vistas/index.jsp";
    Cliente cli=new Cliente();
    ClienteDAO clidao=new ClienteDAO();
    int idusuario;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Controlador Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Controlador Servelt de" + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }
    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String ingreso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            ingreso=mostrar;
        }else if (action.equalsIgnoreCase("add")){
            ingreso=ingresar;
        }else if(action.equalsIgnoreCase("inicio")){
            ingreso=volver;
        }
        else if(action.equalsIgnoreCase("agregar")){
            String nombrecli=request.getParameter("txtnombrecli");
            String apellidocli=request.getParameter("txtapellidocli");
            String direccioncli=request.getParameter("txtdireccioncli");
            String telefonocli=request.getParameter("txttelefonocli");
            cli.setNombrecli(nombrecli);
            cli.setApecli(apellidocli);
            cli.setDircli(direccioncli);
            cli.setTelfcli(telefonocli);
            clidao.add(cli);
            ingreso=mostrar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idclientes", request.getParameter("idclientes"));
            ingreso=editar;
        }
        else if(action.equalsIgnoreCase("actualizar")){
            idusuario=Integer.parseInt(request.getParameter("txtindclientes"));
            String nombrecli=request.getParameter("txtnombrecli");
            String apellidocli=request.getParameter("txtapellidocli");
            String direccioncli=request.getParameter("txtdireccioncli");
            String telefonocli=request.getParameter("txttelefonocli");
            cli.setIdcli(idusuario);
            cli.setNombrecli(nombrecli);
            cli.setApecli(apellidocli);
            cli.setDircli(direccioncli);
            cli.setTelfcli(telefonocli);
            clidao.edit(cli);
            ingreso=mostrar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            idusuario=Integer.parseInt(request.getParameter("idclientes"));
            cli.setIdcli(idusuario);;
            clidao.eliminar(idusuario);
            ingreso=mostrar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(ingreso);
        vista.forward(request, response);
        
     /*   @Override
        public String getServletInfo(){
                return "Descripcion corta";
            }*/
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request, response);
    }
    @Override
    public String getServletInfo(){
        return "descripcion corta";
    }
}
