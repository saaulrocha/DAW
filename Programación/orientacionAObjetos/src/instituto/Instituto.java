package instituto;

public class Instituto {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Pepe");
        alumno1.setNumeroDNI("02345599");
        alumno1.setNota(5.1);
        alumno1.setFaltas(3);
        alumno1.mostrarInformacion();
        String nota1 = alumno1.ponerNota();
        System.out.println(nota1);
        
    }
}
