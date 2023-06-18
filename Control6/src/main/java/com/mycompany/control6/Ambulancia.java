/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control6;

/**
 *
 * @author diego
 */
public class Ambulancia {
    private int id;
    private Coordenada ubicacion;
    private boolean disponible;

    public Ambulancia(int id, Coordenada ubicacion, boolean disponible) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.disponible = disponible;
    }
    
    
    

    public int getId() {
        return id;
    }

    public Coordenada getUbicacion() {
        return ubicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUbicacion(Coordenada ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
    
}
