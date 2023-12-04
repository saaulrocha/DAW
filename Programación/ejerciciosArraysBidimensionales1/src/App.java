import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // Sumar los elementos de las dos matrices siguientes:
        // {{23, 6, 8}, {4, 7,1}, {3, 5, 9}} y
        // {{-12, 5, 6}, {7, 9, 0.6}, {10, 3, 8}}
        double[][] arraySuma1 = { { 23, 6, 8 }, { 4, 7, 1 }, { 3, 5, 9 } };
        double[][] arraySuma2 = { { -12, 5, 6 }, { 7, 9, 0.6 }, { 10, 3, 8 } };
        int i = 0;
        int j = 0;
        double[][] resultadoSumas = new double[3][3];
        while (i < arraySuma1.length) {
            while (j < resultadoSumas[i].length) {
                resultadoSumas[i][j] = arraySuma1[i][j] + arraySuma2[i][j];
                j++;
            }
            j = 0;
            i++;
        }
        System.out.println("El resultado del ejercicio 1 es:");
        System.out.println(Arrays.deepToString(resultadoSumas));
        // Ejercicio 2
        // - Sumar los elementos de las dos siguientes matrices
        // cuando la suma de las dos posiciones de cada elemento sea
        // par:
        // {{3, 6, 8, 5}, {4, 7,1, 9}} y
        // {{2, 5, 6, 3}, {7, -7, 3, 4}}
        System.out.println("El resultado del ejercicio 2 es:");
        int[][] arraySuma3 = { { 3, 6, 8, 5 }, { 4, 7, 1, 9 } };
        int[][] arraySuma4 = { { 2, 5, 6, 3 }, { 7, -7, 3, 4 } };
        i = 0;
        j = 0;
        int resultado = 0;
        while (i < arraySuma3.length) {
            while (j < arraySuma3[i].length) {
                resultado = arraySuma3[i][j] + arraySuma4[i][j];
                if (resultado % 2 == 0)
                    System.out.print(resultado + " ");
                j++;
            }
            j = 0;
            i++;
        }
        System.out.println();
        // Ejercicio 3
        // Dado un array bidimensional obtener otro similar de
        // booleanos donde cada elemento sea true si el número
        // original del primer array es par y false si no lo es.
        // Probarlo con:
        // {{1, 2}, {2, 5, 9, 1, 4}, {2, 8, 5}, {4, 5}}
        int[][] arrayNumeros = { { 1, 2 }, { 2, 5, 9, 1, 4 }, { 2, 8, 5 }, { 4, 5 } };
        i = 0;
        j = 0;
        Boolean[][] arrayBooleans = new Boolean[4][];
        arrayBooleans[0] = new Boolean[2];
        arrayBooleans[1] = new Boolean[5];
        arrayBooleans[2] = new Boolean[3];
        arrayBooleans[3] = new Boolean[2];
        while (i < arrayNumeros.length) {
            while (j < arrayNumeros[i].length) {
                if (arrayNumeros[i][j] % 2 == 0) {
                    arrayBooleans[i][j] = true;
                } else
                    arrayBooleans[i][j] = false;
                j++;
            }
            j = 0;
            i++;
        }
        System.out.println("El resultado del ejercicio 3 es:");
        System.out.println(Arrays.deepToString(arrayBooleans));
        // Ejercicio 4
        // Obtener de que longitud es la fila más larga de un array
        // bidimensional. Probarlo con el siguiente array:
        // {{43, 1}, {67, 3, 1, 8, 6, 8}, {2, 7, 9, 2, 1}, {1, 6, 8}, { 4, 7}}
        int[][] arrayLongitud = { { 43, 1 }, { 67, 3, 1, 8, 6, 8 }, { 2, 7, 9, 2, 1 }, { 1, 6, 8 }, { 4, 7 } };
        int longitudMaxima = 0;

        for (i = 0; i < arrayLongitud.length; i++) {
            int longitudFilaActual = arrayLongitud[i].length;
            if (longitudFilaActual > longitudMaxima) {
                longitudMaxima = longitudFilaActual;
            }
        }
        System.out.println("El resultado del ejercicio 4 es:");
        System.out.println(longitudMaxima);
        // Ejercicio 5
        // De una matriz bidimensional con un número par de filas
        // obtener una matriz con la mitad de filas donde cada nueva
        // fila sea la suma de dos filas consecutivas. (fila 0 + fila 1, fila 2
        // + fila 3, etc…)
        // Probarlo con:
        // {{2,5,7}, {1,6,6}, {1,1,1},{6, 8, 5}, {3,6, 4}, {1,8, 5}};
        int[][] matrizOriginal = { { 2, 5, 7 }, { 1, 6, 6 }, { 1, 1, 1 }, { 6, 8, 5 }, { 3, 6, 4 }, { 1, 8, 5 } };
        int[][] nuevaMatriz = new int[matrizOriginal.length / 2][matrizOriginal[0].length];
        for (i = 0; i < matrizOriginal.length; i += 2) {
            for (j = 0; j < matrizOriginal[i].length; j++) {
                nuevaMatriz[i / 2][j] = matrizOriginal[i][j] + matrizOriginal[i + 1][j];
            }
        }
        System.out.println("El resultado del ejercicio 5 es:");
        System.out.println(Arrays.deepToString(nuevaMatriz));
        // Ejercicio 6
        // Dada una matriz cuadrada obtener cual es la suma de
        // todos los elementos que componen las dos diagonales.
        // Probarlo con:
        // {{1, 2, 3, 4, 5}
        // {6, 7, 8, 9, 10}
        // {11, 12, 13, 14, 15}
        // {16, 17, 18, 19, 20}
        // {21, 22, 23, 24, 25}}
        int[][] matrizCuadrada = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
        i = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;

        while (i < matrizCuadrada.length) {
            diagonal1 += matrizCuadrada[i][i];
            diagonal2 += matrizCuadrada[i][matrizCuadrada.length - 1 - i];
            i++;
        }
        System.out.println("El resultado del ejercicio 6 es:");
        System.out.println("Suma de la primera diagonal: " + diagonal1);
        System.out.println("Suma de la segunda diagonal: " + diagonal2);
        // Ejercicio 7
        // En una matriz de enteros obtener cual es el elemento
        // mayor.
        // Probarlo con:
        // {{1, 2, 2, 4, 5}, {6, 7, 7, 9, 10}, {21, 22, 25, 4, 2}, {1, 2, 3, 4, 3},
        // {16, 17, 2, 19, 20}}
        int[][] matrizNumeros = { { 1, 2, 2, 4, 5 }, { 6, 7, 7, 9, 10 }, { 21, 22, 25, 4, 2 }, { 1, 2, 3, 4, 3 },
                { 16, 17, 2, 19, 20 } };
        int mayor = matrizNumeros[0][0];

        // Recorremos la matriz para encontrar el elemento mayor
        for (i = 0; i < matrizNumeros.length; i++) {
            for (j = 0; j < matrizNumeros[i].length; j++) {
                if (matrizNumeros[i][j] > mayor) {
                    mayor = matrizNumeros[i][j];
                }
            }
        }
        System.out.println("El resultado del ejercicio 7 es:");
        System.out.println(mayor);
        // Ejercicio 8
        // Dado un array unidimensional de enteros con una
        // longitud múltiplo de 4 transformarlo en un array
        // bidimensional donde cada cuatro elementos del primer
        // array unidimensional forman una fila del segundo.
        // Probarlo con:
        // {4, 1, 4, 6, 3, 1, 8, 6, 8, 2, 7, 9, 2, 1,1, 6, 8, 6, 4, 7, 9, 0, 1, 3}
        int[] arrayUnidimensional = { 4, 1, 4, 6, 3, 1, 8, 6, 8, 2, 7, 9, 2, 1, 1, 6, 8, 6, 4, 7, 9, 0, 1, 3 };
        if (arrayUnidimensional.length % 4 == 0) {
            int filas = arrayUnidimensional.length / 4;
            int[][] arrayBidimensional = new int[filas][4];
            for (i = 0; i < filas; i++) {
                for (j = 0; j < 4; j++) {
                    arrayBidimensional[i][j] = arrayUnidimensional[i * 4 + j];
                }
            }
            System.out.println("El resultado del ejercicio 8 es:");
            System.out.println(Arrays.deepToString(arrayBidimensional));
        } else
            System.out.println("La longitud del array Unidimensional es " + arrayUnidimensional.length
                    + " y no es múltiplo de 4 prueba otra vez");
        // Ejercicio 9
        // Dada una frase cualquiera, meterla sin los espacios
        // dentro de la matriz cuadrada de caracteres más pequeña
        // necesaria para que entre. Los espacios sobrantes al final se
        // rellenarán con asteriscos.
        // Ejemplo: “Ahora un ejemplo” :
        // Resultado: [[A, h, o, r], [a, u, n, e], [j, e, m, p], [l, o, *, *]]
        // Hacer el ejercicio con la frase “Esta es la frase de problema
        // nueve”.
        String frase = "Esta es la frase de problema nueve";
        String fraseSinEspacios = frase.replaceAll("\\s", "");
        int longitud = fraseSinEspacios.length();
        /*
         * Aqui hacemos la raiz cuadrada de la longitud y redondeamos al entero mayor
         * más cercano para
         * obtener la matriz cuadrada más pequeña en la que cabe la frase
         */
        int dimension = (int) Math.ceil(Math.sqrt(longitud));
        char[][] matrizCuadrada2 = new char[dimension][dimension];
        int indiceFrase = 0;

        for (i = 0; i < dimension; i++) {
            for (j = 0; j < dimension; j++) {
                if (indiceFrase < longitud) {
                    matrizCuadrada2[i][j] = fraseSinEspacios.charAt(indiceFrase);
                    indiceFrase++;
                } else {
                    matrizCuadrada2[i][j] = '*';
                }
            }
        }
        System.out.println("El resultado del ejercicio 9 es:");
        System.out.println(Arrays.deepToString(matrizCuadrada2));
        // Ejercicio 10
        // En una matriz de enteros multiplicar cada elemento por
        // su número de fila y sumarle su número de columna.
        // Probarlo con:
        // {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18,
        // 19, 20}, {21, 22, 23, 24, 25}}
        int[][] arrayParaMultiplicar = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };

        int filas = arrayParaMultiplicar.length;
        int columnas = arrayParaMultiplicar[0].length;
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                arrayParaMultiplicar[i][j] = arrayParaMultiplicar[i][j] * i + j;
            }
        }
        System.out.println("El resultado del ejercicio 10 es:");
        System.out.println(Arrays.deepToString(arrayParaMultiplicar));
    }
}
