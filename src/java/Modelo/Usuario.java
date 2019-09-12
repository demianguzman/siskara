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
public class Usuario {
    int idusuario;
    String nombre;
    String apellido;
    String cargo;
    String telefono;
    String direccion;
    String claveacceso;
    public Usuario(){
    }
    public Usuario(String nombre, String apellido, String cargo, String telefono, String direccion, String claveacceso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.claveacceso = claveacceso;
    }
    public int getId(){
        return idusuario;
    }
    public void setId(int idusuario){
        this.idusuario = idusuario;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApe(){
        return apellido;
    }
    public void setId(String apellido){
        this.apellido = apellido;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getTelf(){
        return telefono;
    }
    public void setTelf(String telefono){
        this.telefono = telefono;
    }
    public String getDir(){
        return direccion;
    }
    public void setDir(String direccion){
        this.direccion = direccion;
    }
    public String getCA(){
        return claveacceso;
    }
    public void setCA(String claveacceso){
        this.claveacceso = claveacceso;
    }
}
