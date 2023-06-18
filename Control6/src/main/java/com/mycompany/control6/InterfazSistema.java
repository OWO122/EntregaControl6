/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.control6;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface InterfazSistema {
    
    public void listarLlamadas();
    public boolean agregarLlamada(LlamadaEmergencia llamada);
    public Ambulancia obtenerAmbulancia(LlamadaEmergencia llamada);
    public void mostrarCoordenadasAmbulancia(Ambulancia ambulancia);
    public void mostrarCoordenadasLlamada(LlamadaEmergencia llamada);
}
