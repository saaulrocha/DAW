package figurasGeometricas;

public class Cilindro {
    private double radioCilindro;
    private String colorCilindro;
    private String tamañoCilindro;
    private double alturaCilindro;

    public double getRadioCilindro() {
        return radioCilindro;
    }
    public void setRadioCilindro(double radioCilindro) {
        this.radioCilindro = radioCilindro;
    }
    public String getColorCilindro() {
        return colorCilindro;
    }
    public void setColorCilindro(String colorCilindro) {
        this.colorCilindro = colorCilindro;
    }
    public String getTamañoCilindro() {
        return tamañoCilindro;
    }
    public void setTamañoCilindro(String tamañoCilindro) {
        this.tamañoCilindro = tamañoCilindro;
    }
    public double getAlturaCilindro() {
        return alturaCilindro;
    }
    public void setAlturaCilindro(double alturaCilindro) {
        this.alturaCilindro = alturaCilindro;
    }
    public Cilindro(double radioCilindro, String tamañoCilindro, double alturaCilindro) {
        this.radioCilindro = radioCilindro;
        this.tamañoCilindro = tamañoCilindro;
        this.alturaCilindro = alturaCilindro;
    }
    public double obtenerSuperficieCilindro() {
        final double pi = Math.PI;
        double superficieCilindro = 2 * pi * radioCilindro * alturaCilindro + 2 * pi * Math.pow(radioCilindro, 2);
        return superficieCilindro;
    }
    public double obtenerVolumenCilindro() {
        final double pi = Math.PI;
        double volumenCilindro = pi * alturaCilindro * Math.pow(radioCilindro, 2);
        return volumenCilindro;
    }
    public void asignarColorCilindro() {
        int numero = (int) (Math.random() * 2) + 1;
        if (numero == 1)
             this.colorCilindro = "verde";
        else 
            this.colorCilindro = "azul";
    }

}
