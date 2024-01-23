package mago;

import java.util.Scanner;

public class MainMago {

	public static void main(String[] args) {

		Mago m1; // Declaro variable
		m1 = new Mago("Valdemort");

		Mago m2;
		m2 = new Mago("Gandalf", 97, 32, 4, 1);

        m2.dibujarEnTablero();
        m2.atacar();
        m2.atacar();
        m2.atacar();
 

    }
}