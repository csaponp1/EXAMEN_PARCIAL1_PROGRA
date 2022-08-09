/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sapón Pérez
 */
abstract class Vehiculo {
    private String color;
    private int asientos;
    private boolean activo;

    
    public Vehiculo(){};
    public Vehiculo(String color, int asientos, boolean activo) {
        this.color = color;
        this.asientos = asientos;
       
        this.activo = activo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }


    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void avanzar(){};
    public void retroceder(){};
    public void frenar(){};
    public void mostrar(){};
    
          
}
