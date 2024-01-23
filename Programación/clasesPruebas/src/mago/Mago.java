package mago;

public class Mago {
    // ATRIBUTOS:

    private String nombre;
    private int ataque;
    private int defensa;
    private int posicionX;
    private int posicionY;

    // CONSTRUCTORES:
    public Mago(String nombre) {
        this.nombre = nombre;
        // Valores por defecto de los atributos:
        // (Otra manera de crear estas variables)
        this.ataque = 80;
        this.defensa = 50;
        this.posicionX = 0;
        this.posicionY = 0;
    }

    public Mago(String nombre, int ataque, int defensa, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public Mago() {

    }

    // GETTER Y SETTER:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    // Metodos:

    // recargarAtaque
    public int recargarAtaque(int cantidad) {
        int ataqueFinal = ataque + cantidad;
        if (ataqueFinal > 100) {
            ataque = 100;
        } else {
            ataque = ataqueFinal;
        }
        return ataque;
    }

    // recargarDefensa
    public int recargarDefensa(int cantidad) {
        int defensa = this.defensa + cantidad;
        if (defensa > 100) {
            this.defensa = 100;
        } else {
            this.defensa = defensa;
        }
        return this.defensa;
    }

    // atacar
    public int atacar() {
        int ataqueActual = (int) (Math.random()*10+2);
        if (ataqueActual >= ataque) {
            System.out.println("No te quedan PS :(");
            System.out.println("Debes guardar reposo");
            return -1;
        } else {
            int dañoCausado = (int) (Math.random()*10+2);
            System.out.println("Le has quitado al enemigo " + dañoCausado + " puntos de vida");
            ataque -= ataqueActual;
            System.out.println("Te quedan " + ataque + " PS");
        }
        return ataque;
    }

    // dibujarEnTablero
    public void dibujarEnTablero() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == posicionX && j == posicionY) {
                    System.out.print("M ");
                    } 
                 else {
                    System.out.print("- ");
                 }
            }
            System.out.println();
        }
    }
}
