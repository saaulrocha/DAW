import java.util.Scanner;

public class Cine {
    static Persona[] personas = new Persona[9];

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 2000.0);
        Empleado empleado2 = new Empleado("María", 1800.0);
        Cliente cliente1 = new Cliente("Pedro", 100.0);
        Cliente cliente2 = new Cliente("Ana", 150.0);
        Cliente cliente3 = new Cliente("Luis", 7.0);
        personas[0] = empleado1;
        personas[1] = empleado2;
        personas[3] = cliente1;
        personas[4] = cliente2;
        personas[5] = cliente3;
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int numeroActualEmpleados = 2;
        int numeroActualClientes = 3;
        int k = 3;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Empleados");
            System.out.println("2. Nuevo cliente");
            System.out.println("3. Atender a cliente");
            System.out.println("4. Ver cobros");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println(
                        "Por favor, ingresa un número entero, ingresa cualquier número para volver al menú principal");
                scanner.next();
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int opcionSubmenu = 0;
                    do {
                        System.out.println("1. Ver empleados");
                        System.out.println("2. Liberar empleado ocupado");
                        System.out.println("3. Dar de alta");
                        System.out.println("4. Dar de baja");
                        while (!scanner.hasNextInt()) {
                            System.out.println(
                                    "Por favor, ingresa un número entero, ingresa cualquier número para volver al menú principal");
                            scanner.next();
                        }
                        opcionSubmenu = scanner.nextInt();
                        switch (opcionSubmenu) {
                            case 1:
                                for (int i = 0; i < Constantes.NUMERO_MAX_EMPLEADOS; i++) {
                                    if (personas[i] == null) {
                                        i++;
                                    } else {
                                        personas[i].mostrarInfoPersona();
                                    }
                                }
                                break;
                            case 2:
                                // Lógica para liberar empleado ocupado
                                break;
                            case 3:
                                if (Constantes.NUMERO_MAX_EMPLEADOS > numeroActualEmpleados) {
                                    personas[numeroActualEmpleados] = Empleado.crearNuevoEmpleado();
                                    numeroActualEmpleados++;
                                } else {
                                    System.out.println("Ya no puedes contratar a más empleados");
                                }
                                break;
                            case 4:
                                if (numeroActualEmpleados == 1) {
                                    System.out.println("No puedes dar de baja al último empleado");
                                } else {
                                    // Listar los empleados
                                    System.out.println("Lista de empleados:");
                                    for (int i = 0; i < numeroActualEmpleados; i++) {
                                        if (personas[i] != null) {
                                            System.out.println("ID: " + i + " - Nombre: " + personas[i].getNombre());
                                        }
                                    }
                                    // Logica para dar de baja al empleado
                                    System.out.println("Ingresa el id del empleado que deseas dar de baja");
                                    int idEmpleado = scanner.nextInt();
                                    if (idEmpleado < 0 || idEmpleado >= numeroActualEmpleados
                                            || personas[idEmpleado] == null) {
                                        System.out.println("No existe un empleado con ese id");
                                    } else {
                                        for (int i = idEmpleado; i < numeroActualEmpleados - 1; i++) {
                                            personas[i] = personas[i + 1];
                                        }
                                        personas[numeroActualEmpleados - 1] = null;
                                        numeroActualEmpleados--;
                                        System.out.println("Empleado dado de baja con éxito");
                                    }
                                }
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                        }
                    } while (opcionSubmenu != 0);
                    break;
                case 2:
                    // Lógica para agregar un nuevo cliente
                    if (Constantes.NUMERO_MAX_CLIENTES > numeroActualClientes) {
                        personas[numeroActualClientes + 2] = Cliente.crearNuevoCliente();
                        numeroActualClientes++;
                    } else {
                        System.out.println("Ya no puedes agregar más clientes");
                    }
                    break;
                case 3:
                    // Lógica para atender a un cliente
                    for (int i = 0; i < numeroActualEmpleados; i++) {
                        if (personas[i] != null && !personas[i].isOcupado()) {
                            System.out.println("ID: " + i + " - Nombre: " + personas[i].getNombre());
                        }
                    }
                    System.out.println("Ingresa el id del empleado que atenderá al cliente");
                    int idEmpleado = scanner.nextInt();
                    if (idEmpleado < 0 || idEmpleado > numeroActualEmpleados) {
                        System.out.println("No existe un empleado con ese id");
                    } else {
                            while (personas[k] != null) {
                                if (!personas[k].isOcupado()) {
                                    System.out.println("ID: " + k + " - Nombre: " + personas[k].getNombre());
                                }
                                k++;
                            }
                        }
                            System.out.println("Ingresa el id del cliente que será atendido");
                            int idCliente = scanner.nextInt();
                            if (idCliente < 0 || idCliente > 5) {
                                System.out.println("No existe un cliente con ese id");
                            } else {
                                if (personas[idCliente].isOcupado()) {
                                    System.out.println("El cliente ya está siendo atendido");
                                } else {
                                    personas[idCliente].setOcupado(true);
                                    personas[idEmpleado].setOcupado(true);
                                    int opcionSubmenu2 = 0;
                                    do {
                                        System.out.println("--- Cliente : " + personas[idCliente].getNombre() + " " + personas[idCliente].getDinero);

                                    } while (opcionSubmenu2 != 0);
                                }
                            }
                    break;
                case 4:
                    // Lógica para mostrar los cobros
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }
}

