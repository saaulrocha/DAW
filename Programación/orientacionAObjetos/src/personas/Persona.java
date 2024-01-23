package personas;

import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;
    double estatura;
    boolean casado;

    void presentarse() {
        System.out.printf("Me llamo " + nombre + ". Tengo " + edad + " años y mido %.2f", +estatura);
        if (casado) {
            System.out.println(", Si estoy casado");
        } else {
            System.out.println(", No estoy casado");
        }
    }

    double crecer(double cm) {
        estatura += cm;
        return estatura;
    }

    boolean casar() {
        if (!casado) {
            casado = true;
            return casado;
        } else
            return false;
    }

    int cumplirAno() {
        edad++;
        return edad;
    }

    double calcularAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del triángulo equilátero: ");
        double longitudLado = scanner.nextDouble();
        double altura = (Math.sqrt(3) / 2) * longitudLado;
        scanner.close();
        return altura;
    }
}
