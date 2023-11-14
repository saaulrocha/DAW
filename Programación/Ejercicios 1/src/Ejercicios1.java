public class Ejercicios1 {
    public static void main(String[] args) throws Exception {
        // Ejercicios con variables y operadores //
        // Ejercicio 1 //
        int a = 10;
        int b = 20;
        int c = 30;
        int d = a + b + c;
        System.out.println("La respuesta al ejercicio 1 es " + d);
        // Ejercicio 2 //
        int valor1 = 10;
        double valor2 = 20.2;
        double valor3 = 30.5;
        double resultado = valor1 + valor2 + valor3;
        System.out.println("La respuesta al ejercicio 2 es " + resultado);
        // Ejercicio 3 //
        int valor4 = 10;
        valor4++;
        valor4++;
        valor4++;
        valor4++;
        System.out.println("La respuesta al ejercicio 3 es " + valor4);
        // Ejercicio 4 //
        int valor5 = 4;
        int valor6 = 9;
        int resultado2 = valor5 * valor6;
        resultado2 = resultado2 - valor5;
        resultado2 = resultado2 - valor6;
        System.out.println("La respuesta al ejercicio 4 es " + resultado2);
        // Ejercicio 5 //
        int valor7 = 15;
        double valor8 = 5.5;
        double resultado3 = valor7 / valor8;
        System.out.println("La respuesta al ejercicio 5 es " + resultado3);
        // Ejercicio 6 //
        int valor9 = 4 ;
        int temp = valor9 % 2;
        System.out.println("(Ejercicio 6) 4 modulo 2 es: " + temp);
        temp = valor9 % 3;
        System.out.println("(Ejercicio 6) 4 modulo 3 es: " + temp);
        temp = valor9 % 4;
        System.out.println("(Ejercicio 6) 4 modulo 4 es: " + temp);
        // Ejercicio 7 //
        char letrav = 'v';
        char letraV = 'V';
        System.out.println("(Ejercicio 7) Mostramos la v minúscula : " + letrav);
        System.out.println("(Ejercicio 7) Mostramos la V Mayúscula : " + letraV);
        // Ejercicio 8 //
        boolean verdadero = true;
        boolean falso = false;
        System.out.println("(Ejercicio 8) Variable verdadera : " + verdadero);
        System.out.println("(Ejercicio 8) Variable falso : " + falso);
        // Ejercicio 9 //
        double valor10 = 3.5;
        int valor11 = 2;
        double resultado4 = valor10 - valor11;
        System.out.println("El resultado de el ejercicio 9 es " + resultado4);
        // Ejercicio 10 //
        int numeromil = 1000;
        double operador = numeromil / 2.3;
        operador = operador / 8;
        operador = operador / 5.7;
        operador = operador * operador;
        operador = operador * operador;
        System.out.println("El resultado final del ejercicio 10 es " + operador);
    } 
}
