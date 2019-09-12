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
public class Mesas {
    int idmesas;
    String mesas;
    String descripcionmesa;
    String estadomesa;
    public Mesas(){
    }
    public Mesas(String mesas, String descripcionmesa, String estadomesa){
        this.mesas=mesas;
        this.descripcionmesa=descripcionmesa;
        this.estadomesa=estadomesa;
    }
    public int getIdmesas(){
        return idmesas;
    }
    public void setIdmesas(int idmesas){
        this.idmesas = idmesas;
    }
    public String getMesas(){
        return mesas;
    }
    public void setMesas(String mesas){
        this.mesas = mesas;
    }
    public String getDescrimesa(){
        return descripcionmesa;
    }
    public void setDescrimesa(String descripcionmesa){
        this.descripcionmesa = descripcionmesa;
    }
    public String getEstadomesa(){
        return estadomesa;
    }
    public void setEstadomesa(String estadomesa){
        this.estadomesa = estadomesa;
    }
}
