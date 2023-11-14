public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // Dado estos dos arrays: {1, 3, 5, 7, 8} y {1, 2, 3, 4, 5} obtener el
        // array resultado de la suma de ambos (suma de elementos de la
        // misma posición).
        int[] array1 = { 1, 3, 5, 7, 8 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        int[] array3 = new int[5];
        int i = 0;

        while (i < array1.length && i < array2.length) {
            array3[i] = array1[i] + array2[i];
            i++;
        }
        i = 0;
        System.out.println("Mi array de sumas es:");
        while (i < array3.length) {
            System.out.print(array3[i] + " ");
            i++;
        }
        System.out.println();
        // Ejercicio 2
        // En el ejercicio anterior sumar sólo las posiciones impares.
        int[] array4 = new int[2];
        i = 0;
        int j = 0;
        while (i < array1.length && i < array2.length) {
            if (i % 2 != 0) {
                array4[j] = array1[i] + array2[i];
                j++;
            }
            i++;
        }
        i = 0;
        System.out.println("Ahora solo las posiciones impares");
        while (i < array4.length) {
            System.out.print(array4[i] + " ");
            i++;
        }
        // Ejercicio 3
        // Obtener la suma de los elementos del siguiente array {1, 4, 6, 10, -3, 4, 6,
        // -5}
        int[] arraySum = { 1, 4, 6, 10, -3, 4, 6, -5 };
        i = 0;
        int resultado = 0;
        while (i < arraySum.length) {
            resultado += arraySum[i];
            i++;
        }
        System.out.println(resultado);
        // Ejercicio 4
        // Imprimir en pantalla los elementos del siguiente array {2, 3, 4, 7, 8, 10,
        // 11}
        // indicando para cada uno de ellos si es par o impar.
        int[] arrayPar = { 2, 3, 4, 7, 8, 10, 11 };
        i = 0;
        while (i < arrayPar.length) {
            if (arrayPar[i] % 2 == 0)
                System.out.println("El número " + arrayPar[i] + " es par");
            else
                System.out.println("El número " + arrayPar[i] + " es impar");
            i++;
        }
        // Ejercicio 5
        // A partir del siguiente array {2, 3, 4, 7, 8, 10, 11} obtener dos
        // más, uno que contenga solo los elementos menores de 6 y otro
        // los mayores de 6.
        int[] array6 = { 2, 3, 4, 7, 8, 10, 11 };
        int[] array7 = new int[3];
        int[] array8 = new int[4];
        i = 0;
        j = 0;
        
        while (i < array6.length) {
            if (array6[i] < 6) {
                array7[j] = array6[i];
                j++;
            } else {
                array8[i-j] = array6[i];
            }
            i++;
        }
        
        System.out.println("Array menores de 6: ");
        for (i = 0; i < j; i++) {
            System.out.print(array7[i] + " ");
        }
        System.out.println("\nArray mayores de 6: ");
        for (i = 0; i < array8.length; i++) {
            System.out.print(array8[i] + " ");
        }
        System.out.println();
        // Ejercicio 6
        // A partir del siguiente array {2, 3, 4, 7, 8, 10, 11} obtener dos
        // más, uno que contenga solo los elementos pares y otro los
        // impares.
        int[] array9 = {2, 3, 4, 7, 8, 10, 11};
        int[] arrayPares = new int[4];
        int[] arrayImpares = new int[3];
        i = 0;
        j = 0;
        while (i < array9.length) {
                if (array9[i] % 2 == 0) {
                    arrayPares[j] = array9[i];
                    j++;
                } else {
                    arrayImpares[i-j] = array9[i];
                }
                i++;
            }
        System.out.println("Array Pares: ");
        for (i = 0; i < j; i++) {
            System.out.print(arrayPares[i] + " ");
        }
        System.out.println("\nArray Impares: ");
        for (i = 0; i < arrayImpares.length; i++) {
            System.out.print(arrayImpares[i] + " ");
        }
        System.out.println();
        // Ejercicio 7
        // A partir del siguiente array {2, 3, 4, 7, 8, 10, 11} obtener otro
        // con ceros intercalados entre sus posiciones {2, 0, 3, 0, 4, 0, …}
        int[] array10 = {2, 3, 4, 7, 8, 10, 11};
        int[] array0 = new int[array10.length * 2];
        i = 0;
        j = 0;
        while (i < array0.length && j < array10.length) {
            array0[i] = array10[j];
            i++;
            array0[i] = 0;
            j++;
            i++;
        }
        System.out.println("Array Intercalando Ceros");
        for (i = 0; i < array0.length; i++) {
            System.out.print(array0[i] + " ");
        }
        System.out.println();
        // Ejercicio 8
        // A partir del siguiente array {2, 3, 4, 7, 8} obtener otro donde
        // la primera posición se multiplique por 10, la segunda por 100, la
        // tercera por 1000 etc…
        int[] array11 = {2, 3, 4, 7, 8};
        int[] arrayMulti = new int[array11.length];
        i = 0;
        int multiplicador = 10;
        while (i < array11.length) {
            arrayMulti[i] = array11[i] * multiplicador;
            i++;
            multiplicador = multiplicador * 10;
        }
        System.out.println("Array Multiplicando");
        for (i = 0; i < arrayMulti.length; i++) {
            System.out.print(arrayMulti[i] + " ");
        }
        System.out.println();
        // Ejercicio 9
        // Dados estos dos arrays: {1, 3, 5, 7, 9} y {6, 4, 2, 1, 3} multiplicar
        // un array por otro (posición a posición) y dividir el resultado entre
        // 10 (todas las posiciones).
        double[] array12 = {1, 3, 5, 7, 9};
        double[] array13 = {6, 4, 2, 1, 3};
        double[] arrayDef = new double[array12.length];
        i = 0;
        while (i < array12.length) {
            arrayDef[i] = array12[i] * array13[i] / 10;
            i++;
        }
        System.out.println("Array multiplicando y dividiendo");
        for (i = 0; i < arrayDef.length; i++) {
            System.out.print(arrayDef[i] + " ");
        }
        System.out.println();
        // Ejercicio 10
        // Dado el siguiente array de caracteres { ´P’, ‘a’, ‘l’, ‘a’, ‘b’, ‘r’,
        // ‘a’} convertirlo en un String.
        char[] arrayChars = {'P', 'a', 'l', 'a', 'b', 'r', 'a'};
        System.out.println("Mi array de chars pasado a string es: " + String.valueOf(arrayChars));
    }
}
