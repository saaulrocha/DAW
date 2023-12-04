import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // Obtener la suma entre el 145 y el 348 (AMBOS INCLUIDOS) de los números que
        // sean múltiplos de
        // 3, de 5, o de los dos.
        int resultado = 0;
        for (int i = 145; i <= 348; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                resultado += i;
            }
        }
        System.out.println("Resultado del ejercicio 1");
        System.out.println(resultado);
        // Ejercicio 2
        // Utilizando estructuras de control, muestra en una misma línea, y separadas
        // por comas, las letras
        // desde la ‘A’ hasta la ‘Z’ (en mayúsculas), excepto las que están entre la ‘D’
        // y la ‘K’. En caso de que
        // sean vocales, tendrás que sustituirlas por un *. Sólo puedes utilizar un
        // bucle.
        // La salida deberá ser:
        // *, B, C, L, M, N, *, P, Q, R, S, T, *, V, W, X, Y, Z,
        char a = 'A';
        System.out.println("Resultado del ejercicio 2");
        while (a <= 'Z') {
            if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
                System.out.print("*" + "," + " ");
                a++;
            }
            if (a >= 'D' && a <= 'K') {
                a++;
            } else
                System.out.print(a + "," + " ");
            a++;
        }
        // Ejercicio 3
        // Declara una variable boolean llamada mayus. Para cualquier frase, si mayus es
        // true, transfórmala
        // a mayúsculas, y si es false, a minúsculas.
        // A continuación, indica en qué posiciones se encuentran las aes, y el número
        // total de las mismas.
        // Por ejemplo, para la frase “Ahora contamos en esta frase” con mayus=true,
        // debería mostrar por
        // salida estándar:
        // Frase transformada: AHORA CONTAMOS EN ESTA FRASE
        // Posiciones: 0, 4, 10, 21, 25,
        // Número de aes: 5
        // Probarlo con la frase: “Con esta frase estamos probando el ejercicio 3”
        System.out.println();
        System.out.println("Resultado del ejercicio 3");
        boolean mayus = true;
        String frase = "Con esta frase estamos probando el ejercicio 3";
        if (mayus) {
            frase = frase.toUpperCase();
        }
        if (!mayus) {
            frase = frase.toLowerCase();
        }
        System.out.println("Frase transformada: " + frase);
        System.out.print("Posiciones: ");
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                System.out.print(i + "," + " ");
                contador++;
            }
        }
        System.out.println();
        System.out.println("Número de aes: " + contador);
        // Ejercicio 4
        // Dada cualquier frase, hacer que sus caracteres sean el primero mayúscula, el
        // segundo minúscula,
        // el tercero mayúscula, etc. Los espacios no los tendrá en cuenta al hacer esta
        // conversión. Ejemplo, en
        // “Esta es la frase de ejemplo”, se quedaría así:
        // “EsTa Es La FrAsE dE eJeMpLo”
        // Probarlo con “Esta es la frase del examen”
        frase = "Esta es la frase del examen";
        char espacio = 32;
        int i = 0;
        boolean flag = false;
        char[] caracteres = frase.toCharArray();
        while (i < caracteres.length) {
            if (caracteres[i] != espacio && flag == false) {
                flag = true;
                caracteres[i] = Character.toUpperCase(caracteres[i]);
            } else if (caracteres[i] != espacio && flag == true) {
                flag = false;
                caracteres[i] = Character.toLowerCase(caracteres[i]);
            }
            i++;
        }
        String resultado1 = new String(caracteres);
        System.out.println("Resultado del ejercicio 4");
        System.out.println(resultado1);
        // Ejercicio 5
        // Sumar los elementos de cualquier array unidimensional cuyos VALORES acaben en
        // la cifra 3.
        // Probarlo con {2, 6, 8, 13, 24, 33, 1, 103, 2, 53}
        int[] arrayNumero3 = { 2, 6, 8, 13, 24, 33, 1, 103, 2, 53 };
        resultado = 0;
        for (i = 0; i < arrayNumero3.length; i++) {
            if (arrayNumero3[i] % 10 == 3) {
                resultado += arrayNumero3[i];
            }
        }
        System.out.println("Resultado del ejercicio 5");
        System.out.println(resultado);
        // Ejercicio 6
        // Dado cualquier par de arrays de igual o distintas longitudes de números
        // enteros, calcular el array
        // resultado que contenga, para cada una de las posiciones de los arrays, la
        // suma de ambos valores si
        // los dos eran pares, la resta de los valores si uno es par y el otro impar, y
        // -1 si los dos son impares.
        // Cuando acabe uno de los dos arrays, ignorará el resto de valores sobrantes.
        // Por ejemplo, para array1 { 1, 2, 6, 9, 15 } y array2 { 9, 8, 11, 6, 7, 3, 2
        // }, el array resultante será [-1, 10,
        // -5, 3, -1]
        int[] array1 = { 1, 2, 6, 9, 15 };
        int[] array2 = { 9, 8, 11, 6, 7, 3, 2 };
        int longitudArrayPequeño = 0;
        if (array1.length <= array2.length) {
            longitudArrayPequeño = array1.length;
        } else
            longitudArrayPequeño = array2.length;
        int[] array3 = new int[longitudArrayPequeño];
        i = 0;
        int k = 0;
        while (i < longitudArrayPequeño) {
            if (array1[i] % 2 == 0 && array2[k] % 2 == 0) {
                array3[i] = array1[i] + array2[k];
                i++;
                k++;
            }
            if (array1[i] % 2 != 0 && array2[k] % 2 != 0) {
                array3[i] = -1;
                i++;
                k++;
            } else {
                array3[i] = array1[i] - array2[k];
                i++;
                k++;
            }
        }
        System.out.println("Resultado del ejercicio 6");
        for (i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        // Ejercicio 7
        // Dada cualquier frase, indicar cuáles son los caracteres que aparecen más de
        // una vez, y cuántas
        // veces aparecen cada uno de ellos, ignorando si están en mayúsculas o
        // minúsculas, e ignorando los
        // espacios. Por ejemplo, para la frase “Aqui hay varias repeticiones”, el
        // resultado será:
        System.out.println("Resultado del ejercicio 7");
        frase = "Aqui hay varias repeticiones";
        char letra = a;
        i = 0;
        contador = 0;
        frase = frase.toLowerCase();
        while (letra <= 'z') {
            while (i < frase.length()) {
                if (frase.charAt(i) == letra)
                    contador++;
                i++;
            }
            if (contador > 1) {
                System.out.println(letra + " se repite " + contador + " veces");
            }
            letra++;
            contador = 0;
            i = 0;
        }
        // Ejercicio 8
        // Mostrar una matriz bidimensional de un tamaño de filas y columnas que será
        // preguntado. A
        // continuación, se preguntará por la fila y la columna del punto central. A
        // partir de este punto central
        // partirán asteriscos hasta los bordes en vertical y en horizontal. Todo el
        // contorno de la matriz estará
        // formado por puntos, excepto los asteriscos que vienen del punto central.
        // char asterisco = '*';
        // char punto = '.';
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Introduce el número de filas: ");
        // int filas = scanner.nextInt();
        // System.out.println("Introduce el número de columnas: ");
        // int columnas = scanner.nextInt();
        // System.out.println("Introduce donde encontrar el punto central (fila): ");
        // int x = scanner.nextInt();
        // System.out.println("Introduce donde encontrar el punto central (columna): ");
        // int y = scanner.nextInt();
        // i = 0;
        // k = 0;
        // while (k < columnas) {
        //     while (i < filas) {
        //         if (i != x || k != y) {
        //             System.out.print(punto);
        //         }
        //         if (k == y - 1 && i == x) {
        //             System.out.print(asterisco);
        //         }
        //         i++;
        //     }
        //     i = 0;
        //     System.out.println();
        //     k++;
        // }
        System.out.println("Se intento el 8 pero no hay tiempo :()");
    }
}
