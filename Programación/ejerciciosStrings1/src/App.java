public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // - Obtener la suma de la longitud de estas tres palabras:
        // “locomotora”, “camión”, “coche”.
        String str1 = "locomotora";
        String str2 = "camión";
        String str3 = "coche";
        int contador = 0;
        contador = str1.length() + str2.length() + str3.length();
        System.out.println("La suma de la longitud de locomotora, camión y coche es " + contador);
        // Ejercicio 2
        // Obtener que tres caracteres hay en las posiciones 0, 13 y
        // 18 de una frase. Probarlo con “En un lugar de la Mancha” 
        String str = "En un lugar de la Mancha";
        System.out.println("En la posición 0 esta el carácter " + str.charAt(0));
        System.out.println("En la posición 13 esta el carácter " + str.charAt(13));
        System.out.println("En la posición 18 esta el carácter " + str.charAt(18));
        // Ejercicio 3
        // Obtener la subcadena de la posición 4 a la 8 en una frase.
        // Probarlo con “Ahora estamos en este ejercicio”. 
        str = "Ahora estamos en este ejercicio";
        System.out.println("La subcadena de la posición 4 a la 8 es " + str.substring(4, 8));
        // Ejercicio 4
        // Crear una cadena con el nombre a y el valor “mesa”. Crear
        // el carácter (char) con el nombre b y el valor ‘s’. Comprobar
        // que si hacemos a = a+b, obtenemos la cadena a = “mesas”. Es
        // decir, que podemos concatenar una cadena con un char
        String a = "mesa";
        char b = 's';
        a = a + b;
        System.out.println("Si se puede concatenar un string con un char y el resultado de mesa + s es " + a);
        // Ejercicio 5
        // Coger cualquier frase y hacer un programa que muestre
        // línea por línea cada letra de la frase exceptuando los
        // espacios. Probarlo con “Esta es la frase del ejercicio 4”
        int i = 0;
        str = "Esta es la frase del ejercicio 4";
        while(i < str.length())
        {
            if (str.charAt(i) != 32)
                System.out.println(str.charAt(i));
            i++;
        }
        // Ejercicio 6
        // Crear cuatro Strings con los valores “uno” ,“dos”, “tres” y
        // “cuatro”. A partir de estos Strings obtener un quinto que
        // contenga lo siguiente “uno, dos, tres y cuatro”.ç
        String uno = "uno";
        String dos = "dos";
        String tres = "tres";
        String cuatro = "cuatro";
        String cinco = uno + ", " + dos + ", " + tres + " y " + cuatro;
        System.out.println("Mi quinto string contiene " +  cinco);
        // Ejercicio 7
        // En cualquier frase obtener en que posición aparece por
        // primera vez un espacio. Y después del primer espacio en que
        // posición aparece el tercer espacio. Probarlo con “Esta es una
        // frase con varios espacios”
        // Encontrar la posición del primer espacio
        String frase = "Esta es una frase con varios espacios";
        int primerEspacio = frase.indexOf(' ');
        if (primerEspacio != -1) {
            System.out.println("La posición del primer espacio es: " + primerEspacio);
            int segundoEspacio = frase.indexOf(' ', primerEspacio + 1);
            if (segundoEspacio != -1) {
                    int tercerEspacio = frase.indexOf(' ', segundoEspacio + 1);
                    if (tercerEspacio != -1) {
                        System.out.println("La posición del tercer espacio después del primer espacio es: " + tercerEspacio);
                }
            }
        }
        // Ejercicio 8
        // Hacer un programa que cuente el número de veces que
        // aparece la letra ‘e’ (mayúscula o minúscula). Probarlo con la
        // frase “Este ejercicio es el primero de cuenta de letras
        contador = 0;
        str = "Este ejercicio es el primero de cuenta de letras";
        i = 0;
        char e = 'e';
        str = str.toLowerCase();
        while (i < str.length())
        {
            if (str.charAt(i) == e)
                contador++;
            i++;
        }
        System.out.println(contador);
        // Ejercicio 9
        // Hacer un programa que con cualquier frase diga si tiene
        // un numero par o impar de caracteres. Si tiene un numero
        // impar ha de decir que carácter está justo en la mitad.
        // Probarlo con la frase “Esta frase es de prueba para el
        // ejercicio nueve”
        str = "Esta frase es de prueba para el ejercicio nueve";
        int cuentaLetras = str.length();
        if (cuentaLetras % 2 == 0)
            System.out.println("El número de carácteres es par y es " + cuentaLetras);
        else
           System.out.println("El número de carácteres es " + cuentaLetras + " y el carácter del medio es " + "(" + str.charAt(cuentaLetras / 2) + ")");
        // Ejercicio 10
        // De cualquier palabra con un número par de letras,
        // conseguir que la primera mitad este en mayúsculas y la
        // segunda mitad en minúsculas. Probarlo con la palabra
        // “LoCoMoToRa”.
        str = "LoCoMoToRa";
        cuentaLetras = str.length();
        str2 = str.substring((cuentaLetras / 2));
        str = str.substring(0, (cuentaLetras / 2));
        str = str.toUpperCase();
        str2 = str2.toLowerCase();
        System.out.println("La primera mitad del string en mayúsculas es " + str);
        System.out.println("La segunda mitad del string en minúsculas es " + str2);
    }
}

