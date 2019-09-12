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
public class Productos {
    int idproductos;
    String descripcionPro;
    String precioPro;
    
    public Productos(){
    }
    public Productos(String descripcionPro, String precioPro){
        this.descripcionPro=descripcionPro;
        this.precioPro=precioPro;
    }
    public int getIdpro(){
        return idproductos;
    }
    public void setIdpro(int idproductos){
        this.idproductos = idproductos;
    }
    public String getDespro(){
        return descripcionPro;
    }
    public void setDespro(String descripcionPro){
        this.descripcionPro = descripcionPro;
    }
    public String getPreciopro(){
        return precioPro;
    }
    public void setPreciopro(String precioPro){
        this.precioPro = precioPro;
    }
}
