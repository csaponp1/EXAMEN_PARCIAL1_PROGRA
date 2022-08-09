/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sapón Pérez
 */
abstract class Vehiculo_aereo extends Vehiculo {
    private int no_bobinas;
    private int pasajeros;
    private boolean luz_anticolision;
    private boolean comercial;

    public Vehiculo_aereo(){};
    public Vehiculo_aereo(int no_bobinas, int pasajeros, boolean luz_anticolision, boolean comercial, String color, int asientos, boolean activo) {
        super(color, asientos, activo);
        this.no_bobinas = no_bobinas;
        this.pasajeros = pasajeros;
        this.luz_anticolision = luz_anticolision;
        this.comercial = comercial;
    }

   

    public boolean isComercial() {
        return comercial;
    }

    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }

    public int getNo_bobinas() {
        return no_bobinas;
    }

    public void setNo_bobinas(int no_bobinas) {
        this.no_bobinas = no_bobinas;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean isLuz_anticolision() {
        return luz_anticolision;
    }

    public void setLuz_anticolision(boolean luz_anticolision) {
        this.luz_anticolision = luz_anticolision;
    }
    
    public void volar(){};
    
    
    
}
