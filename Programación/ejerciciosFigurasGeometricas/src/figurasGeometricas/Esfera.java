package figurasGeometricas;

public class Esfera {
    private double radioEsfera;
    private String colorEsfera;
    private String tamañoEsfera;

    public double getRadioEsfera() {
        return radioEsfera;
    }
    public void setRadioEsfera(double radioEsfera) {
        this.radioEsfera = radioEsfera;
    }
    public String getColorEsfera() {
        return colorEsfera;
    }
    public void setColorEsfera(String colorEsfera) {
        this.colorEsfera = colorEsfera;
    }
    public String getTamañoEsfera() {
        return tamañoEsfera;
    }
    public void setTamañoEsfera(String tamañoEsfera) {
        this.tamañoEsfera = tamañoEsfera;
    }
    public Esfera(double radioEsfera, String tamañoEsfera) {
        this.radioEsfera = radioEsfera;
        this.tamañoEsfera = tamañoEsfera;
    }
    public double obtenerSuperficieEsfera() {
        final double pi = Math.PI;
        double superficieEsfera = 4 * pi * Math.pow(radioEsfera, 2);
        return superficieEsfera;
    }
    public double obtenerVolumenEsfera() {
        final double pi = Math.PI;
        double volumenEsfera = 4/3 * pi * Math.pow(radioEsfera, 3);
        return volumenEsfera;
    }
    public void asignarColorEsfera() {
        int numero = (int) (Math.random() * 2) + 1;
        if (numero == 1)
             this.colorEsfera = "verde";
        else 
            this.colorEsfera = "azul";
    }

}
