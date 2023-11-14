public class Ejercicios3 {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // Crear una variable con el valor 34.5. Restar sucesivas //
        // veces el valor 0.3 a la variable anterior hasta que el valor de //
        // dicha variable sea menor que 22.4. Obtener el número de //
        // veces que ha sido restado 0.3 hasta obtener el valor final. //
        double dNumber = 34.5;
        int contador = 0;
        while (dNumber >= 22.4)
        {
            dNumber -= 0.3;
            contador++;
        }
        System.out.println("El resultado es " + dNumber);
        System.out.println("Se ha restado " + contador + " veces");
        System.out.print("\n");
        // Ejercicio 2
        // Crear la variable booleana meta = false. sumar todos los
        // números consecutivamente 1 + 2 + 3 + 4 ..etc. Cuando la
        // suma anterior sea mayor de 40 obtener cual ha sido el
        // último número sumado y cambiar meta a true.
        boolean meta = false;
        int i = 0;
        int numeroActual = 1;
        while (!meta) {
            i += numeroActual;
            if (i > 40) {
                int ultimoNumeroSumado = numeroActual;
                meta = true;
                System.out.println("El último número sumado es: " + ultimoNumeroSumado);
            }
            numeroActual++;
        }
        System.out.print("\n");
        // Ejercicio 3 
        // Hacer el siguiente listado: en primer lugar 2. En segundo
        // lugar el resultado de 2*2. En tercer lugar el resultado de
        // 2*2*2 y así consecutivamente hasta que multipliquemos 2
        // por si mismo 10 veces.
        contador = 10;
        int resultado = 1;
        System.out.println("Listado de potencia de 3 hasta 10:");
        for (int numero = 2; contador != 0; contador--) {
            resultado += resultado * numero;
            System.out.print(resultado + " ");
        }
        System.out.print("\n\n");
        // Ejercicio 4
        // Utilizando la estructura DO-WHILE obtener un listado de
        // los números pares del 22 al 48.
        i = 22;
        System.out.println("Listado Números pares 22 al 48");
        do {
            if (i % 2 == 0)
            System.out.print(i + " ");
            i++;
        } while (i >= 22 && i <= 48);
        System.out.print("\n\n");
        // Ejercicio 5
        // - Obtener cuantas veces hay que sumar 0,48 (0,48 + 0,48 +
        // 0,48…etc) para sobrepasar el valor de 23,4.
        contador = 0;
        for (dNumber = 0.48; dNumber <= 23.4; contador++)
        {
            dNumber += dNumber;
        }
        System.out.println("El número de veces que hay que sumar es " + contador);
        System.out.println();
        // Ejercicio 6
        // Obtener la suma de todos los números impares desde -21
        // a -9 más la suma de todos los elementos pares de 14 a 64.
        int x = -21;
        resultado = 0;
        while (x >= -21 && x <= 64)
        {
            if (x % 2 != 0 && x <= -9)
                resultado += x;
            if (x % 2 == 0 && x >= 14)
                resultado += x;
            x++;
        }
        System.out.println("La suma de los impares desde -21 a -9 más los pares de 14 a 64 es " + resultado);
        System.out.println();
        // Ejercicio 7
        // Obtener el resultado de dividir 4096 entre 2, a
        // continuación entre 3, a continuación entre 4 y así
        // consecutivamente hasta 8. Hacerlo empleando la sentencia
        // FOR o WHILE.
        int divisor = 2;
        int dividendo = 4096;
        while (divisor <= 8)
        {
            dividendo = dividendo / divisor;
            divisor++;
        }
        System.out.println("El resultado de dividir 4096 desde 2 hasta 8 es " + dividendo);
        System.out.println();
        // Ejercicio 8
        // Obtener la suma de todos los números entre 0 y 100
        // exceptuando aquellos que contengan un 7.
        i = 0;
        resultado = 0;
        while(i >= 0 && i <= 100)
        {
            if (i % 10 != 7 && (i <= 69 || i >= 80))
            {
                resultado += i;
            }
            i++;
        }
        System.out.println("EL resultado de sumar todos los números de 0 a 100 menos los que contengan 7 es " + resultado);
        System.out.println();
        // Ejercicio 9
        // Crear una lista de números múltiplos de 6 entre 6 y 60 de
        // modo que cada número esté al lado del siguiente y separado
        // por un espacio (no en una fila de arriba hacia abajo).
        i = 6;
        while(i >= 6 && i <= 60)
        {
            if (i % 6 == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        // Ejercicio 10
        // 10.- Obtener una lista de números entre el 0 y el 100. En
        // cada cambio de decena se ha de imprimir el mensaje:
        // ‘Cambio de decena’.
        i = 0;
        while (i >= 0 && i <= 100)
        {
            if (i % 10 == 0)
                System.out.println("Cambio de decena");
            else
                System.out.println(i);
            i++;
        }
    }
}