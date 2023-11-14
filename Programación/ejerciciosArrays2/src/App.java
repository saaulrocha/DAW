public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // Reordenar de mayor a menor el siguiente array [4, 6, 1, 5,
        // 6, 15, 12, 7].
        int[] arrayParaOrdenar = { 4, 6, 1, 5, 6, 15, 12, 7 };
        int i = 0;
        int j = 0;
        int swap = 0;
        for (i = 0; i < arrayParaOrdenar.length - 1; i++) {
            for (j = 0; j < arrayParaOrdenar.length -i - 1; j++) {
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
        String str1 = "Esta es la frase que vamos a partir";
        // Contar palabras
        i = 0;
        int numeroPalabras = 0;
        if ((str1.charAt(0) >= 'a' && str1.charAt(0)<= 'z') || (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z'))
            numeroPalabras++;
        while (i < str1.length()) {
            if (str1.charAt(i) == 32)
                numeroPalabras++;
            i++;
        }
        System.out.println(numeroPalabras);
    }
}