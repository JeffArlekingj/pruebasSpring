/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PureMart.Datos;

import com.PureMart.Entidad.Usuario;

/**
 *
 * @author Jeff
 */
public interface iDaoUsuario {
    public abstract Boolean registrarUsuario(Usuario usu);
    public abstract Boolean validarUsuario (String username, String contrasena);
    public abstract String buscarPersonaPorUsername (String username);
}
