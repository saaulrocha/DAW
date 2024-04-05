/**
 * @autor:    Saúl Rocha
 * @version: 5.0
 */
package figurasGeometricas;

public class Esfera {
    private double radioEsfera;
    private String colorEsfera;
    private String tamanoEsfera;
    /**
     * @return El radio de la esfera
     * @since 1.0
     */
    public double getRadioEsfera() {
        return radioEsfera;
    }
    /**
     * @param radioEsfera El radio de la esfera
     * @since 1.0
     */
    public void setRadioEsfera(double radioEsfera) {
        this.radioEsfera = radioEsfera;
    }
    /**
     * @return El color de la esfera
     * @since 1.4
     */
    public String getColorEsfera() {
        return colorEsfera;
    }
    /**
     * @param colorEsfera El color de la esfera
     * @since 1.4
     */
    public void setColorEsfera(String colorEsfera) {
        this.colorEsfera = colorEsfera;
    }
    /**
     * @return El tamano de la esfera
     * @since 1.0
     */
    public String getTamanoEsfera() {
        return tamanoEsfera;
    }
    /**
     * @param tamanoEsfera El tamano de la esfera
     * @since 1.0
     */
    public void setTamanoEsfera(String tamanoEsfera) {
        this.tamanoEsfera = tamanoEsfera;
    }
    /**
     * @param radioEsfera El radio de la esfera
     * @param tamanoEsfera El tamano de la esfera
     * @since 2.4
     */
    public Esfera(double radioEsfera, String tamanoEsfera) {
        this.radioEsfera = radioEsfera;
        this.tamanoEsfera = tamanoEsfera;
    }
    /**
     * @return La superficie de la esfera
     * @since 4.0
     */
    public double obtenerSuperficieEsfera() {
        final double pi = Math.PI;
        double superficieEsfera = 4 * pi * Math.pow(radioEsfera, 2);
        return superficieEsfera;
    }
    /**
     * @return El volumen de la esfera
     * @since 5.0
     */
    public double obtenerVolumenEsfera() {
        final double pi = Math.PI;
        double volumenEsfera = 4/3 * pi * Math.pow(radioEsfera, 3);
        return volumenEsfera;
    }
    /**
     * @return El color de la esfera
     * @since 6.0
     */
    public void asignarColorEsfera() {
        int numero = (int) (Math.random() * 2) + 1;
        if (numero == 1)
             this.colorEsfera = "verde";
        else 
            this.colorEsfera = "azul";
    }

}
