/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vero_
 */
public class Animal {

    protected String nombre;
    protected double peso;
    protected int edad;

    public Animal(String nombre, double peso, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public String obtenerTipo() {
    return "Animal";
}

    @Override
    public String toString() {
        return nombre + " : " + peso + " kg, " + edad + " años)";
    }
}

