/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sapón Pérez
 */
public class Avion extends Vehiculo_aereo{
    
    private int capacidad_pasaje;
    private String pais_origen;
    private String pais_destino;
    private int ruedas;
    private int capacidad_max_tanque;
    
    public Avion(){};

    public Avion(int capacidad_pasaje, String pais_origen, String pais_destino, int ruedas, int capacidad_max_tanque, int no_bobinas, int pasajeros, boolean luz_anticolision, boolean comercial, String color, int asientos, boolean activo) {
        super(no_bobinas, pasajeros, luz_anticolision, comercial, color, asientos, activo);
        this.capacidad_pasaje = capacidad_pasaje;
        this.pais_origen = pais_origen;
        this.pais_destino = pais_destino;
        this.ruedas = ruedas;
        this.capacidad_max_tanque = capacidad_max_tanque;
    }

    public int getCapacidad_pasaje() {
        return capacidad_pasaje;
    }

    public void setCapacidad_pasaje(int capacidad_pasaje) {
        this.capacidad_pasaje = capacidad_pasaje;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getPais_destino() {
        return pais_destino;
    }

    public void setPais_destino(String pais_destino) {
        this.pais_destino = pais_destino;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getCapacidad_max_tanque() {
        return capacidad_max_tanque;
    }

    public void setCapacidad_max_tanque(int capacidad_max_tanque) {
        this.capacidad_max_tanque = capacidad_max_tanque;
    }
    
    public void encender_luz(){};
    
    public void alertar(){};
    
    public void enfriar_motor(){};
    
    public void automatico(){};
    
    
    
}
