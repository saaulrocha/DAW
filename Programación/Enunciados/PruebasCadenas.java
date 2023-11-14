package cadenas;

import java.util.Scanner;

public class PruebasCadenas {

	public static void main(String[] args) {
		// tipo nombre;
		// tipo nombre = valor;
		String cadena1 = "buenos";
		String cadena2 = "días";

		// concatenar (juntar)
		String cadenaFinal = cadena1 + " " + cadena2;
		System.out.println(cadenaFinal);

		String cadenaFinal2 = cadena1.concat(" ");
		cadenaFinal2 = cadenaFinal2.concat(cadena2);
		System.out.println(cadenaFinal2);

		String cadena = "esto es una cadena de texto";
		// Quiero sustituir 'e' por una 'E'.
		cadenaFinal = cadena.replace('e', 'E');
		System.out.println(cadenaFinal);

		// Saber la longitud de una cadena de texto: .length()
		cadena = "hola";
		int longitud = cadena.length();
		System.out.println(longitud);

		// Moverme con un índice a través de toda la cadena de texto
		cadena = "hola que tal";
		for (int i = 0; i < cadena.length(); i++) {
			// .charAt(índice) -> Accede al caracter que está en la posición indicada
			char caracter = cadena.charAt(i);
			System.out.println(caracter);
		}

		// ¿El String se puede utilizar para números?
		String texto = "456";
		String texto2 = "123";
		String texto3 = texto + texto2;
		System.out.println(texto3);

		// Conversión de String a número
		int num = Integer.parseInt(texto);

		// Conversión de número a String
		texto = String.valueOf(num);
		texto = "" + num;

		System.out.println(num * 2);
		System.out.println(texto);

		// Recorrer cadena de texto caracter a caracter: .length() y .charAt(int)
		texto = "esto es una cAdena de texto";
		for (int i = 0; i < texto.length(); i++) {
			// Acceder a cada uno de los caracteres: .charAt
			System.out.println(texto.charAt(i) + " ");
		}

		// Cuenta el número de 'a' que tiene la cadena
		int contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			// Si el caracter de la posición i es a, aumento en 1 un contador
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
				contador++;
			}
		}
		System.out.println("El número de 'a' es: " + contador);

		texto = "esto es una cAdena de texto";
		String textoMayus = texto.toUpperCase();
		contador = 0;
		for (int i = 0; i < textoMayus.length(); i++) {
			// Si el caracter de la posición i es a, aumento en 1 un contador
			if (textoMayus.charAt(i) == 'A') {
				contador++;
			}
		}

		texto = "esto es una cAdena de texto";
		texto = texto.toUpperCase(); // ->"ESTO ES UNA CADENA DE TEXTO"
		contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			// Si el caracter de la posición i es a, aumento en 1 un contador
			if (texto.charAt(i) == 'E') {
				contador++;
			}
		}
		System.out.println(contador);

		texto = "HOLA que3 T7AL";
		contador = 0;
		// Contar el número de letras mayúsculas
		for (int i = 0; i < texto.length(); i++) {
//			if (texto.charAt(i) >= 65 && texto.charAt(i) <= 90) {
//				contador++;
//			}
			// Sin la tabla ASCII:
			if (texto.charAt(i) >= '0' && texto.charAt(i) <= '9') {
				contador++;
			}
		}
		System.out.println(contador);

		// Encontrar un caracter dentro de una cadena: .indexOf()
		texto = "buenos días señora";
		int indice = texto.indexOf('s');
		System.out.println("La s está en la posición " + indice); // Devuelve la primera ocurrencia
		indice = texto.indexOf('z');
		System.out.println("La z está en la posición " + indice); // Si no lo encuentra: -1
		indice = texto.indexOf('s', 6);
		System.out.println("La segunda s está en la posición " + indice);

		// Dime todas las posiciones de la 's' utilizando solamente .indexOf()

		int index = 0;

		texto = "buenos días señora";
		while (index != -1) {
			index = texto.indexOf('s', index + 1);
			if (index > 0) {
				System.out.println(index);
			}
		}

		// Comprobar si una cadena está vacía
		texto = "";
		if (texto.length() == 0) {
			System.out.println("La cadena está vacía");
		}
		// Otra forma: .isEmpty
		if (texto.isEmpty()) {
			System.out.println("La cadena está vacía");
		}

		// Para obtener datos a través de consola: Scanner
//		System.out.println("Introduce una cadena de texto: ");
//		Scanner sc = new Scanner(System.in);
//
//		String leido = sc.nextLine();
//		System.out.println("Tu texto tiene una longitud de " + leido.length());
//
//		if (leido == "hola") {
//			System.out.println("== Has introducido hola");
//		} else {
//			System.out.println("== NO has introducido hola");
//		}
//
//		String prueba1 = "prueba";
//		String prueba2 = "prueba";
//		if (prueba1 == prueba2) { // Solo funciona si están declaradas e inicializadas en el mismo contexto
//			System.out.println("Sí");
//		} else {
//			System.out.println("No");
//		}
//
//		// CONSEJO: nunca utilizar == para comparar Strings
//		if (leido.equals("hola")) {
//			System.out.println("equals: Has introducido hola");
//		} else {
//			System.out.println("equals: NO has introducido hola");
//		}
//
//		if (leido.equalsIgnoreCase("hola")) {
//			System.out.println("equalsIgnoreCase: Has introducido hola");
//		} else {
//			System.out.println("equalsIgnoreCase: NO has introducido hola");
//		}
//
//		// Scanner:
//		int numero = sc.nextInt();
//		System.out.println("El número multiplicado por 2 es " + numero * 2);
//		double decimal = sc.nextDouble();
//		System.out.println("El número dividido entre 5 es " + decimal / 5);
//		String linea = sc.nextLine();
//		System.out.println("Has introducido este texto: ");

		System.out.println("--FIN--");

//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("Introduce un número:");
//		int n = sc2.nextInt();
//		System.out.println("El número x 2 es " + n * 2);
//		System.out.println("Introduce un text:");
//		String t = sc2.nextLine();
//		System.out.println("El texto es " + t + ". Y su longitud es: " + t.length());
		
//		Scanner scNumeros = new Scanner(System.in);
//		Scanner scTexto = new Scanner(System.in);
//		System.out.println("Introduce un número:");
//		int n = scNumeros.nextInt();
//		System.out.println("El número x 2 es " + n * 2);
//		System.out.println("Introduce un text:");
//		String t = scTexto.nextLine();
//		System.out.println("El texto es " + t + ". Y su longitud es: " + t.length());
//		System.out.println("Introduce otro número decimal:");
//		double d = scNumeros.nextDouble();
//		System.out.println("El número / 2 es " + d / 2);

		
		System.err.println("Esto es la salida de error");
		
		//Método .trim(): quita espacios sobrantes del principio y del final
		String user = "   sete       ";
		String userGuardadoBD = "sete";
		user = user.trim();
		if (user.equals(userGuardadoBD)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		//También se pueden reemplazar cadenas
		String t = "esto es una cadena";
		t = t.replace('u', '7');
		t = t.replaceAll("es", "ES");
		System.out.println(t);
		
		//Substring: devuelve un trozo de la cadena.
		String trozo = t.substring(5);
		System.out.println(trozo);
		trozo = t.substring(5, 10);
		System.out.println(trozo);
		
		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
		
//		
//		
//		
//		
//		
//		
//		
//		
//		
	}

}
