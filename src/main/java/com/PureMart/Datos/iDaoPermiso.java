/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PureMart.Datos;

/**
 *
 * @author Jeff
 */
public interface iDaoPermiso {
    public abstract String buscarPersonaporUsername(String username);
    public abstract String asignarPermisoporIdaUsername (int id, String unsername);
}
