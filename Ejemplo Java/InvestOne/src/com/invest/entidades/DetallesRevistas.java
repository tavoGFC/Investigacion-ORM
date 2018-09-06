/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invest.entidades;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ranmartz
 */

@Table(name="DetallesRevista")     //nombre de la tabla
@Entity                             //referecia a que es una entidad para hibernate (framework)
public class DetallesRevistas {
    
    @Id                             private int id;             //atributo identificado unico
    @Column(name = "Nombre")        private String nombre;      //atributo del nombre de la revista
    @Column(name = "Edicion")       private String edicion;     //atributo de la edicion o numero de la revista
    @Column(name = "Año")           private String Año;         //atributo del año de la revista

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edicion
     */
    public String getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    /**
     * @return the Año
     */
    public String getAño() {
        return Año;
    }

    /**
     * @param Año the Año to set
     */
    public void setAño(String Año) {
        this.Año = Año;
    }    
}
