/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PureMart.Datos;

import com.PureMart.Entidad.Autor;
import java.util.List;

/**
 *
 * @author Jeff
 */
public interface iDaoAutor {
    public abstract Autor buscarAutorporId(int id_autor);
    public abstract Boolean registrarAutor(Autor autor);
    public abstract List<Autor> listarAutor();
    public abstract Autor modificarAutorporId(int id_autor, String nombre, String apellido);

}
