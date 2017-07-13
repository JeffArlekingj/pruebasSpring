/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PureMart.Datos;

import com.PureMart.Entidad.Autor;
import com.PureMart.Entidad.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeff
 */
public class DaoAutor implements iDaoAutor {

    @Override
    public Autor buscarAutorporId(int id_autor) {
        Autor au = null;
        String sql = "select * from autores where id = ?";
        try {
            Connection c = new bd().obtieneConexionMysql();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, id_autor);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                au = new Autor(rs.getInt("id"),rs.getString("nombre") , rs.getString ("apellido_paterno"),rs.getString("apellido_materno"));
            }           
            rs.close();
            pst.close();
            c.close();
            
        } catch (Exception e) {
            System.out.println("Error del metodo bsucar autor por id" +e) ;
        }
        return au;
    }

    @Override
    public Boolean registrarAutor(Autor autor) {
        boolean aceptado = false;
        String sql= "insert into autores values (null, ? ,? ,? )";
        
        try {
            Connection c = new bd().obtieneConexionMysql();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, autor.getNombre());
            pst.setString(2, autor.getApellido_materno());
            pst.setString(3, autor.getApellido_paterno());
            pst.executeUpdate();
            aceptado = true;
            
            pst.close();          
            c.close();
            
        } catch (Exception e) {
            System.out.println("Error al registrar un autor" +e);
        }
        return aceptado;
    }

    @Override
    public List<Autor> listarAutor() {
        List<Autor> listAutores = new ArrayList<Autor>();
        String sql = "select * from autores";
        try {
            Connection c = new bd().obtieneConexionMysql();
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               Autor au = new Autor(0, rs.getString("nombre"), rs.getString("apellido_paterno"),rs.getString("apellido_materno"));
               listAutores.add(au);
            }
            rs.close();
            pst.close();
            c.close();
            
        } catch (Exception e) {
            System.out.println("Error al listar autores" +e);
        }
        return listAutores;
    }

    @Override
    public Autor modificarAutorporId(int id_autor, String nombre, String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
