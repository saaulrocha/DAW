public class Ejercicios2 {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1 //
        /*
         * Obtener un listado con todos los múltiplos de 5 entre 5 y
         * 50
         */
        int i = 5;
        while (i <= 50) {
            if (i % 5 == 0)
                System.out.println(i);
            i++;
        }
        // Ejercicio 2 //
        /*
         * Crear una lista con todos los números pares entre -20 y 0
         * seguida de todos los números impares entre 1 y 21.
         */
        i = -20;
        while (i >= -20 && i <= 21) {
            if (i >= -20 && i <= 0) {
                if (i % 2 == 0)
                    System.out.println(i);
            } else if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
        // Ejercicio 3 //
        /*
         * .- Obtener un listado de 1 a 20. En cada número múltiplo de
         * 3 además del número pondrá el texto: ‘Múltiplo de tres’
         */
        i = 1;
        while (i >= 1 && i <= 20) {
            if (i % 3 == 0)
                System.out.println(i + " Es múltiplo de tres");
            else
                System.out.println(i);
            i++;
        }
        // Ejercicio 4 //
        /*
         * Obtener la suma de todos los números múltiplos de 3
         * entre 3 y 99.
         */
        i = 3;
        int resultado = 0;
        while (i >= 3 && i <= 98) {
            if (i % 3 == 0)
                resultado += i;
            i++;
        }
        System.out.println("El resultado de la suma de los múltiplos es " + resultado);
        // Ejercicio 5 //
        /*
         * Sin utilizar FOR obtener un listado de todos los números
         * entre 0 y 50 que contengan el 2 o el 3.
         */
        i = 0;
        while (i >= 0 && i <= 50) {
            if (i % 10 == 2 || i % 10 == 3)
                System.out.println(i);
            else if (i >= 20 && i <= 39)
                System.out.println(i);
            i++;
        }
        // Ejercicio 6 //
        /*
         * Mostrar la frase: “listado entre 1 y 10” y a continuación
         * mostrar este listado. A continuación mostrar la frase “listado
         * entre 30 y 40 y a continuación mostrar ese listado.
         */
        i = 1;
        System.out.println("Listado entre 1 y 10");
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Listado entre 30 y 40");
        i = 30;
        while (i <= 40) {
            System.out.println(i);
            i++;
        }
        // Ejercicio 7 //
        /*
         * Obtener la suma de todos los números impares entre 0 y
         * 100. Obtener la suma de todos los múltiplos de 4 entre 0 y
         * 50. Mostrar la resta de las dos cantidades anteriores.
         */
        i = 0;
        resultado = 0;
        int j = 0;
        int resultado2 = 0;
        while (i <= 99) {
            if (i % 2 != 0)
                resultado += i;
            i++;
        }
        while (j <= 50) {
            if (j % 4 == 0)
                resultado2 += j;
            j++;
        }
        System.out.println(resultado - resultado2);
        // Ejercicio 8 //
        /*
         * Mostrar la serie de Fibonacci entre 0 y 50.
         * Serie de Fibonacci: Consta de una serie de números
         * naturales que se suman de a 2, a partir de 0 y 1. Es decir,
         * cada número es la suma de los dos anteriores
         */
        int n1 = 0;
        int n2 = 1;
        int temp;

        System.out.println(n1);
        System.out.println(n2);

        while (n2 + n1 <= 50) {
            temp = n1;
            n1 = n2;
            n2 = temp + n1;

            System.out.println(n2);
        }
        // (Ejercicio 9) //
        /*
         * Mostrar la suma de todos los números impares entre -30
         * y 35
         */
        i = -30;
        resultado = 0;
        while (i <= 35) {
            if (i % 2 != 0) {
                resultado += i;
            }
            i++;
        }
        System.out.println(resultado);
        // (Ejercicio 10) //
        /* Obtener todos los números primos entre 0 y 40. */
        int numero = 2;

        while (numero <= 40) {
            boolean esPrimo = true;
            int divisor = 2;

            while (divisor * divisor <= numero) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                    break;
                }
                divisor++;
            }

            if (esPrimo) {
                System.out.print(numero + " ");
            }

            numero++;
        }
    }
}
