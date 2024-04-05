import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        int opcion;
        Scanner menu = new Scanner(System.in);
        while (true) {
            System.out.println("1.- Ver el menú del día");
            System.out.println("2.- Realizar una reserva");
            System.out.println("3.- Ver los platos especiales");
            System.out.println("4.- Salir del programa");
            System.out.print("Elige una opción: ");
            while (!menu.hasNextInt()) {
                System.out.println("Por favor introduce un número entero");
                System.out.println("1.- Ver el menú del día");
                System.out.println("2.- Realizar una reserva");
                System.out.println("3.- Ver los platos especiales");
                System.out.println("4.- Salir del programa");
                System.out.print("Elige una opción: ");
                menu.next();
            }
            opcion = menu.nextInt();
            if (opcion == 1) {
                verMenuDelDia();
            } else if (opcion == 2) {
                realizarReserva();
            } else if (opcion == 3) {
                verPlatosEspeciales();
            } else if (opcion == 4) {
                System.out.println("¿Estás seguro de que quieres salir? (s/n)");
                String confirmacion = menu.next();
                if (confirmacion.equalsIgnoreCase("s")) {
                    System.out.println("¡Hasta pronto!");
                    System.exit(0);
                }
            } else {
                System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
            }
        }
    }

    public static void verMenuDelDia() {
        System.out.println("Menú del día:");
        System.out.println("Primeros:");
        System.out.println("1. Ensalada César");
        System.out.println("2. Sopa de verduras");
        System.out.println("3. Gazpacho andaluz");
        System.out.println("4. Croquetas de jamón");
        System.out.println("5. Tortilla española");
        System.out.println("Segundos:");
        System.out.println("1. Paella valenciana");
        System.out.println("2. Bacalao al pil pil");
        System.out.println("3. Solomillo al roquefort");
        System.out.println("4. Pollo al curry");
        System.out.println("5. Lasaña de verduras");
        System.out.println("Postres:");
        System.out.println("1. Tarta de queso");
        System.out.println("2. Flan de huevo");
        System.out.println();
    }

    public static void realizarReserva() {
        Scanner reserva = new Scanner(System.in);
        System.out.print("Por favor, introduce tu nombre: ");
        String nombre = reserva.nextLine();
        System.out.print("Por favor, introduce el número de personas: ");
        int numPersonas = reserva.nextInt();
        while (!reserva.hasNextInt()) {
            System.out.print("Por favor, introduce el número de personas: ");
            reserva.next();
        }
        System.out.println("Reserva de " + nombre + " hecha para " + numPersonas + " personas");
        System.out.println();
    }

    public static void verPlatosEspeciales() {
        int opcion;
        Scanner platosEspeciales = new Scanner(System.in);
        System.out.println("1.- Platos especiales de la semana");
        System.out.println("2.- Platos vegetarianos");
        System.out.print("Elige una opción: ");
        opcion = platosEspeciales.nextInt();
        while (!platosEspeciales.hasNextInt()) {
            System.out.println("1.- Platos especiales de la semana");
            System.out.println("2.- Platos vegetarianos");
            System.out.print("Elige una opción: ");
            platosEspeciales.next();
        }
        if (opcion == 1) {
            System.out.println("Aquí están los platos especiales de la semana...");
            System.out.println("Platos especiales de la semana:");
            System.out.println("1. Cordero asado al estilo segoviano");
            System.out.println("2. Fabada asturiana");
            System.out.println("3. Cochinillo asado");
            System.out.println("4. Mariscada gallega");
            System.out.println();
        } else if (opcion == 2) {
            System.out.println("Aquí están los platos vegetarianos...");
            System.out.println("Platos vegetarianos:");
            System.out.println("1. Ensalada de quinoa y aguacate");
            System.out.println("2. Hamburguesa de lentejas");
            System.out.println("3. Pizza de verduras");
            System.out.println("4. Pasta con pesto de espinacas");
            System.out.println("5. Tofu a la plancha con salsa teriyaki");
            System.out.println();
        } else {
            System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 2.");
        }
    }
}
