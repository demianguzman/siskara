/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Cliente;
import java.util.List;
/**
 *
 * @author Demian
 */
public interface CRUDpersona {
    public List listar();
    public Cliente list(int idclientes);
    public boolean add(Cliente cli);
    public boolean edit(Cliente cli);
    public boolean eliminar(int idclientes);
}
