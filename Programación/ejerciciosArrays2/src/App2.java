import java.util.Arrays;

public class App2 {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // Reordenar de mayor a menor el siguiente array [4, 6, 1, 5,
        // 6, 15, 12, 7].
        int[] arrayParaOrdenar = { 4, 6, 1, 5, 6, 15, 12, 7 };
        int i = 0;
        int j = 0;
        int swap = 0;
        for (i = 0; i < arrayParaOrdenar.length - 1; i++) {
            for (j = 0; j < arrayParaOrdenar.length - i - 1; j++) {
                if (arrayParaOrdenar[j + 1] < arrayParaOrdenar[j]) {
                    swap = arrayParaOrdenar[j + 1];
                    arrayParaOrdenar[j + 1] = arrayParaOrdenar[j];
                    arrayParaOrdenar[j] = swap;
                }
            }
        }
        System.out.println("Array ordenado de mayor a menor (Ejercicio 1)");
        for (i = 0; i < arrayParaOrdenar.length; i++) {
            System.out.print(arrayParaOrdenar[i] + " ");
        }
        System.out.println();
        // Ejercicio 2
        // Dado el siguiente array de Strings [“tren”, “coche”,
        // “barco”, “avioneta”] obtener otro de enteros y del mismo
        // tamaño pero que en cada posición esté la longitud de cada
        // String.
        String[] arrayStrings = { "tren", "coche", "barco", "avioneta" };
        int[] arrayLengthStrings = new int[arrayStrings.length];
        i = 0;
        while (i < arrayStrings.length) {
            arrayLengthStrings[i] = arrayStrings[i].length();
            i++;
        }
        System.out.println("La longitud de cada String de mi array de Strings (Ejercicio 2)");
        for (i = 0; i < arrayLengthStrings.length; i++) {
            System.out.print(arrayLengthStrings[i] + " ");
        }
        System.out.println();
        // Ejercicio 3
        // Separar el siguiente array [2, 23, 12, 4, 36, 25, 11, 6, 21,
        // 45, 18] en otros tres. El primero tiene que contener todos los
        // elementos entre menores de 10, el segundo los elementos
        // entre 11 y 20 y el tercero los elementos entre 21 y 30. Los
        // elementos mayores de 30 serán descartados y los arrays no
        // pueden tener posiciones vacias.

        // Obtenemos las longitudes de los arrays.
        int[] arrayParaOrdenar2 = { 2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18 };
        i = 0;
        int contador = 0;
        while (i < arrayParaOrdenar2.length) {
            if (arrayParaOrdenar2[i] <= 10) {
                contador++;
            }
            i++;
        }
        int[] arrayMenoresDe10 = new int[contador];
        i = 0;
        contador = 0;
        while (i < arrayParaOrdenar2.length) {
            if (arrayParaOrdenar2[i] <= 20 && arrayParaOrdenar2[i] > 10) {
                contador++;
            }
            i++;
        }
        int[] arrayMenoresDe20 = new int[contador];
        i = 0;
        contador = 0;
        while (i < arrayParaOrdenar2.length) {
            if (arrayParaOrdenar2[i] <= 30 && arrayParaOrdenar2[i] > 20) {
                contador++;
            }
            i++;
        }
        // Rellenamos los arrays
        int[] arrayMenoresDe30 = new int[contador];
        i = 0;
        j = 0;
        int k = 0;
        int l = 0;
        while (i < arrayParaOrdenar2.length) {
            if (arrayParaOrdenar2[i] <= 10) {
                arrayMenoresDe10[j] = arrayParaOrdenar2[i];
                j++;
            }
            if (arrayParaOrdenar2[i] <= 20 && arrayParaOrdenar2[i] > 10) {
                arrayMenoresDe20[k] = arrayParaOrdenar2[i];
                k++;
            }
            if (arrayParaOrdenar2[i] <= 30 && arrayParaOrdenar2[i] > 20) {
                arrayMenoresDe30[l] = arrayParaOrdenar2[i];
                l++;
            }
            i++;
        }
        // Printeamos los arrays.
        System.out.println("Arrays Ordenados (Ejercicio 3)");
        System.out.println("Menores que 10");
        for (i = 0; i < arrayMenoresDe10.length; i++) {
            System.out.print(arrayMenoresDe10[i] + " ");
        }
        System.out.println();
        System.out.println("Menores que 20");
        for (i = 0; i < arrayMenoresDe20.length; i++) {
            System.out.print(arrayMenoresDe20[i] + " ");
        }
        System.out.println();
        System.out.println("Menores que 30");
        for (i = 0; i < arrayMenoresDe30.length; i++) {
            System.out.print(arrayMenoresDe30[i] + " ");
        }
        // Ejercicio 4
        // Dados estos dos arrays [2, 3, 4, 0, 2, 1, 4], [“hola”, “adiós”,
        // “que”, “veremos”, “suponiendo”, “puede”, “quizás”], obtener
        // un tercer array donde esté el carácter de cada String del
        // segundo array que está en la posición que indica el primer
        // array.
        // Es decir, del String “hola” obtener el carácter que está en la
        // posición 2, del String “adiós” obtener el carácter que está en
        // la posición 3, y así sucesivamente.
        // Si una posición es más larga que la posición del array tendrá
        // que poner el carácter ‘#’.
        int[] arrayPosiciones = { 2, 3, 4, 0, 2, 1, 4 };
        String[] arrayStrings2 = { "hola", "adiós", "que", "veremos", "suponiendo", "puede", "quizás" };
        if (arrayPosiciones.length != arrayStrings2.length)
            System.err.println("[Error >>>>] Debes introducir los mismos indices que palabras");
        char[] arrayChars = new char[arrayPosiciones.length];
        i = 0;
        while (i < arrayPosiciones.length) {
            if (arrayPosiciones[i] > arrayStrings2[i].length())
                arrayChars[i] = '#';
            else
                arrayChars[i] = arrayStrings2[i].charAt(arrayPosiciones[i]);
            i++;
        }
        System.out.println();
        System.out.println("Array de Caracteres de varios strings en base al indice dado (Ejercicio 4)");
        for (i = 0; i < arrayChars.length; i++) {
            System.out.print(arrayChars[i] + " ");
        }
        System.out.println();
        // Ejercicio 5
        // Coger la frase “Esta es la frase que vamos a partir” y
        // obtener un array donde en cada posición esté una palabra de
        // la frase. No utilizar el método split() de la clase String.
        String frase = "Esta es la frase que vamos a partir";

        i = 0;
        int numeroPalabras = 0;

        if (Character.isLetter(frase.charAt(0))) {
            numeroPalabras++;
        }

        while (i < frase.length()) {
            if (frase.charAt(i) == ' ') {
                numeroPalabras++;
            }
            i++;
        }

        String[] palabrasArray = new String[numeroPalabras];
        int inicio = 0;
        int fin = 0;
        int index = 0;

        for (i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ' || i == frase.length() - 1) {
                if (i == frase.length() - 1) {
                    fin = i + 1;
                } else {
                    fin = i;
                }
                palabrasArray[index++] = frase.substring(inicio, fin);
                inicio = i + 1;
            }
        }
        System.out.println("Mi array de las palabras sin usar split es (Ejercicio 5)");
        for (i = 0; i < palabrasArray.length; i++) {
            String palabra = palabrasArray[i];
            System.out.print(palabra + " ");
        }
        System.out.println();
        // Ejercicio 6
        // Repetir el ejercicio anterior utilizando el método
        // split(cadena) de la clase String, donde cadena es el String
        // por donde vamos a romper la frase. (Buscar en Internet el
        // funcionamiento del método split()).
        String frase2 = "Esta es la frase que vamos a partir";
        String[] arrayFrase = frase2.split(" ");
        System.out.println("Mi array de las palabras usando split es (Ejercicio 6)");
        for (i = 0; i < arrayFrase.length; i++) {
            String palabra2 = arrayFrase[i];
            System.out.print(palabra2 + " ");
        }
        // Ejercicio 7
        // Coger el siguiente array [6, 9, 8, 10, 11] y dividirlo por
        // este otro posición a posición [2, 3, 4, 2, 3] y en el resultado
        // sumarle 10 a todos los valores menores de 4.
        int[] arrayDivisores = { 6, 9, 8, 10, 11 };
        int[] arrayDividendos = { 2, 3, 4, 2, 3 };
        int[] arrayResultado = new int[arrayDividendos.length];
        i = 0;
        j = 0;
        while (i < arrayDivisores.length) {
            arrayResultado[i] = arrayDivisores[i] / arrayDividendos[i];
            if (arrayResultado[j] < 4) {
                arrayResultado[j] += 10;
                j++;
            } else
                j++;
            i++;
        }
        System.out.println();
        System.out.println("Array de arrays divididos entre ellos y sumando 10 si es menor a 4 el resultado (Ejercicio 7)");
        for (i = 0; i < arrayResultado.length; i++) {
            System.out.print(arrayResultado[i] + " ");
        }
        System.out.println();
        // Ejercicio 8
        // A partir del siguiente array de caracteres [‘a’, ‘b’, ‘f’, ‘g’, ‘e’,
        // ‘i’, ‘o’, ‘p’, ‘x’], obtener un array de Strings donde los
        // caracteres del array anterior estén agrupados de 3 en 3. Es
        // decir, obtener el array [“abf”, “gei”, “opx”]
        char[] caracteres = {'a', 'b', 'f', 'g', 'e', 'i', 'o', 'p', 'x'};
        int longitudNuevoArray = (caracteres.length / 3);
        String[] gruposDeTres = new String[longitudNuevoArray];
        int indiceCaracter = 0;
        int indiceNuevoArray = 0;
        while (indiceCaracter < caracteres.length) {
            StringBuilder creadorDeGrupos = new StringBuilder();
            for (i = 0; i < 3 && indiceCaracter < caracteres.length; i++) {
                creadorDeGrupos.append(caracteres[indiceCaracter]);
                indiceCaracter++;
            }
            gruposDeTres[indiceNuevoArray] = creadorDeGrupos.toString();
            indiceNuevoArray++;
        }
        System.out.println("Array agrupado en tres caracteres dado un array de chars (Ejercicio 8)");
        for (i = 0; i < gruposDeTres.length; i++) {
            System.out.print(gruposDeTres[i] + " ");
        }
        // Ejercicio 9
        // Coger la siguiente frase “Esta es la frase del ejercicio
        // nueve” y obtener dos arrays de caracteres, uno donde estén
        // todas las consonantes y otro donde estén todas las vocales
        // (sin posiciones vacias).
        System.out.println();
        String frase3 = "Esta es la frase del ejercicio nueve";
        int vocales = 0;
        int consonantes = 0;
        i = 0;
        char esEspacio = 32;
        while (i < frase3.length()) {
            char charActual = Character.toLowerCase(frase3.charAt(i));
            if (charActual == 'a' || charActual == 'e' || charActual == 'i' || charActual == 'o' || charActual == 'u') {
                vocales++;
            }
            else if (charActual != esEspacio) {
                consonantes++;
            }
            i++;
        }
        char[] arrayVocales = new char[vocales];
        char[] arrayConsonantes = new char[consonantes];
        i = 0;
        j = 0;
        k = 0;
        while (i < frase3.length()) {
            char charActual = frase3.charAt(i);
            if (charActual == 'a' || charActual == 'e' || charActual == 'i' || charActual == 'o' || charActual == 'u' || charActual == 'A' || charActual == 'E' || charActual == 'I' || charActual == 'O' || charActual == 'U') {
                arrayVocales[j] = charActual;
                j++;
            }
            else if (charActual != esEspacio) {
                arrayConsonantes[k] = charActual;
                k++;
            }
            i++;
        }
        System.out.println("Array de vocales extraidos de frase (Ejercicio 9)");
        for (i = 0; i < arrayVocales.length; i++) {
            System.out.print(arrayVocales[i] + " ");
        }
        System.out.println();
        System.out.println("Array de consonantes extraidos de frase (Ejercicio 9)");
        for (i = 0; i < arrayConsonantes.length; i++) {
            System.out.print(arrayConsonantes[i] + " ");
        }
        System.out.println();
        // Ejercicio 10
        // Dado el siguiente array de Strings [“Coche”, “Tren”,
        // “Avión”, “Furgoneta”, “Moto”, “Barco”, “Autobus”] y este otro
        // array de booleanos [false, true, true, false, true, true, false].
        // El segundo array indica que elementos del primero han de
        // ser pasados a mayúsculas (true) y cuales a minúsculas
        // (false). Separar el resultado en dos arrays, uno donde estén
        // todos los correspondientes en mayúsculas y otro con los
        // otros en minúsculas. No debe de haber posiciones vacias.
        String[] arrStrings = {"Coche", "Tren", "Avión", "Furgoneta", "Moto", "Barco", "Autobus"};
        Boolean[] arrBooleans = {false, true, true, false, true, true, false};
        int numeroTrue = 0;
        int numeroFalse = 0;
        for (i = 0; i < arrBooleans.length; i++) {
            if (arrBooleans[i])
                numeroTrue++;
            else
                numeroFalse++;
        }
        String[] arrMayuStrings = new String[numeroTrue];
        String[] arrMinuStrings = new String[numeroFalse];
        i = 0;
        j = 0;
        k = 0;
        while (i < arrStrings.length) {
            if (arrBooleans[i]) {
                arrMayuStrings[j] = arrStrings[i].toUpperCase();
                j++;
            }
            else {
                arrMinuStrings[k] = arrStrings[i].toLowerCase();
                k++;
            }
            i++;
        }
        System.out.println("Array de Strings en Mayusculas (Ejercicio 10)");
        for (i = 0; i < arrMayuStrings.length; i++) {
            System.out.print(arrMayuStrings[i] + " ");
        }
        System.out.println();
        System.out.println("Array de Strings en Minusculas (Ejercicio 10)");
        for (i = 0; i < arrMinuStrings.length; i++) {
            System.out.print(arrMinuStrings[i] + " ");
        }
    }
}
