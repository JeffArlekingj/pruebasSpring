/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PureMart.Datos;

import com.PureMart.Entidad.Autor;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeff
 */
public class DaoAutorIT {
    
    public DaoAutorIT() {
    }

    /**
     * Test of buscarAutorporId method, of class DaoAutor.
     */
    
    public void testBuscarAutorporId() {
        DaoAutor daoau = new DaoAutor();
        Autor au = daoau.buscarAutorporId(1);
        System.out.println(au);
        assertNotNull(au);
    }

    /**
     * Test of registrarAutor method, of class DaoAutor.
     */
  
    public void testRegistrarAutor() {
        DaoAutor daoau = new DaoAutor();
        Autor au = new Autor(0, "german", "aleman", "quiroz");
         boolean resultado = daoau.registrarAutor(au);
         System.out.println(au);
         assertEquals(resultado, true);
        
    }

    /**
     * Test of listarAutor method, of class DaoAutor.
     */
    @Test
    public void testListarAutor() {
        DaoAutor daoau = new DaoAutor();
        List<Autor> lau = null;
        lau = daoau.listarAutor();
        System.out.println("listaAutores");
        for (Autor a:lau){
            System.out.println(a);
        }
        assertNotEquals(lau, null);
    }

    /**
     * Test of modificarAutorporId method, of class DaoAutor.
     */
 
    public void testModificarAutorporId() {
    }
    
}
