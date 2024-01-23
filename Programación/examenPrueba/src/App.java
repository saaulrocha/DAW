import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // Obtener el último número entre -21 y -97 que cumple la condición de ser múltiplo de 7 y de 3 al
        // mismo tiempo.
        int limiteInferior = -97;
        int limiteSuperior = -21;
        int ultimoNumeroEncontrado = 0;
        for (int i = limiteSuperior; i >= limiteInferior; i--) {
            if (i % 7 == 0 && i % 3 == 0) {
                ultimoNumeroEncontrado = i;
            }
        }
        System.out.println("Resultado del ejercicio 1");
        if (ultimoNumeroEncontrado != 0) {
            System.out.println("El último número entre -21 y -97 que es múltiplo de 7 y 3 es: " + ultimoNumeroEncontrado);
        } else {
            System.out.println("No se encontró ningún número que cumpla con la condición.");
        }
        // Ejercicio 2
        // Dados dos arrays de números cualquiera de la misma longitud, y un array cualquiera de
        // boolean de la misma longitud que los anteriores, obtener un array resultado en el que para cada
        // posición de los arrays, se guarde la multiplicación si el array de boolean tiene true, y la división si
        // tiene false.
        // Por ejemplo, para { 4, -4, 6, 71, 6, 93 } y { 3, 54, -1, 0, 10, 12 } y { true, true, false, true, false, false }, el
        // resultado será [12.0, -216.0, -6.0, 0.0, 0.6, 7.75].
        double[] array1 = {4, -4, 6, 71, 6, 93};
        double[] array2 = {3, 54, -1, 0, 10, 12};
        boolean[] booleanArray = {true, true, false, true, false, false};
        double[] resultArray = new double[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (booleanArray[i]) {
                resultArray[i] = array1[i] * array2[i];
            } else {
                resultArray[i] = array1[i] / array2[i];
            }
        }
        System.out.println("Resultado del ejercicio 2");
        System.out.println(Arrays.toString(resultArray));
        // Ejercicio 3
        // - Dado cualquier String, para cada una de sus palabras, cambiarla a mayúsculas si tiene una
        // longitud par, y a minúsculas si tiene una longitud impar. Al final, imprimir la frase con los cambios
        // realizados, tal como se pone en el ejemplo.
        // Por ejemplo, para la frase "Ahora vamos a hacer la prueba con en el ejercicio tres" tendrá que
        // mostrar por pantalla:
        // ahora vamos a hacer LA PRUEBA con EN EL ejercicio TRES
        String frase = "Ahora vamos a hacer la prueba con en el ejercicio tres";
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() % 2 == 0) {
                palabras[i] = palabras[i].toUpperCase();
            } else {
                palabras[i] = palabras[i].toLowerCase();
            }
        }
        String fraseModificada = String.join(" ", palabras);
        System.out.println(fraseModificada);
        // Ejercicio 4
        // - Se dan dos arrays cualquiera, pero de la misma longitud. El primer array es de Strings, con las
        // cadenas que vamos a modificar. El segundo array es de enteros. Estos números indicarán cuántos
        // caracteres de los Strings correspondientes nos quedamos, rellenando con asteriscos si se piden más
        // caracteres de los que tenía el String.
        // Por ejemplo, para el array { "enero", "febrero", "marzo", "abril", "mayo", "junio" } y { 2, 5, 10, 1, 7, 5
        // }, el array resultado será: [en, febre, marzo*****, a, mayo***, junio]
        System.out.println("El resultado del ejercicio 4 es:");
        String[] arrayCadenas = { "enero", "febrero", "marzo", "abril", "mayo", "junio" };
        int[] arrayNumeros = { 2, 5, 10, 1, 7, 5 };
        for (int i = 0; i < arrayCadenas.length; i++) {
            StringBuilder resultado = new StringBuilder();
            int caracteresCogidos = Math.min(arrayNumeros[i], arrayCadenas[i].length()); // Coge el número mas pequeño entre los dos
            resultado.append(arrayCadenas[i], 0, caracteresCogidos);
            int asteriscosPorAgregar = arrayNumeros[i] - arrayCadenas[i].length();
            for (int j = 0; j < asteriscosPorAgregar; j++) {
                resultado.append("*");
            }
            System.out.print(resultado.toString() + " ");
        }
        // Ejercicio 5
        // Dadas dos variables cualesquiera llamadas filas y columnas, indicarán el tamaño de la matriz de
        // enteros bidimensional que tienes que crear. Para rellenarla con valores, si la fila es par, tendrá que
        // tener números de la secuencia Fibonacci (1, 1, 2, 3, 5, 8, 13, 21, 34…), y si la fila es impar, tendrá los
        // números desde el número de columnas hasta el 0.
        // Por ejemplo, si tiene 6 filas y 7 columnas, el resultado será:
        // 1 1 2 3 5 8 13
        // 6 5 4 3 2 1 0
        // 1 1 2 3 5 8 13
        // 6 5 4 3 2 1 0
        // 1 1 2 3 5 8 13
        // 6 5 4 3 2 1 0
        System.out.println();
        System.out.println("El resultado del ejercicio 5 es:");
        int filas = 100;
        int columnas = 100;
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            if (i % 2 == 0) {  
                int fib1 = 1;
                int fib2 = 1;
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = fib1;
                    int temp = fib2;
                    fib2 = fib1 + fib2;
                    fib1 = temp;
                }
            } else { 
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = columnas - j - 1; // Uso el -1 para que empieze desde el 19 y no en 20 y acabe en 0 y no en 1
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

