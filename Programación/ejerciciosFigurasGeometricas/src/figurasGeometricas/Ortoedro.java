package figurasGeometricas;

public class Ortoedro {
    private String colorOrtoedro;
    private String tamañoOrtoedro;
    private double longitudOrtoedro;
    private double anchoOrtoedro;
    private double alturaOrtoedro;
    private double fondoOrtoedro;

    public double getFondoOrtoedro() {
        return this.fondoOrtoedro;
    }

    public void setFondoOrtoedro(double fondoOrtoedro) {
        this.fondoOrtoedro = fondoOrtoedro;
    }

    public double getAlturaOrtoedro() {
        return alturaOrtoedro;
    }
    public void setAlturaOrtoedro(double alturaOrtoedro) {
        this.alturaOrtoedro = alturaOrtoedro;
    }
    public double getAnchoOrtoedro() {
        return anchoOrtoedro;
    }
    public void setAnchoOrtoedro(double anchoOrtoedro) {
        this.anchoOrtoedro = anchoOrtoedro;
    }
    public double getLongitudOrtoedro() {
        return longitudOrtoedro;
    }
    public void setLongitudOrtoedro(double longitudOrtoedro) {
        this.longitudOrtoedro = longitudOrtoedro;
    }
    public String getColorOrtoedro() {
        return colorOrtoedro;
    }
    public void setColorOrtoedro(String colorOrtoedro) {
        this.colorOrtoedro = colorOrtoedro;
    }
    public String getTamañoOrtoedro() {
        return tamañoOrtoedro;
    }
    public void setTamañoOrtoedro(String tamañoOrtoedro) {
        this.tamañoOrtoedro = tamañoOrtoedro;
    }

    public Ortoedro(String tamañoOrtoedro, double longitudOrtoedro, double anchoOrtoedro, double alturaOrtoedro, double fondoOrtoedro) {
        this.tamañoOrtoedro = tamañoOrtoedro;
        this.longitudOrtoedro = longitudOrtoedro;
        this.anchoOrtoedro = anchoOrtoedro;
        this.alturaOrtoedro = alturaOrtoedro;
        this.fondoOrtoedro = fondoOrtoedro;
    }
    
    public double obtenerSuperficieOrtoedro() {
        double superficieOrtoedro = 2 * longitudOrtoedro * anchoOrtoedro + 2 * longitudOrtoedro * alturaOrtoedro + 2 * alturaOrtoedro * anchoOrtoedro;
        return superficieOrtoedro;
    }
    public double obtenerVolumenOrtoedro() {
        double volumenOrtoedro = anchoOrtoedro * alturaOrtoedro * fondoOrtoedro;
        return volumenOrtoedro;
    }
    public void asignarColorOrtoedro() {
        int numero = (int) (Math.random() * 2) + 1;
        if (numero == 1)
             this.colorOrtoedro = "verde";
        else 
            this.colorOrtoedro = "azul";
    }
    
}
