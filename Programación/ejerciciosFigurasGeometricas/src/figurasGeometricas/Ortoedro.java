/**
 * @autor:    Saúl Rocha
 * @version: 5.0
 */

package figurasGeometricas;

public class Ortoedro {
    private String colorOrtoedro;
    private String tamanoOrtoedro;
    private double longitudOrtoedro;
    private double anchoOrtoedro;
    private double alturaOrtoedro;
    private double fondoOrtoedro;

    /**
     * @return El fondo del ortoedro
     * @since 1.0
     */
    public double getFondoOrtoedro() {
        return this.fondoOrtoedro;
    }
    /**
     * @param fondoOrtoedro El fondo del ortoedro
     * @since 1.0
     */
    public void setFondoOrtoedro(double fondoOrtoedro) {
        this.fondoOrtoedro = fondoOrtoedro;
    }
    /**
     * @return La altura del ortoedro
     * @since 1.5
     */
    public double getAlturaOrtoedro() {
        return alturaOrtoedro;
    }
    /**
     * @param alturaOrtoedro La altura del ortoedro
     * @since 2.0
     */
    public void setAlturaOrtoedro(double alturaOrtoedro) {
        this.alturaOrtoedro = alturaOrtoedro;
    }
    /**
     * @return El ancho del ortoedro
     * @since 1.0
     */
    public double getAnchoOrtoedro() {
        return anchoOrtoedro;
    }
    /**
     * @param anchoOrtoedro El ancho del ortoedro
     * @since 1.0
     */
    public void setAnchoOrtoedro(double anchoOrtoedro) {
        this.anchoOrtoedro = anchoOrtoedro;
    }
    /**
     * @return La longitud del ortoedro
     * @since 1.0
     */
    public double getLongitudOrtoedro() {
        return longitudOrtoedro;
    }
    /**
     * @param longitudOrtoedro La longitud del ortoedro
     * @since 3.0
     */
    public void setLongitudOrtoedro(double longitudOrtoedro) {
        this.longitudOrtoedro = longitudOrtoedro;
    }
    /**
     * @return El color del ortoedro
     * @since 3.0
     */
    public String getColorOrtoedro() {
        return colorOrtoedro;
    }
    /**
     * @param colorOrtoedro El color del ortoedro
     * @since 3.0
     */
    public void setColorOrtoedro(String colorOrtoedro) {
        this.colorOrtoedro = colorOrtoedro;
    }
    /**
     * @return El tamano del ortoedro
     * @since 3.0
     */
    public String getTamanoOrtoedro() {
        return tamanoOrtoedro;
    }
    /**
     * @param tamanoOrtoedro El tamano del ortoedro
     * @since 3.0
     */
    public void setTamanoOrtoedro(String tamanoOrtoedro) {
        this.tamanoOrtoedro = tamanoOrtoedro;
    }
    /**
     * @param longitudOrtoedro La longitud del ortoedro
     * @param anchoOrtoedro El ancho del ortoedro
     * @param alturaOrtoedro La altura del ortoedro
     * @param fondoOrtoedro El fondo del ortoedro
     * @since 3.6
     */
    public Ortoedro(String tamanoOrtoedro, double longitudOrtoedro, double anchoOrtoedro, double alturaOrtoedro, double fondoOrtoedro) {
        this.tamanoOrtoedro = tamanoOrtoedro;
        this.longitudOrtoedro = longitudOrtoedro;
        this.anchoOrtoedro = anchoOrtoedro;
        this.alturaOrtoedro = alturaOrtoedro;
        this.fondoOrtoedro = fondoOrtoedro;
    }
    /**
     * @return La superficie del ortoedro
     * @since 4.0
     */
    public double obtenerSuperficieOrtoedro() {
        double superficieOrtoedro = 2 * longitudOrtoedro * anchoOrtoedro + 2 * longitudOrtoedro * alturaOrtoedro + 2 * alturaOrtoedro * anchoOrtoedro;
        return superficieOrtoedro;
    }
    /**
     * @return El volumen del ortoedro
     * @since 4.0
     */
    public double obtenerVolumenOrtoedro() {
        double volumenOrtoedro = anchoOrtoedro * alturaOrtoedro * fondoOrtoedro;
        return volumenOrtoedro;
    }
    /**
     * @return El color del ortoedro
     * @since 5.0
     */
    public void asignarColorOrtoedro() {
        int numero = (int) (Math.random() * 2) + 1;
        if (numero == 1)
             this.colorOrtoedro = "verde";
        else 
            this.colorOrtoedro = "azul";
    }
    
}
