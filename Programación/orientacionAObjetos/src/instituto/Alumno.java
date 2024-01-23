package instituto;

public class Alumno {
    private String nombre;
    private int faltas;
    private char letraDNI;
    private String numeroDNI;
    private double nota;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public char getLetraDNI() {
        return letraDNI;
    }
    public String getnumeroDNI() {
        return numeroDNI;
    }
    public void setNumeroDNI(String numeroDNI) {
        this.numeroDNI = numeroDNI;
        ponerLetraDNI();
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String ponerNota() {
        String notaFinal = "";
        if (nota < 5) {
            notaFinal = "Has suspendido";
        }
        if (nota >= 5 && nota < 7) {          notaFinal = "Enhorabuena tienes un suficiente, has aprobado por los pelos";
        }
        if (nota >= 7 && nota < 9) {
            notaFinal = "Enhorabuena tienes un Notable";
        }
        if (nota <= 10 && nota >= 9){
            notaFinal = "¡WOW! Tienes un sobresaliente";
        }
        return notaFinal;
    }
    public void mostrarInformacion() {
        System.out.println("El nombre del alumno es " + nombre + " con DNI " + numeroDNI + letraDNI + " tiene " + nota + ". Faltas : " + faltas);
    }
    public boolean faltar(int horas) {
        faltas += horas;
        if (faltas >= 10)
            return true;
        else 
            return false;
    }
    public void ponerLetraDNI() {
        char[] letrasDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
            int numeroLetra = Integer.parseInt(numeroDNI) % 23; 
            letraDNI = letrasDNI[numeroLetra];           
    }
}
