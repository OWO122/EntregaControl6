/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control6;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author diego
 */
public abstract class SistemaEmergencias implements InterfazSistema{
    
    protected ArrayList<LlamadaEmergencia>ListaLlamada = new ArrayList<>();
    protected HashMap<Integer, Ambulancia>HashAmbulancia = new HashMap<>();

    public SistemaEmergencias(ArrayList<LlamadaEmergencia> ListaLlamadas, HashMap<Integer, Ambulancia> HashAmbulancias) {
        this.ListaLlamada = ListaLlamadas;
        this.HashAmbulancia = HashAmbulancias;
    }

    public SistemaEmergencias(){
        
    }
    
    public ArrayList<LlamadaEmergencia> getListaLlamadas() {
        return ListaLlamada;
    }

    public void setListaLlamadas(ArrayList<LlamadaEmergencia> ListaLlamadas) {
        this.ListaLlamada = ListaLlamadas;
    }

    public HashMap<Integer, Ambulancia> getHashAmbulancias() {
        return HashAmbulancia;
    }

    public void setHashAmbulancias(HashMap<Integer, Ambulancia> HashAmbulancias) {
        this.HashAmbulancia = HashAmbulancias;
    }
    
    @Override
    public boolean agregarLlamada(LlamadaEmergencia llamada){

        for(int i = 0; i<ListaLlamada.size();i++){
            if (ListaLlamada.get(i).getId()==llamada.getId())
                return false;
        }
        ListaLlamada.add(llamada);
        return true;
    }
    
    @Override
    public void listarLlamadas(){
        
        for(int i = 0; i<ListaLlamada.size();i++){
            System.out.println("Id de la Llamada: " + ListaLlamada.get(i).getId());
            System.out.println("Ubicacion de la llamada: " + 
                ListaLlamada.get(i).getUbicacion().getX() + " ," +ListaLlamada.get(i).getUbicacion().getY());
            if(ListaLlamada.get(i).isAsignada())
                System.out.println("Llamada asignada");
            else
                System.out.println("Llamada no asignada");
        }
    }
    
    
    ///Asignar ambulancia mas cercana
    @Override
    public Ambulancia obtenerAmbulancia(LlamadaEmergencia llamada) {
        double distanciaMinima = 100000000000.0;
        Ambulancia ambulanciaMasCercana = null;

        for (Ambulancia ambulancia : HashAmbulancia.values()) {
            if (ambulancia.isDisponible()) {
                double distancia = llamada.getUbicacion().calculoDistancia(ambulancia.getUbicacion().getX(), ambulancia.getUbicacion().getY(), llamada.getUbicacion().getX(), llamada.getUbicacion().getY());

                if (distancia < distanciaMinima) {
                    distanciaMinima = distancia;
                    ambulanciaMasCercana = ambulancia;
                }
            }
        }

        if (ambulanciaMasCercana != null) {
            ambulanciaMasCercana.setDisponible(false);
        }

        return ambulanciaMasCercana;
    }
    
    @Override
    public void mostrarCoordenadasAmbulancia(Ambulancia ambulancia){
        System.out.println("Coordenadas de la Ambulancia :" + 
                ambulancia.getUbicacion().getX() + " ," + ambulancia.getUbicacion().getY());
    }
    @Override
    public void mostrarCoordenadasLlamada(LlamadaEmergencia llamada){
        System.out.println("Coordenadas de la Ambulancia :" + 
                llamada.getUbicacion().getX() + " ," + llamada.getUbicacion().getY());
    }
    
}