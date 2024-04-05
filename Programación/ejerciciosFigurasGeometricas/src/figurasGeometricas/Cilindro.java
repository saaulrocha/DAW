/**
 * @autor: Saúl Rocha
 * @version: 5.0
 */
package figurasGeometricas;

public class Cilindro {
    private double radioCilindro;
    private String colorCilindro;
    private String tamanoCilindro;
    private double alturaCilindro;
    /**
     * @return El radio del cilindro
     * @since 1.0
     */
    public double getRadioCilindro() {
        return radioCilindro;
    }
    /**
     * @param radioCilindro El radio del cilindro
     * @since 1.0
     */
    public void setRadioCilindro(double radioCilindro) {
        this.radioCilindro = radioCilindro;
    }
    /**
     * @return El color del cilindro
     * @since 1.0
     */
    public String getColorCilindro() {
        return colorCilindro;
    }
    /**
     * @param colorCilindro El color del cilindro
     * @since 1.0
     */
    public void setColorCilindro(String colorCilindro) {
        this.colorCilindro = colorCilindro;
    }
    /**
     * @return El tamano del cilindro
     * @since 1.0
     */
    public String getTamanoCilindro() {
        return tamanoCilindro;
    }
    /**
     * @param tamanoCilindro El tamano del cilindro
     * @since 1.0
     */
    public void setTamanoCilindro(String tamanoCilindro) {
        this.tamanoCilindro = tamanoCilindro;
    }
    /**
     * @return La altura del cilindro
     * @since 1.0
     */
    public double getAlturaCilindro() {
        return alturaCilindro;
    }
    /**
     * @param alturaCilindro La altura del cilindro
     * @since 1.0
     */
    public void setAlturaCilindro(double alturaCilindro) {
        this.alturaCilindro = alturaCilindro;
    }
    /**
     * @param radioCilindro El radio del cilindro
     * @param tamanoCilindro El tamano del cilindro
     * @param alturaCilindro La altura del cilindro
     * @since 2.0
     */
    public Cilindro(double radioCilindro, String tamanoCilindro, double alturaCilindro) {
        this.radioCilindro = radioCilindro;
        this.tamanoCilindro = tamanoCilindro;
        this.alturaCilindro = alturaCilindro;
    }
    /**
     * @return La superficie del cilindro
     * @since 3.0
     */
    public double obtenerSuperficieCilindro() {
        final double pi = Math.PI;
        double superficieCilindro = 2 * pi * radioCilindro * alturaCilindro + 2 * pi * Math.pow(radioCilindro, 2);
        return superficieCilindro;
    }
    /**
     * @return El volumen del cilindro
     * @since 4.0
     */
    public double obtenerVolumenCilindro() {
        final double pi = Math.PI;
        double volumenCilindro = pi * alturaCilindro * Math.pow(radioCilindro, 2);
        return volumenCilindro;
    }
    /**
     * Asigna un color aleatorio al cilindro
     * @since 5.0
     */
    public void asignarColorCilindro() {
        int numero = (int) (Math.random() * 2) + 1;
        if (numero == 1)
             this.colorCilindro = "verde";
        else 
            this.colorCilindro = "azul";
    }

}
