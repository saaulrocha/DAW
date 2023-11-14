import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // Pedir a través de un Scanner que se introduzca una frase.
        // A continuación, mostrar la cantidad de letras, de vocales y de
        // palabras que tiene dicha cadena introducida.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();
        int cantidadLetras = frase.replaceAll("[^a-zA-Z]", "").length();
        int cantidadVocales = frase.replaceAll("[^aeiouAEIOU]", "").length();
        String[] palabras = frase.split(" ");
        int cantidadPalabras = palabras.length;
        System.out.println("Cantidad de letras: " + cantidadLetras);
        System.out.println("Cantidad de vocales: " + cantidadVocales);
        System.out.println("Cantidad de palabras: " + cantidadPalabras);
        // Ejercicio 2
        // Pedir por pantalla que se introduzcan dos números con
        // decimales. A continuación, mostrar el resultado de su
        // división mostrando, al menos, 5 cifras del número entero
        // (rellena con 0 a la izquierda) y 5 cifras decimales.
        // Por ejemplo, si se introduce 395,8 y 7,9 el resultado a
        // mostrar debería ser 00050,10127.
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Introduce el primer número decimal: ");
        double numero1 = scanner2.nextDouble();
        System.out.print("Introduce el segundo número decimal: ");
        double numero2 = scanner2.nextDouble();
        double resultado = numero1 / numero2;
        System.out.printf("El resultado de la división es: %011.5f%n", resultado);
        // Ejercicio 3
        // Pedir por pantalla que se introduzcan dos números
        // enteros. A continuación, mostrar el resultado de su suma,
        // resta, multiplicación y división con el formato indicado en el
        // ejemplo, y de manera que la parte entera tenga 5 cifras
        // (rellenando con espacios a la izquierda). Por ejemplo, si se
        // introduce 14 y 6, la salida será:
        // 14 + 6 = 20
        // 14 – 6 = 8
        // 14 * 6 = 84
        // 14 / 6 = 2
        System.out.print("Introduce el primer número entero: ");
        int numero3 = scanner.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int numero4 = scanner.nextInt();
        int suma = numero3 + numero4;
        int resta = numero3 - numero4;
        int multiplicacion = numero3 * numero4;
        int division = numero3 / numero4;
        System.out.printf("%5d + %5d = %5d%n", numero3, numero4, suma);
        System.out.printf("%5d - %5d = %5d%n", numero3, numero4, resta);
        System.out.printf("%5d * %5d = %5d%n", numero3, numero4, multiplicacion);
        System.out.printf("%5d / %5d = %5d%n", numero3, numero4, division);
        // Ejercicio 4
        // Pedir por pantalla que se introduzcan dos números con
        // decimales. A continuación, pedir que se introduzca el tipo de
        // operación que se quiere realizar. Para ehsto último, se pedirá
        // que se escriba +, -, *, / o % (suma, resta, multiplicación,
        // división y módulo, respectivamente).
        // Mostrar el resultado de dicha operación en notación
        // científica con 3 decimales.
        // Por ejemplo, 395,8 y 7,9 y la operación de multiplicación, el
        // resultado será 3,127e+03 (es decir, 3,127*103).
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Introduce el primer número decimal: ");
        double numero5 = scanner3.nextDouble();
        System.out.print("Introduce el segundo número decimal: ");
        double numero6 = scanner3.nextDouble();
        System.out.print("Introduce el tipo de operación a realizar (+, -, *, / o %): ");
        char operador = scanner3.next().charAt(0);
        double resultados = 0;
        switch (operador) {
            case '+':
                resultados = numero5 + numero6;
                break;
            case '-':
                resultados = numero5 - numero6;
                break;
            case '*':
                resultados = numero5 * numero6;
                break;
            case '/':
                resultados = numero5 / numero6;
                break;
            case '%':
                resultados = numero5 % numero6;
                break;
            default:
                System.out.println("Operador no válido.");
                break;
        }
        System.out.printf("%.3e%n", resultados);
        // Ejercicio 5
        // Pedir por pantalla un número y mostrar su equivalente
        // en la tabla ASCII. Si el número está por debajo de 32 o por
        // encima de 126, mostrará un mensaje por la salida estándar
        // de error (System.out) indicando que está fuera de rango, y
        // no mostrará ningún carácter
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Introduce un entero y te dire su equivalencia en la tabla ascii");
        char caracter = 0;
        int toChar = scanner4.nextInt();
        if (toChar >= 32 && toChar <= 126) {
            caracter += toChar;
            System.out.println(caracter);
        }
        else
            System.err.println("¡ERROR! ----> Número fuera del rango");
        // Ejercicio 6
        // Pide por pantalla un número entero y muestra a
        // continuación su equivalente en el sistema octal y en el
        // sistema hexadecimal.
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Introduce un entero y te dire su equivalencia en el sistema octal y en el hexadecimal");
        int num = scanner5.nextInt();
        System.out.printf("Octal: %o\n", num);
        System.out.printf("Hexadecimal: 0x%08X\n", num);
        // Ejercicio 7
        // - Calcular el área de un círculo pidiendo el radio del
        // mismo. El resultado debe tener al menos 5 cifras decimales.
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Introduce el radio de un círculo y te diré su area");
        int num2 = scanner6.nextInt();
        final double pi = 3.14;
        double area = pi * (num2 * num2);
        System.out.printf("El área del círculo es: %.5f%n", area);
        // Ejercicio 8
        // Pedir un número por Scanner y mostrar su tabla de
        // multiplicar.
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Introduce un entero y te mostraré su tabla de multiplicar");
        int num3 = scanner7.nextInt();
        System.out.println("Tabla de multiplicar de " + num3 + ":");
        for (int i = 1; i <= 10; i++) {
            resultado = num3 * i;
            System.out.println(num3 + " x " + i + " = " + resultado);
        }
        // Ejercicio 9
        // Pedir a través de un Scanner que se introduzcan cadenas
        // de forma continua hasta que se introduzca “ESC”. Al
        // introducir “ESC”, dejará de pedir cadenas y mostrará por
        // pantalla el número de cadenas introducidas.
        
    }
}