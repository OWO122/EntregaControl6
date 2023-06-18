/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control6;

/**
 *
 * @author diego
 */
public class Coordenada {
    private int x,y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public double calculoDistancia(int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distancia;
    }
    
}    

