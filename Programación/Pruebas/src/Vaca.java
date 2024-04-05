/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vero_
 */
public class Vaca extends Animal {

    private String uso;

    public Vaca(String nombre, double peso, int edad, String uso) {
        super(nombre, peso, edad);
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String obtenerTipo() {
        return "Vaca";
    }

    @Override
    public String toString() {
        return super.toString() + " uso: " + uso;
    }
}
