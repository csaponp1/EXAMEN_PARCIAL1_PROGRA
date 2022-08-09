/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sapón Pérez
 */
abstract class Vehiculo_Terrestre extends Vehiculo {
    private String no_placa;
    private int no_ruedas;
    private boolean comercial;

    
    public Vehiculo_Terrestre(){};

    public Vehiculo_Terrestre(String no_placa, int no_ruedas, boolean comercial, String color, int asientos, boolean activo) {
        super(color, asientos, activo);
        this.no_placa = no_placa;
        this.no_ruedas = no_ruedas;
        this.comercial = comercial;
    }

    public String getNo_placa() {
        return no_placa;
    }

    public void setNo_placa(String no_placa) {
        this.no_placa = no_placa;
    }

    public int getNo_ruedas() {
        return no_ruedas;
    }

    public void setNo_ruedas(int no_ruedas) {
        this.no_ruedas = no_ruedas;
    }

    public boolean isComercial() {
        return comercial;
    }

    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }
  
    
    
    
   
    
    
}
