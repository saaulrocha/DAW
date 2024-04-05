/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vero_
 */
public class Cerdo extends Animal {

    private String colorPiel;

    public Cerdo(String nombre, double peso, int edad, String colorPiel) {
        super(nombre, peso, edad);
        this.colorPiel = colorPiel;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

     public String obtenerTipo() {
        return "Cerdo";
    }

    @Override
    public String toString() {
        return super.toString() + " color piel: " + colorPiel;
    }
}

