/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sapón Pérez
 */
public class Automovil extends Vehiculo_Terrestre {
    private String mecanismo;
    private int no_puertas;
    private String marca;
    private String modelo;
    private String no_chasis;
    
    Automovil(){};

    public Automovil(String mecanismo, int no_puertas, String marca, String modelo, String no_chasis, String no_placa, int no_ruedas, boolean comercial, String color, int asientos, boolean activo) {
        super(no_placa, no_ruedas, comercial, color, asientos, activo);
        this.mecanismo = mecanismo;
        this.no_puertas = no_puertas;
        this.marca = marca;
        this.modelo = modelo;
        this.no_chasis = no_chasis;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    public int getNo_puertas() {
        return no_puertas;
    }

    public void setNo_puertas(int no_puertas) {
        this.no_puertas = no_puertas;
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

    public String getNo_chasis() {
        return no_chasis;
    }

    public void setNo_chasis(String no_chasis) {
        this.no_chasis = no_chasis;
    }

    public void girar_izquierda(){};
    
    public void girar_derecha(){};
    
    public void arrancar(){};
    
    public void apagar(){};
    
    public void sonar_claxon(){};
    
    
}
