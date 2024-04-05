import java.util.Scanner;

public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    /**
     * @return double Devuelve el sueldo del Empleado
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param Sueldo Da valor al sueldo del empleado
     */
    public void setSueldo(double Sueldo) {
        this.sueldo = Sueldo;
    }

    public static Empleado crearNuevoEmpleado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del nuevo empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el sueldo del nuevo empleado: ");
        double sueldo = scanner.nextDouble();

        return new Empleado(nombre, sueldo);
    }

    @Override
    public void mostrarInfoPersona() {
        System.out.println("Nombre: " + getNombre() + " Sueldo: " + sueldo + " euros");
    }
}
