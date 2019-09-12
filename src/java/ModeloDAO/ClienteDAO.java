/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

/**
 *
 * @author Demian
 */
public class ClienteDAO {
    import conexion.conexiones;
    import Interfaz.CRUD;
    import Modelo.Cliente;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.util.ArrayList;
    import java.util.List;
    
    public class ClienteDAO implements CRUD{
     conexiones cn=new conexiones();
     Connection conect;
        PreparedStatement ps;
        ResultSet rs;
        Cliente c=new Cliente();
        
        @Override
        public List listar)(){
        ArrayList<Cliente>list=new ArrayList<>();
        String sql="select * from clientes";
        try {
            conect=cn getConnection();
            ps=conect.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cli=new Cliente();
                cli.setIdcli(rs.getIdcli("idclientes"));
                cli.setNombrecli(rs.getNombrecli("nombreCli"));
                cli.setApecli(rs.getApecli("apellidoCli"));
                cli.setDircli(rs.getDircli("direccioncli"));
                cli.setTelfcli(rs.getTelfcli("telefonoCli"));
                list.add(cli);
            }
        } catch (Exception e){
        }
        return list;
    }
        
     @Override
     public Cliente list(int idclientes){
         String sql ="select * from clientes where idclientes="+idclientes;
         tryh {
         conect=cn.getConnection();
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){
             cli.setIdcli(rs.getIdcli("idclientes"));
                c.setNombrecli(rs.getNombrecli("nombreCli"));
                c.setApecli(rs.getApecli("apellidoCli"));
                c.setDircli(rs.getDircli("direccioncli"));
                c.setTelfcli(rs.getTelfcli("telefonoCli"));
         }
     }
     } catch (Exception e){
    }
    }
}
