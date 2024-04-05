import java.util.Scanner;

public class Proveedores {
    public static void main(String[] args) {
        Supermercado mercadona = new Supermercado("Mercadona");
        Supermercado aldi = new Supermercado("Aldi");
        Supermercado carrefour = new Supermercado("Carrefour");
        Supermercado lidl = new Supermercado("Lidl");
        Supermercado dia = new Supermercado("Dia");
        Supermercado[] aSupermercados = { mercadona, aldi, carrefour, lidl, dia };
        Productos leche = new Productos("Leche", 1.40);
        Productos jamon = new Productos("Jamon", 2.35);
        Productos yogures = new Productos("Yogures", 2.60);
        Productos pan = new Productos("Pan de molde", 1.20);
        Productos huevos = new Productos("Huevos", 1.50);
        Productos arroz = new Productos("Arroz", 0.80);
        Productos tomates = new Productos("Tomates", 1.00);
        Productos manzanas = new Productos("Manzanas", 1.20);
        Productos cafe = new Productos("Café", 2.50);
        Productos aceiteOliva = new Productos("Aceite de oliva", 3.00);
        Productos[] aProductos = { leche, jamon, yogures, pan, huevos, arroz, tomates, manzanas, cafe, aceiteOliva };
        int opcionElegida = 0;
        int i = 0;
        double precioTotal = 0;
        int[] unidadesTotales = new int[aProductos.length];
        double[] preciosTotales = new double[aProductos.length];
        boolean continuar = true;
        Scanner menuProductos = new Scanner(System.in);
        while (continuar) {
            for (int k = 0; k < aProductos.length; k++) {
                unidadesTotales[k] = 0;
                preciosTotales[k] = 0;
            }
            i = 0;
            precioTotal = 0;
            while (i != 5) {
                opcionElegida = 0;
                while (opcionElegida != -1) {
                    System.out.println(aSupermercados[i].getNombre() + ":");
                    System.out.println("¿Que producto se suministra (1-10)?");
                    opcionElegida = menuProductos.nextInt();
                    if (opcionElegida > 0 && opcionElegida <= 10) {
                        System.out.println(aProductos[opcionElegida - 1].getNombre() + " "
                                + aProductos[opcionElegida - 1].getPrecio() + " euros");
                        System.out.println("Introduce el número de unidades");
                        int numeroUnidades = menuProductos.nextInt();
                        double precioActual = aProductos[opcionElegida - 1].getPrecio() * numeroUnidades;
                        System.out.println("Total: " + precioActual + " euros");
                        precioTotal = precioTotal + precioActual;
                        unidadesTotales[opcionElegida - 1] += numeroUnidades;
                        preciosTotales[opcionElegida - 1] += precioActual;
                        aSupermercados[i].addProducto(aProductos[opcionElegida - 1], numeroUnidades, precioActual);
                    }
                }
                System.out.println(aSupermercados[i].getInfo());
                i++;
            }
            double precioTotalRedondeado = Math.round(precioTotal * 100) / 100.0;
            System.out.println("Lista de todos los productos y el precio total:");
            for (int k = 0; k < aProductos.length; k++) {
                System.out.println(aProductos[k].getNombre() + ", " + unidadesTotales[k] + " unidades, "
                        + preciosTotales[k] + " euros");
            }
            System.out.println("El precio total de todos los productos es: " + precioTotalRedondeado + " euros");
            System.out.println("¿Quieres volver a repetir otra ronda de suministro? (si/no)");
            String respuesta = menuProductos.next();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }
    }
}
