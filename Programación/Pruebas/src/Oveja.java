/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vero_
 */
public class Oveja extends Animal {

    private String tipoPelo;

    public Oveja(String nombre, double peso, int edad, String tipoPelo) {
        super(nombre, peso, edad);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

 
    public String obtenerTipo() {
        return "Oveja";
    }

    @Override
    public String toString() {
        return super.toString() + " tipo pelo: " + tipoPelo ;
    }
}
