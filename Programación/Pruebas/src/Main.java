/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vero_
 */

import java.util.Scanner;

public class Main {

     private static final int NUM_ANIMALES = 6;
    private static Animal[] animales = new Animal[NUM_ANIMALES];
    private static int indiceCerdo = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        animales[0] = new Vaca("Romera", 230.5, 3, "leche");
        animales[1] = new Vaca("Facunda", 205.0, 2, "carne");
        animales[2] = new Cerdo("Felipe", 87.4, 1, "rosado");
        animales[3] = new Oveja("Mota", 40.0, 4, "rizado");
        animales[4] = new Oveja("Coral", 50.0, 4, "liso");
        animales[5] = new Oveja("Cebra", 37.6, 1, "rizado");

        indiceCerdo = buscarCerdo();

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    listarAnimales();
                    break;
                case 2:
                    mostrarTipoAnimal(scanner);
                    break;
                case 3:
                    sumarAnioAnimal(scanner);
                    break;
                case 4:
                    marcarAnimalMuerto(scanner);
                    break;
                case 5:
                    adquirirNuevoCerdo(scanner);
                    break;
                case 6:
                    listarAnimalesCompleto();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion != 0);

            System.out.println("¡Hasta pronto!");
          
        } 

   private static void mostrarMenu() {

    System.out.println("\n**Menú:**");
    System.out.println("1. Listado de animales");
    System.out.println("2. Mostrar tipo de animal");
    System.out.println("3. Sumar año a un animal");
    System.out.println("4. Marcar animal como muerto");
    System.out.println("5. Adquirir nuevo cerdo");
    System.out.println("6. Listado de animales completo");
    System.out.println("0. Salir");
    System.out.print("Introduzca una opción: ");
}

    private static void listarAnimales() {
        System.out.println("\n**Listado de animales:**");
        for (int i = 0; i < NUM_ANIMALES; i++) {
            if (animales[i] != null) {
                System.out.println(animales[i]);
            }
        }
    }

   private static void mostrarTipoAnimal(Scanner scanner) {
    System.out.println("\n**Mostrar tipo de animal:**");
    listarAnimales();
    System.out.print("Elige un animal (1-" + NUM_ANIMALES + "): ");
    int animalElegido = scanner.nextInt() - 1;

    if (animalElegido >= 0 && animalElegido < NUM_ANIMALES && animales[animalElegido] != null) {
        System.out.println("Tipo: " + animales[animalElegido].obtenerTipo());
    } else {
        System.out.println("Animal no válido.");
    }
}


    private static void sumarAnioAnimal(Scanner scanner) {
        System.out.println("\n**Sumar año a un animal:**");
        listarAnimales();
        System.out.print("Elige un animal (1-" + NUM_ANIMALES + "): ");
        int animalElegido = scanner.nextInt() - 1;

        if (animalElegido >= 0 && animalElegido < NUM_ANIMALES && animales[animalElegido] != null) {
            animales[animalElegido].setEdad(animales[animalElegido].getEdad() + 1);
            System.out.println(animales[animalElegido].getNombre() + " ahora tiene " + animales[animalElegido].getEdad() + " años.");
        } else {
            System.out.println("Animal no válido.");
        }
    }

    private static void marcarAnimalMuerto(Scanner scanner) {
        System.out.println("\n**Marcar animal como muerto:**");
        listarAnimales();
        System.out.print("Elige un animal (1-" + NUM_ANIMALES + "): ");
        int animalElegido = scanner.nextInt() - 1;

        if (animalElegido >= 0 && animalElegido < NUM_ANIMALES && animales[animalElegido] != null) {
            animales[animalElegido] = null;
            System.out.println("El animal ha muerto.");

            // Reordenar el array para eliminar el hueco vacío
            for (int i = animalElegido; i < NUM_ANIMALES - 1; i++) {
                animales[i] = animales[i + 1];
            }
            animales[NUM_ANIMALES - 1] = null;
        } else {
            System.out.println("Animal no válido.");
        }
    }

    private static void adquirirNuevoCerdo(Scanner scanner) {
        if (indiceCerdo != -1) {
            System.out.println("Ya hay un cerdo en la granja.");
            return;
        }

        System.out.println("\n**Adquirir nuevo cerdo:**");
        System.out.print("Introduce el nombre del cerdo: ");
        String nombreCerdo = scanner.next();

        System.out.print("Introduce el peso del cerdo (kg): ");
        double pesoCerdo = scanner.nextDouble();

        System.out.print("Introduce la edad del cerdo (años): ");
        int edadCerdo = scanner.nextInt();

        System.out.print("Introduce el color de piel del cerdo: ");
        String colorPielCerdo = scanner.next();

        animales[indiceCerdo] = new Cerdo(nombreCerdo, pesoCerdo, edadCerdo, colorPielCerdo);
        System.out.println("Se ha adquirido un nuevo cerdo: " + animales[indiceCerdo]);
    }

    private static void listarAnimalesCompleto() {
        System.out.println("\n**Listado de animales completo:**");
        for (int i = 0; i < NUM_ANIMALES; i++) {
            if (animales[i] != null) {
                if (animales[i] instanceof Vaca) {
                    System.out.println("Vaca: " + animales[i].getNombre() + " (" + animales[i].getPeso() + " kg, " + animales[i].getEdad() + " años, uso: " + ((Vaca) animales[i]).getUso() + ")");
                } else if (animales[i] instanceof Cerdo) {
                    System.out.println("Cerdo: " + animales[i].getNombre() + " (" + animales[i].getPeso() + " kg, " + animales[i].getEdad() + " años, color piel: " + ((Cerdo) animales[i]).getColorPiel() + ")");
                } else if (animales[i] instanceof Oveja) {
                    System.out.println("Oveja: " + animales[i].getNombre() + " (" + animales[i].getPeso() + " kg, " + animales[i].getEdad() + " años, tipo pelo: " + ((Oveja) animales[i]).getTipoPelo() + ")");
                }
            }
        }
    }

    private static int buscarCerdo() {
        for (int i = 0; i < NUM_ANIMALES; i++) {
            if (animales[i] instanceof Cerdo) {
                return i;
            }
        }
        return -1;
    }
    public static int leerNumero() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String n = sc.nextLine();
			try {
				int numero = Integer.parseInt(n);
				// Si se ha introducido un número correto, lo devuelvo
				return numero;
			} catch (NumberFormatException e) {
				// Si no se ha introducido un número, vuelvo a pedirlo hasta que lo sea.
				System.out.println("Tienes que introducir un número válido.");
			}
		}
	}

}

