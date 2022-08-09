/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sapón Pérez
 */
public class Helicoptero extends Vehiculo_aereo{
    
     private int capacidad_pasaje;
     private int no_rotores;
     private String modelo_rotor_antipar;
     private int capacidad_max_tanque;
     
     public Helicoptero(){};

    public Helicoptero(int capacidad_pasaje, int no_rotores, String modelo_rotor_antipar, int capacidad_max_tanque, int no_bobinas, int pasajeros, boolean luz_anticolision, boolean comercial, String color, int asientos, boolean activo) {
        super(no_bobinas, pasajeros, luz_anticolision, comercial, color, asientos, activo);
        this.capacidad_pasaje = capacidad_pasaje;
        this.no_rotores = no_rotores;
        this.modelo_rotor_antipar = modelo_rotor_antipar;
        this.capacidad_max_tanque = capacidad_max_tanque;
    }
     
     //metodos get y set

    public int getCapacidad_pasaje() {
        return capacidad_pasaje;
    }

    public void setCapacidad_pasaje(int capacidad_pasaje) {
        this.capacidad_pasaje = capacidad_pasaje;
    }

    public int getNo_rotores() {
        return no_rotores;
    }

    public void setNo_rotores(int no_rotores) {
        this.no_rotores = no_rotores;
    }

    public String getModelo_rotor_antipar() {
        return modelo_rotor_antipar;
    }

    public void setModelo_rotor_antipar(String modelo_rotor_antipar) {
        this.modelo_rotor_antipar = modelo_rotor_antipar;
    }

    public int getCapacidad_max_tanque() {
        return capacidad_max_tanque;
    }

    public void setCapacidad_max_tanque(int capacidad_max_tanque) {
        this.capacidad_max_tanque = capacidad_max_tanque;
    }
     
   
    public void encender_luz(){};
    
    
}
