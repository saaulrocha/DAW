import java.util.ArrayList;
import java.util.HashMap;
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
        Scanner menuProductos = new Scanner(System.in);
        int opcionElegida = 0;
        int i = 0;
        boolean acabado = false;
        HashMap<String, String> productoporSupermercado = new HashMap<String, String>();
        HashMap<String, Integer> cantidadporProducto = new HashMap<String, Integer>();
        int j = 0;
        double precioTotal = 0;
        while (!acabado) {
            while (i != 5) {
                while (opcionElegida != -1) {
                    System.out.println(aSupermercados[i].getNombre() + ":");
                    System.out.println("¿Que producto se suministra (1-10)?");
                    opcionElegida = menuProductos.nextInt();
                    if (opcionElegida > 0 && opcionElegida <= 10) {
                        j++;
                        System.out.println(aProductos[opcionElegida - 1].getNombre() + " "
                                + aProductos[opcionElegida - 1].getPrecio() + " euros");
                        System.out.println("Introduce el número de unidades");
                        int numeroUnidades = menuProductos.nextInt();
                        String supermercadoActual = aSupermercados[i].getNombre() + Integer.toString(i + 1);
                        productoporSupermercado.put(supermercadoActual, aProductos[opcionElegida - 1].getNombre());
                        String productoActual = aProductos[opcionElegida - 1].getNombre() + Integer.toString(i + 1);
                        cantidadporProducto.put(productoActual, numeroUnidades);
                        double precioActual = aProductos[opcionElegida - 1].getPrecio() * numeroUnidades;
                        System.out.println("Total: " + precioActual + " euros");
                        precioTotal = precioTotal + precioActual;
                     }
                    }
                i++;
                opcionElegida = 0;
                }
            }
            double precioTotalRedondeado = Math.round(precioTotal * 100) / 100.0;
            System.out.println("El precio total de todos los productos es: " + precioTotalRedondeado);
            acabado = true;
        }
    }
