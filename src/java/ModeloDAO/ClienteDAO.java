/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import conexion.conexiones;
import Interfaz.CRUDpersona;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Demian
 */
public class ClienteDAO implements CRUDpersona{
    conexiones cn=new conexiones();
    Connection conect;
    PreparedStatement ps;
    ResultSet rs;
    Cliente c=new Cliente();
    
    @Override
    public List listar(){
        ArrayList<Cliente>list=new ArrayList<>();
        String sql="select * from clientes";
        try {
            conect=cn.getConnection();
            ps=conect.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cli=new Cliente();
                cli.setIdcli(rs.getInt("idclientes"));
                cli.setNombrecli(rs.getString("nombreCli"));
                cli.setApecli(rs.getString("apellidoCli"));
                cli.setDircli(rs.getString("direccioncli"));
                cli.setTelfcli(rs.getString("telefonoCli"));
                list.add(cli);
            }
        } catch (Exception e){
        }
        return list;
    }
    
    @Override
    public Cliente list(int idclientes){
        String sql="select *from clientes where idclientes="+idclientes;
        try {
            conect=cn.getConnection();
            ps=conect.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                c.setIdcli(rs.getInt("indclientes"));
                c.setNombrecli(rs.getString("nombreCli"));
                c.setApecli(rs.getString("apellidoCli"));
                c.setDircli(rs.getString("direccioncli"));
                c.setTelfcli(rs.getString("telefonoCli"));
            }
        } catch (Exception e){
        }
        return c;
    }
    @Override
    public boolean add(Cliente cli){
        String sql="insert into clientes(nombreCli, apellidoCli, direccionCli, telefonoCli)values('"+cli.getNombrecli()+"','"+cli.getApecli()+"','"+cli.getDircli()+"','"+cli.getTelfcli()+"')";
        try {
            conect=cn.getConnection();
            ps=conect.prepareStatement(sql);
            ps.execute();
        } catch (Exception e){
        }
        return false;
    }
    @Override
    public boolean edit(Cliente cli){
        String sql ="update clientes set nombreCli='"+cli.getNombrecli()+"' where idclientes=''"+cli.getIdcli();
        try {
            conect=cn.getConnection();
            ps=conect.prepareStatement(sql);
            ps.execute();
        } catch (Exception e){
        }
        return false;
    }
    @Override
    public boolean eliminar(int idclientes){
        String sql ="delet from clientes where idclientes="+idclientes;
        try {
            conect=cn.getConnection();
            ps=conect.prepareStatement(sql);
            ps.execute();
        } catch (Exception e){
        }
        return false;
    }
}

