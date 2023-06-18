/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control6;

/**
 *
 * @author diego
 */
public class LlamadaEmergencia {
    private int id;
    private Coordenada ubicacion;
    private boolean asignada;

    public LlamadaEmergencia(int id, Coordenada ubicacion, boolean asignada) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.asignada = asignada;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coordenada getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Coordenada ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isAsignada() {
        return asignada;
    }

    public void setAsignada(boolean asignada) {
        this.asignada = asignada;
    }

    
    
}
