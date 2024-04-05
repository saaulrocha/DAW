import java.util.Scanner;

public class Cliente extends Persona {
    private double dinero;

    public Cliente(String nombre, double dinero) {
        super(nombre);
        this.dinero = dinero;
    }

    /**
     * @return double Devuelve el dinero que tiene el cliente
     */
    public double getDinero() {
        return dinero;
    }

    /**
     * @param dinero Asigna el dinero que tiene el cliente
     */
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public static Cliente crearNuevoCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del nuevo Cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el dinero que tiene el cliente: ");
        double dinero = scanner.nextDouble();

        return new Cliente(nombre, dinero);
    }

    @Override
    public void mostrarInfoPersona() {

    }

}
