/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Demian
 */
public class Cliente {
    int idclientes;
    String nombreCli;
    String apellidoCli;
    String direccionCli;
    String telefonoCli;
    public Cliente(){
    }
    public Cliente(String nombreCli, String apellidoCli, String direccionCli, String telefonoCli){
            this.nombreCli=nombreCli;
            this.apellidoCli=apellidoCli;
            this.direccionCli=direccionCli;
            this.telefonoCli=telefonoCli;
            
        }
    public int getIdcli(){
        return idclientes;
    }
    public void setIdcli(int idclientes){
        this.idclientes = idclientes;
    }
    public String getNombrecli(){
        return nombreCli;
    }
    public void setNombrecli(String nombreCli){
        this.nombreCli = nombreCli;
    }
    public String getApecli(){
        return apellidoCli;
    }
    public void setApecli(String apellidoCli){
        this.apellidoCli = apellidoCli;
    }
    public String getDircli(){
        return direccionCli;
    }
    public void setDircli(String direccionCli){
        this.direccionCli = direccionCli;
    }
    public String getTelfcli(){
        return telefonoCli;
    }
    public void setTelfcli(String telefonoCli){
        this.telefonoCli = telefonoCli;
    }
}
