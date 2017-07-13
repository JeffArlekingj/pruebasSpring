/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PureMart.Datos;

import com.PureMart.Entidad.Libro;
import java.util.List;

/**
 *
 * @author Jeff
 */
public interface iDaoLibro {
    public abstract List<Libro> listarLibros();
    public abstract Libro buscarLibroporId(int id);
    public abstract Boolean registrarLibro (Libro libro);
    public abstract Boolean modificarLibroporId (int id, String titulo, int id_autor);
}
