import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) throws Exception {
        // Mostrar espacio (ejercicio 7 de operadores1) //
        
        char space = 32;
        System.out.println("(Ejercicio 7 de operadores 1:) " + space);
        // Ejercicio 1 //
        int ej1val1 = 12;
        ej1val1 = ej1val1 - 2;
        ej1val1 = ej1val1 * ej1val1;
        System.out.println("Resultado del ejercicio 1: " + ej1val1);
        // Ejercicio 2 //
        int ej2val1 = 16;
        int ej2val2 = 5;
        int ej2val3 = ej2val1 / ej2val2;
        System.out.println("El resultado del ejercicio 2 es: " + ej2val3);
        // Ejercicio 3 //
        int ej3val1 = 10213;
        if (ej3val1 % 4 != 0 && ej3val1 % 5 != 0 && ej3val1 % 6 != 0 && ej3val1 % 7 != 0)
            System.out.println("El número 10213 no es múltiplo ni de 4 ni de 5 ni de 6 ni de 7");
        if (ej3val1 % 4 == 0)
            System.out.println("El número 10213 es múltiplo de 4");
        if (ej3val1 % 5 == 0)
            System.out.println("El número 10213 es múltiplo de 5");
        if (ej3val1 % 6 == 0)
            System.out.println("El número 10213 es múltiplo de 6");
        if (ej3val1 % 7 == 0)
            System.out.println("El número 10213 es múltiplo de 7");
        // Ejercicio 4 //
        int ej4val1 = 25 - 45;
        ej4val1 = ej4val1 * ej4val1;
        ej4val1 = ej4val1 * ej4val1 - 3;
        System.out.println("El resultado del ejercicio 4 es " + ej4val1);
        // Ejercicio 5 //
        int ej5val1 = 336;
        if (ej5val1 % 7 == 0)
            System.out.println("(Ejercicio 5) Si es múltiplo");
        else
            System.out.println ("(Ejercicio 5) No es múltiplo");
        // Ejercicio 6 //
        int ej6val1 = 25 * 2 - 10 + 1;
        System.out.println("El resultado del ejercicio 6 es " + ej6val1);
        // Ejercicio 7 // 
        int ej7val1 = 31;
        while (ej7val1 > 28)
        {
            ej7val1--;
        }
        System.out.println("(Ejercicio 7) Ya lo hemos restado las primeras 3 veces  ahora vale " + ej7val1);
        while (ej7val1 > 24)
        {
            ej7val1--;
        }
        System.out.println("(Ejercicio 7) Ya le hemos restado las 4 veces restantes y ahora vale " + ej7val1);
        // Ejercicio 8 //
        int ej8val1 = 712;
        while (ej8val1 % 11 != 0)
        {
            ej8val1++;
        }
        System.out.println("(Ejercicio 8) El múltiplo de 11 es " + ej8val1);
        // Ejercicio 9 //
        int ej9val1 = 21;
        int ej9val2 = 32;
        int ej9val3 = 40;
        System.out.println("El resultado del ejercicio 9 es " + (ej9val1 + ej9val2 + ej9val3));
        // Ejercicio 10 //
        int ej10val1 = 0;
        while (ej10val1 < 4) 
        {
             ej10val1 = ej10val1 + 1;
        }
        System.out.println("El resultado del ejercicio 10 es " + ej10val1);
        // Ejercicio 11 //
        Scanner sc = new Scanner(System.in);
        System.out.println("(Ejercicio 11) Introduce un entero");
        int ej11userint1 = sc.nextInt();
        System.out.println("(Ejercicio 10) El número escogido elevado al cuadrado es " + (ej11userint1 * ej11userint1));;
        // Ejercicio 12 //
        Scanner sc2 = new Scanner(System.in);
        System.out.println("(Ejercicio 12) Introduce el primer número");
        int ej12userint2 = sc2.nextInt();
        System.out.println("(Ejercicio 12) Introduce el segundo número");
        int ej12userint3 = sc2.nextInt();
        System.out.println("La suma de los dos números escogidos es " + (ej12userint2 + ej12userint3));
        // Ejercicio 13 //
        Scanner sc3 = new Scanner(System.in);
        System.out.println("(Ejercicio 13) Introduce el primer número con decimales separado por comas");
        double ej12userdouble1 = sc3.nextDouble();
        System.out.println("(Ejercicio 13) Introduce el segundo número con decimales separado por comas");
        double ej12userdouble2 = sc3.nextDouble();
        System.out.println("El resultado de dividir los dos números escogidos es " + (ej12userdouble1 / ej12userdouble2));
        // Ejercicio 14 //
        Scanner sc4 = new Scanner(System.in);
        System.out.println("(Ejercicio 14) Introduce un texto");
        String ej14userstring1 = sc4.nextLine();
        System.out.println("(Ejercicio 14) Introduce un entero");
        int ej14userint4 = sc.nextInt();
        System.out.println("El entero introducido es " + ej14userint4);
        System.out.println("El texto introducido es " + ej14userstring1);
        // Ejercicio 15 //
        Scanner sc5 = new Scanner(System.in);
        System.out.println("(Ejercicio 15) Introduce un carácter");
        char ej15char1 = sc5.next().charAt(0);
        System.out.println("El carácter introducido es " +  ej15char1);
        ej15char1++;
        System.out.println("El siguiente carácter al introducido es " +  (ej15char1));
        ej15char1++;
        System.out.println("El siguiente carácter al anterior es " +  (ej15char1));
        ej15char1++;
        System.out.println("El siguiente carácter al anterior es " +  (ej15char1));
        

        // Funcion Math //
        double numeroAleatorio = Math.random();
        System.out.println("El número aleatorio es " + numeroAleatorio);
        int numeroAleatorio2 = (int) (Math.random()*100);
        System.out.println("El número aleatorio entre 0 y 100 es: " + numeroAleatorio2);
        int numeroAleatorio3 = (int) (Math.random()*(64 - 23) + 23);
        System.out.println("El número aleatorio entre 23 y 64 es: " + numeroAleatorio3);
        int numeroAleatorio4 = (int) (Math.random()*(35 - 12) + 12);
        System.out.println("El número aleatorio entre 12 y 35 es: " + numeroAleatorio4);

    }
}
