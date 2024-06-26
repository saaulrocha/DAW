/**
 * @autor:    Saúl Rocha
 * @version: 5.0
 */
package figurasGeometricas;

public class mainFiguras {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro(1, "pequeno", 1);
        Cilindro cilindro2 = new Cilindro(2, "mediano", 2);
        Cilindro cilindro3 = new Cilindro(3, "grande", 3);
        Esfera esfera1 = new Esfera(1, "pequena");
        Esfera esfera2 = new Esfera(2, "mediana");
        Esfera esfera3 = new Esfera(3, "grande");
        Ortoedro ortoedro1 = new Ortoedro("pequeno", 1, 1, 1, 1);
        Ortoedro ortoedro2 = new Ortoedro("mediano", 2, 2, 2, 2);
        Ortoedro ortoedro3 = new Ortoedro("grande", 3, 3, 3, 3);
        System.out.println("Figuras Geometricas");
        System.out.println("Cilindro 1:");
        cilindro1.asignarColorCilindro();
        System.out.printf("La superficie del cilindro " + cilindro1.getTamanoCilindro() + " y " + cilindro1.getColorCilindro()+ " es %.2f", cilindro1.obtenerSuperficieCilindro());
        System.out.println();
        System.out.printf("El volumen del cilindro " + cilindro1.getTamanoCilindro() + " y " + cilindro1.getColorCilindro()+ " es %.2f", cilindro1.obtenerVolumenCilindro());
        System.out.println();
        System.out.println("Cilindro 2:");
        cilindro2.asignarColorCilindro();
        System.out.printf("La superficie del cilindro " + cilindro2.getTamanoCilindro() + " y " + cilindro2.getColorCilindro()+ " es %.2f", cilindro2.obtenerSuperficieCilindro());
        System.out.println();
        System.out.printf("El volumen del cilindro " + cilindro2.getTamanoCilindro() + " y " + cilindro2.getColorCilindro()+ " es %.2f", cilindro2.obtenerVolumenCilindro());
        System.out.println();
        System.out.println("Cilindro 3:");
        cilindro3.asignarColorCilindro();
        System.out.printf("La superficie del cilindro " + cilindro3.getTamanoCilindro() + " y " + cilindro3.getColorCilindro()+ " es %.2f", cilindro3.obtenerSuperficieCilindro());
        System.out.println();
        System.out.printf("El volumen del cilindro " + cilindro3.getTamanoCilindro() + " y " + cilindro3.getColorCilindro()+ " es %.2f", cilindro3.obtenerVolumenCilindro());
        System.out.println();
        System.out.println("Esfera 1:");
        esfera1.asignarColorEsfera();
        System.out.printf("La superficie de la esfera " + esfera1.getTamanoEsfera() + " y " + esfera1.getColorEsfera()+ " es %.2f", esfera1.obtenerSuperficieEsfera());
        System.out.println();
        System.out.printf("El volumen de la esfera " + esfera1.getTamanoEsfera() + " y " + esfera1.getColorEsfera()+ " es %.2f", esfera1.obtenerVolumenEsfera());
        System.out.println();
        System.out.println("Esfera 2:");
        esfera2.asignarColorEsfera();
        System.out.printf("La superficie de la esfera " + esfera2.getTamanoEsfera() + " y " + esfera2.getColorEsfera()+ " es %.2f", esfera2.obtenerSuperficieEsfera());
        System.out.println();
        System.out.printf("El volumen de la esfera " + esfera2.getTamanoEsfera() + " y " + esfera2.getColorEsfera()+ " es %.2f", esfera2.obtenerVolumenEsfera());
        System.out.println();
        System.out.println("Esfera 3:");
        esfera3.asignarColorEsfera();
        System.out.printf("La superficie de la esfera " + esfera3.getTamanoEsfera() + " y " + esfera3.getColorEsfera()+ " es %.2f", esfera3.obtenerSuperficieEsfera());
        System.out.println();
        System.out.printf("El volumen de la esfera " + esfera3.getTamanoEsfera() + " y " + esfera3.getColorEsfera()+ " es %.2f", esfera3.obtenerVolumenEsfera());
        System.out.println();

        System.out.println("Ortoedro 1:");
        ortoedro1.asignarColorOrtoedro();
        System.out.printf("La superficie del ortoedro " + ortoedro1.getTamanoOrtoedro() + " y " + ortoedro1.getColorOrtoedro()+ " es %.2f", ortoedro1.obtenerSuperficieOrtoedro());
        System.out.println();
        System.out.printf("El volumen del ortoedro " + ortoedro1.getTamanoOrtoedro() + " y " + ortoedro1.getColorOrtoedro()+ " es %.2f", ortoedro1.obtenerVolumenOrtoedro());
        System.out.println();
        System.out.println("Ortoedro 2:");
        ortoedro2.asignarColorOrtoedro();
        System.out.printf("La superficie del ortoedro " + ortoedro2.getTamanoOrtoedro() + " y " + ortoedro2.getColorOrtoedro()+ " es %.2f", ortoedro2.obtenerSuperficieOrtoedro());
        System.out.println();
        System.out.printf("El volumen del ortoedro " + ortoedro2.getTamanoOrtoedro() + " y " + ortoedro2.getColorOrtoedro()+ " es %.2f", ortoedro2.obtenerVolumenOrtoedro());
        System.out.println();
        System.out.println("Ortoedro 3:");
        ortoedro3.asignarColorOrtoedro();
        System.out.printf("La superficie del ortoedro " + ortoedro3.getTamanoOrtoedro() + " y " + ortoedro3.getColorOrtoedro()+ " es %.2f", ortoedro3.obtenerSuperficieOrtoedro());
        System.out.println();
        System.out.printf("El volumen del ortoedro " + ortoedro3.getTamanoOrtoedro() + " y " + ortoedro3.getColorOrtoedro()+ " es %.2f", ortoedro3.obtenerVolumenOrtoedro());
        System.out.println();     
    }
}
