
public class Ejercicios1 {
    public static void main(String[] args) throws Exception {
        // (Ejercicio 1) //
        // - Obtener un listado de todos los números pares del 2 al 20 //
        int par = 2;
        while (par <= 20) {
            if (par % 2 == 0)
                System.out.println(par);
            par++;
        }
        // (Ejercicio 2) //
        /*- Obtener un listado con los números del 1 al 10. En la
        posición del cinco en lugar de salir el número ha de salir la
        palabra ‘CINCO’*/
        int number = 1;
        while (number <= 10) {
            if (number == 5)
                System.out.println("CINCO");
            else
                System.out.println(number);
            number++;
        }
        // (Ejercicio 3) //
        /*- Obtener un listado de todos los números del -30 al 30.
        Los números que se encuentren entre 0 y 8 sólo aparecerán
        los pares. */
        int number3 = -30;
        while (number3 <= 30) {
            if (number3 >= 0 && number3 <= 8) {
                if (number3 % 2 == 0)
                    System.out.println(number3);
            } else
                System.out.println(number3);
            number3++;
        }
        // (Ejercicio 4) //
        /*- Sin utilizar la sentencia FOR sacar un listado de todos los
        números impares del 7 al 21. */
        int number4 = 7;
        while (number4 <= 21) {
            if (number4 % 2 != 0)
                System.out.println(number4);
            number4++;
        }
        // (Ejercicio 5) //
        /*
         * 5.- Obtener un listado de todos los números del 1 al 100 que
         * contengan un 8.
         */
        int number6 = 1;
        while (number6 <= 98) {
            if (number6 % 10 == 8 && number6 != 88)
                System.out.println(number6);
            if (number6 >= 80 && number6 <= 89)
                System.out.println(number6);
            number6++;
        }
        // (Ejercicio 6) //
        /*- Obtener un listado de todos los números múltiplos de 4
        entre 4 y 40. */
        int number7 = 4;
        while (number7 <= 40) {
            if (number7 % 4 == 0)
                System.out.println(number7);
            number7++;
        }
        // (Ejercicio 7) //
        /*- Sin utilizar la sentencia FOR hacer un listado de 10 al -10
        seguido a continuación de otro de -10 a 10. */
        int number8 = 10;
        boolean primeraVuelta = false;
        while (number8 >= -10 && primeraVuelta == false) {
            System.out.println(number8);
            number8--;
        }
        primeraVuelta = true;
        number8++;
        while (primeraVuelta == true && number8 <= 10) {
            System.out.println(number8);
            number8++;
        }
        // Ejercicio 8 //
        /*- Obtener un listado de los números pares entre -20 y 0 y a
        partir del 0 un listado de los números impares entre 1 y 21. */
        int number9 = -20;
        while (number9 >= -20 && number9 <= 21) {
            if (number9 >= -20 && number9 <= 0) {
                if (number9 % 2 == 0)
                    System.out.println(number9);
            } else if (number9 % 2 != 0)
                System.out.println(number9);
            number9++;
        }
        // Ejercicio 9 //
        /*- Obtener la suma de todos los números entre 5 y 15. */
        int i = 5;
        int resultado = 0;
        while (i <= 15) {
            resultado += i;
            i++;
            System.out.println(resultado);
        }
        // Ejercicio 10 //
        /*
         * Obtener la suma de todos los números impares entre 3 y
         * 21 exceptuando el 13 y el 17
         */
        int j = 3;
        int resultado2 = 0;
        while (j >= 3 && j <= 21) {
            if (j % 2 != 0 && j != 13 && j != 17) {
                resultado2 += j;
            }
            j++;
        }
        System.out.println(resultado2);

    }
}
