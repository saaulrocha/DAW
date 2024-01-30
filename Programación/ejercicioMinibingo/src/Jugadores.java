public class Jugadores {
    private String nombreJugador;
    private int[] cartonJugador;

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int[] getCartonJugador() {
        return cartonJugador;
    }

    public void setCartonJugador(int[] cartonJugador) {
        this.cartonJugador = cartonJugador;
    }
    public Jugadores(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    public int[] generarCarton() {
        cartonJugador = new int[3];
        for (int i = 0; i < cartonJugador.length; i++) {
            cartonJugador[i] = (int) (Math.random() * 20) + 1;
        }
        comprobarCarton(cartonJugador);
        return cartonJugador;
    }
    public int[] comprobarCarton(int[] cartonParaComprobar) {
        int i = 1;
        if (cartonParaComprobar[i - 1] == cartonParaComprobar[i]
        ) {
            generarCarton();
        }
        return cartonParaComprobar;
    }
    public boolean comprobarCartonJugador(int[] cartonJugadorActual, int numeroBingoActual) {
        int i = 0;
        while (i < cartonJugadorActual.length)
        if (cartonJugadorActual[i] == numeroBingoActual) {
            cartonJugadorActual[i] = 0;
            return true;
        }
        else {
            i++;
        }
        return false;
    }
    public boolean comprobarGanador(int[] cartonJugadorActual) {
        int contador = 0;
        for (int i = 0; i < cartonJugadorActual.length; i++) {
            if (cartonJugadorActual[i] == 0) {
                contador++;
            }
        }
        if (contador == 3)
            return true;
        else
            return false;
    }
}
