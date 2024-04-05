import java.util.Scanner;

public class MainBingo {
    public static void main(String[] args) {
        Jugadores jugador1 = new Jugadores("Rocha");
        int[] cartonJugador1 = jugador1.generarCarton();
        Jugadores jugador2 = new Jugadores("Rodri");
        int[] cartonJugador2 = jugador2.generarCarton();
        Jugadores jugador3 = new Jugadores("Adri");
        int[] cartonJugador3 = jugador3.generarCarton();
        Jugadores jugador4 = new Jugadores("Nevi");
        int[] cartonJugador4 = jugador4.generarCarton();
        Jugadores jugador5 = new Jugadores("Litos");
        int[] cartonJugador5 = jugador5.generarCarton();
        Bingo bingo1 = new Bingo();
        int[] bingoActual = bingo1.generarNumerosBingo();
        Boolean hayGanador = false;
        int posicionBolaActual = 0;
        System.out.println("Bienvenido al minibingo desarrollado por Rocha");
        while (!hayGanador) {
            System.out.println("Pulsa enter para sacar una bola");
            Scanner sacarBolaBingo = new Scanner(System.in);
            sacarBolaBingo.nextLine();
            System.out.println("Acaba de caer la bola con el número " + bingoActual[posicionBolaActual]);
            if (jugador1.comprobarCartonJugador(cartonJugador1, bingoActual[posicionBolaActual]) == true) {
                System.out.println(jugador1.getNombreJugador() + " Tiene el número " + bingoActual[posicionBolaActual]);
                if (jugador1.comprobarGanador(cartonJugador1) == true) {
                    System.out.println("El ganador es " + jugador1.getNombreJugador());
                    hayGanador = true;
                }
            }
            if (jugador2.comprobarCartonJugador(cartonJugador2, bingoActual[posicionBolaActual]) == true) {
                System.out.println(jugador2.getNombreJugador() + " Tiene el número " + bingoActual[posicionBolaActual]);
                if (jugador2.comprobarGanador(cartonJugador2) == true) {
                    System.out.println("El ganador es " + jugador2.getNombreJugador());
                    hayGanador = true;
                }
            }
            if (jugador3.comprobarCartonJugador(cartonJugador3, bingoActual[posicionBolaActual]) == true) {
                System.out.println(jugador3.getNombreJugador() + " Tiene el número " + bingoActual[posicionBolaActual]);
                if (jugador3.comprobarGanador(cartonJugador3) == true) {
                    System.out.println("El ganador es " + jugador3.getNombreJugador());
                    hayGanador = true;
                }
            }
            if (jugador4.comprobarCartonJugador(cartonJugador4, bingoActual[posicionBolaActual]) == true) {
                System.out.println(jugador4.getNombreJugador() + " Tiene el número " + bingoActual[posicionBolaActual]);
                if (jugador4.comprobarGanador(cartonJugador4) == true) {
                    System.out.println("El ganador es " + jugador4.getNombreJugador());
                    hayGanador = true;
                }
            }
            if (jugador5.comprobarCartonJugador(cartonJugador1, bingoActual[posicionBolaActual]) == true) {
                System.out.println(jugador5.getNombreJugador() + " Tiene el número " + bingoActual[posicionBolaActual]);
                if (jugador5.comprobarGanador(cartonJugador5) == true) {
                    System.out.println("El ganador es " + jugador5.getNombreJugador());
                    hayGanador = true;
                }
            }
            posicionBolaActual++;
        }
    }
}