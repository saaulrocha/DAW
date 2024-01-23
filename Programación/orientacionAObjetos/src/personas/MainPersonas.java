package personas;

import java.util.Scanner;

public class MainPersonas {
    public static void main(String[] args) throws Exception {
        Persona p;
        p = new Persona();

        p.nombre = "Saúl";
        p.edad = 19;
        p.estatura = 1.75;
        p.casado = false;

        p.presentarse();
        p.crecer(0.03);
        p.presentarse();
        double test = p.calcularAltura();
    }
}
