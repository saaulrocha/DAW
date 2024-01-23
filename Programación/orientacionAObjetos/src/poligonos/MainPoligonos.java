package poligonos;

import java.util.Arrays;

public class MainPoligonos {
    public static void main(String[] args) {
        Matriz ejemplo = new Matriz(6, 7, 'A');
        char[][] matrizCuadrada = ejemplo.pintarMatriz();
        for (int i = 0;i < matrizCuadrada.length; i++) {
            for (int j = 0; j < matrizCuadrada[i].length; j++) {
                System.out.print(matrizCuadrada[i][j]);
            }
            System.out.println();
        }
    }
}
