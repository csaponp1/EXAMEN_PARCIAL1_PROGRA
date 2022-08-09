/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sapón Pérez
 */
public class Motocicleta extends Vehiculo_Terrestre {
    
    private String mecanismo;
    private String marca;
    private String modelo;
    private String no_motor;
    private boolean enfriamiento;

    public Motocicleta(){};
    
   
    
    public Motocicleta(String mecanismo, String marca, String modelo, String no_motor, boolean enfriamiento, String no_placa, int no_ruedas, boolean comercial, String color, int asientos, boolean activo) {
        super(no_placa, no_ruedas, comercial, color, asientos, activo);
        this.mecanismo = mecanismo;
        this.marca = marca;
        this.modelo = modelo;
        this.no_motor = no_motor;
        this.enfriamiento = enfriamiento;
    }

    //metodos get y set

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNo_motor() {
        return no_motor;
    }

    public void setNo_motor(String no_motor) {
        this.no_motor = no_motor;
    }

    public boolean isEnfriamiento() {
        return enfriamiento;
    }

    public void setEnfriamiento(boolean enfriamiento) {
        this.enfriamiento = enfriamiento;
    }
    
    public void virar_izquierda(){};
    
    public void virar_derecha(){};
    
   
}
