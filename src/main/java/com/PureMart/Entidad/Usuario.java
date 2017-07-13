package com.PureMart.Entidad;

/**
 * Created by Jeff on 12/07/2017.
 */
public class Usuario {
        private String username;
        private String contrasena;

    public Usuario(String username, String contrasena) {
        this.username = username;
        this.contrasena = contrasena;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
        
}
