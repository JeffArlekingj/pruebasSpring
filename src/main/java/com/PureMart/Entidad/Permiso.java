package com.PureMart.Entidad;

/**
 * Created by Jeff on 12/07/2017.
 */
public class Permiso {
    private String id_permiso;
    private String nombre;
    private String url;

    public Permiso(String id_permiso, String nombre, String url) {
        this.id_permiso = id_permiso;
        this.nombre = nombre;
        this.url = url;
    }

    public String getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(String id_permiso) {
        this.id_permiso = id_permiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
