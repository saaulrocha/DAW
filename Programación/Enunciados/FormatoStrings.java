package cadenas;

import java.util.Scanner;

public class FormatoStrings {

	public static void main(String[] args) {
		System.out.println("Salida estándar");
		System.err.println("Salida de error");

		// Formato: System.out.printf
		double numero = 123.456789;
		double numero2 = 5.97241;

		System.out.printf("%f %n", numero);

		// Imprimirlo con 2 decimales:
		System.out.printf("%.2f %n", numero);

		// Imprimirlo con 3 decimales y un texto entre medias:
		System.out.printf("El número con 3 decimales es %.3f.%n", numero);

		// Imprimirlo para que sea un total de 10 cifras y 3 decimales:
		System.out.printf("%10.3f %n", numero); // Rellena con espacios
		System.out.printf("%010.3f %n", numero2); // Rellena con ceros

		// Números enteros: %d
		int n = 12;
		int m = 123;
		System.out.printf("%5d%n", n);
		System.out.printf("%05d%n", n);
		System.out.printf("%5d%n", m);

		System.out.printf("%o%n", n);
		System.out.printf("%X%n", n);
		System.out.printf("%X%n", m);

		System.out.printf("%c%n", m); // Imprime el caracter ASCII correspondiente el número puesto

		int suma = n + m;
		System.out.printf("%d + %d = %d%n", n, m, suma);
		System.out.println(n + " + " + m + " = " + suma);

		double x = 123.5587685456;
		double y = 99.15458775;
		double z = x * y;
		System.out.printf("la suma de %.2f más %.2f es igual a %.2f%n", x, y, z);
		System.out.printf("%e%n", x);
		z = 1597.3; // Notación científica: 1.597 x 10^3
		System.out.printf("%e%n", z);
		z = 0.00083; // Notación científica: 8.3 x 10^-4
		System.out.printf("%e%n", z);

		// Otra forma OIPCIONAL de hacer lo mismo (guardando el formato en una variable
		// String):
		String numeroFormateado = String.format("%.3e", y);
		System.out.println(numeroFormateado);

		String sumaFormateada = String.format("la suma de %.2f más %.2f es igual a %.2f%n", x, y, z);
		System.out.println(sumaFormateada);

		char saltoDeLinea = '\n';
		char tabulador = '\t';
		System.out.println("Esto es una línea\nEsto es otra línea\nSeparado\tpor\ttabulaciones");
		System.out.println("Nombre\tApell\tNota");
		System.out.println("Alba\tRuiz\t9.64");
		System.out.println("Luz\tGarcía\t8.24");
		

		
		
		
		//Los Strings se comparan con .equals!!!
		String d = "hola";
		String f = "hola";
		if (d == f) {
			System.out.println("1. Sí son iguales");
		} else {
			System.out.println("1. No son iguales");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce hola");
		String g = sc.nextLine();
		if (g == f) {
			System.out.println("2. Sí son iguales");
		} else {
			System.out.println("2. No son iguales");
		}
		if (g.equals(f)) {
			System.out.println("3. Sí son iguales");
		} else {
			System.out.println("3. No son iguales");
		}
		
		System.out.println("FIN");

	}

}
