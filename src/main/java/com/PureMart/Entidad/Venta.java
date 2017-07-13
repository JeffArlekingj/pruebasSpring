package com.PureMart.Entidad;

import java.sql.Date;

/**
 * Created by Jeff on 12/07/2017.
 */
public class Venta {
    private String id;
    private Date fecha;
    private String dni_cliente;

    public Venta(String id, Date fecha, String dni_cliente) {
        this.id = id;
        this.fecha = fecha;
        this.dni_cliente = dni_cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }
    
    
}
