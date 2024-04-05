import java.util.ArrayList;
import java.util.Scanner;

public class Videoclub {
    public static void main(String[] args) {
        ArrayList<Peliculas> peliculas = new ArrayList<>();
        ArrayList<Cd> cds = new ArrayList<>();
        int opcionMenu = 0;
        Boolean menuCerrado = false;
        int dia = 0;
        int opcionMenu2 = 0;
        int gananciasPeliculas = 0;
        int gananciasCds = 0;
        int gananciasTotales = 0;
        while (!menuCerrado) {
            System.out.println("MENU: DIA " + dia + "\r\n" + //
                    "1.- Introducir nuevo producto.\r\n" + //
                    "2.- Eliminar producto\r\n" + //
                    "3.- Ver listado de películas\r\n" + //
                    "4.- Ver listado de CDs\r\n" + //
                    "5.- Alquilar película\r\n" + //
                    "6.- Vender CD\r\n" + //
                    "7.- Ver películas en alquiler\r\n" + //
                    "8.- Ver ganancias\r\n" + //
                    "9.- Pasar al día siguiente\r\n" + //
                    "0.- Salir");
            Scanner menuEnteros = new Scanner(System.in);
            Scanner menuStrings = new Scanner(System.in);

            while (!menuEnteros.hasNextInt()) {
                System.out.println(
                        "Por favor, ingresa un número entero, ingresa cualquier número para volver al menú principal");
                menuEnteros.next();
            }
            opcionMenu = menuEnteros.nextInt();
            switch (opcionMenu) {
                case 0:
                    System.out.println("Has salido con exito del programa del Videoclub");
                    menuCerrado = true;
                    break;
                case 1:
                    System.out.println("¿Que desea añadir?");
                    System.out.println("1. Añadir Pelicula");
                    System.out.println("2. Añadir CD");
                    while (!menuEnteros.hasNextInt()) {
                        System.out.println(
                                "Por favor, ingresa un número entero, ingresa cualquier número para volver al menú principal");
                        menuEnteros.next();
                    }
                    opcionMenu2 = menuEnteros.nextInt();
                    switch (opcionMenu2) {
                        case 1:
                            System.out.println("Introduce el título de la película");
                            String nombrePelicula = menuStrings.nextLine();
                            System.out.println("Introduce el estado de la película:");
                            // Novedades = 0, SemiNovedades = 1, Antiguas = 2;
                            System.out.println("0.- Novedades");
                            System.out.println("1.- Seminovedades");
                            System.out.println("2.- Antiguas");
                            int estadoPelicula = menuEnteros.nextInt();
                            while (estadoPelicula < 0 && estadoPelicula > 2) {
                                System.out.println("Introduce un estado válido");
                                estadoPelicula = menuEnteros.nextInt();
                            }
                            System.out.println("Introduce las unidades de este título a añadir");
                            int numeroPeliculas = menuEnteros.nextInt();
                            for (int i = 0; i < numeroPeliculas; i++) {
                                peliculas.add(new Peliculas(Peliculas.asignarCodigo(), nombrePelicula, estadoPelicula));
                            }
                            break;
                        case 2:
                            System.out.println("Introduce el nombre del CD");
                            String nombreCd = menuStrings.nextLine();
                            System.out.println("Introduce el autor o grupo del CD");
                            String autor = menuStrings.nextLine();
                            System.out.println("Introduce las unidades de este CD a añadir");
                            int numeroCds = menuEnteros.nextInt();
                            System.out.println("Introduce el precio del cd");
                            int precioCd = menuEnteros.nextInt();
                            for (int i = 0; i < numeroCds; i++) {
                                cds.add(new Cd(Cd.asignarCodigo(), nombreCd, autor, precioCd));
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Selecciona la pelicula o el CD a eliminar");
                    for (Peliculas pelicula : peliculas) {
                        System.out.println(pelicula.getCodigo() + " " + pelicula.getTitulo());
                    }
                    for (Cd cd : cds) {
                        System.out.println(cd.getCodigo() + " " + cd.getNombre() + " " + cd.getAutor());
                    }
                    System.out.println("Introduce el código de lo que deseas eliminar");
                    int productoEliminado = menuEnteros.nextInt();
                    if (productoEliminado >= 10000 && productoEliminado <= 19999) {
                        for (int i = 0; i < peliculas.size(); i++) {
                            if (peliculas.get(i).getCodigo() == productoEliminado) {
                                peliculas.remove(peliculas.get(i));
                            }
                        }
                    }
                    if (productoEliminado >= 20000) {
                        for (int i = 0; i < cds.size(); i++) {
                            if (cds.get(i).getCodigo() == productoEliminado) {
                                cds.remove(cds.get(i));
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Listado de peliculas");
                    for (Peliculas pelicula : peliculas) {
                        System.out.println(pelicula.getCodigo() + " " + pelicula.getTitulo());
                    }
                    break;
                case 4:
                    System.out.println("Listado de cds");
                    for (Cd cd : cds) {
                        System.out.println(cd.getCodigo() + " " + cd.getNombre() + " " + cd.getAutor());
                    }
                    break;
                case 5:
                    for (int i = 0; i < peliculas.size(); i++) {
                        if (peliculas.get(i).getDuracionAlquiler() == 0) {
                            System.out.println(peliculas.get(i).getCodigo() + " " + peliculas.get(i).getTitulo());
                        }
                    }
                    System.out.println("Elige la película que el cliente desea alquilar");
                    int peliEscogida = menuEnteros.nextInt();
                    for (int i = 0; i < peliculas.size(); i++) {
                        if (peliculas.get(i).getCodigo() == peliEscogida) {
                            peliculas.get(i).asignarPrecio();
                            gananciasPeliculas += peliculas.get(i).getPrecio();
                            System.out.println("La pelicula " + peliculas.get(i).getTitulo() + " ha sido alquilada por "
                                    + peliculas.get(i).getDuracionAlquiler() + " dias");
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < cds.size(); i++) {
                        System.out.println(
                                cds.get(i).getCodigo() + " " + cds.get(i).getNombre() + " de" + cds.get(i).getAutor());
                    }
                    System.out.println("Elige el CD que el cliente desea comprar");
                    int cdEscogido = menuEnteros.nextInt();
                    for (int i = 0; i < cds.size(); i++) {
                        if (cds.get(i).getCodigo() == cdEscogido) {
                            gananciasCds += cds.get(i).getPrecio();
                            System.out.println("El disco" + " " + cds.get(i).getNombre() + " de "
                                    + cds.get(i).getAutor() + " ha sido vendido por " + cds.get(i).getPrecio());
                            cds.remove(i);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Peliculas en alquiler:");
                    for (int i = 0; i < peliculas.size(); i++) {
                        if (peliculas.get(i).getDuracionAlquiler() > 0) {
                            System.out.println(peliculas.get(i).getTitulo() + " esta alquilada por "
                                    + peliculas.get(i).getDuracionAlquiler() + " días");
                        }
                    }
                    break;
                case 8:
                    gananciasTotales = gananciasCds + gananciasPeliculas;
                    System.out.println("Ganancias peliculas: " + gananciasPeliculas + " euros");
                    System.out.println("Ganancias CDS: " + gananciasCds + " euros");
                    System.out.println("Ganancias totales " + gananciasTotales + " euros");
                    break;
                case 9:
                    System.out.println("Desea pasar al día siguiente (s/n)?");
                    String opcString = menuStrings.nextLine();
                    if (opcString.equals("s")) {
                        dia++;
                        for (int i = 0; i < peliculas.size(); i++) {
                            if (peliculas.get(i).getDuracionAlquiler() > 0) {
                                peliculas.get(i).setDuracionAlquiler(peliculas.get(i).getDuracionAlquiler() - 1);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }
        }
    }
}
