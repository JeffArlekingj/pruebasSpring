package com.PureMart.Entidad;

/**
 * Created by Jeff on 12/07/2017.
 */
public class Libro {
    private int id;
    private String titulo;
    private int id_autor;

    public Libro(int id, String titulo, int id_autor) {
        this.id = id;
        this.titulo = titulo;
        this.id_autor = id_autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }
    
    
}
