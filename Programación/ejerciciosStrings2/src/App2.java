public class App2 {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        // Partir una frase en dos. A continuación partir cada una de
        // las dos mitades en otras dos. Mostrar las cuatro partes. (Si
        // en cualquier división el número es impar la segunda mitad
        // tendrá un carácter más). Probarlo con “Esta es la frase que
        // vamos a partir en cuatro”
        String frase = "Esta es la frase que vamos a partir en cuatro";
        int longitud = frase.length();
        int mitad = longitud / 2;
        String primeraMitad = frase.substring(0, mitad);
        String segundaMitad = frase.substring(mitad);
        int longitudPrimeraMitad = primeraMitad.length();
        int mitadPrimeraMitad = longitudPrimeraMitad / 2;
        String primeraPartePrimeraMitad = primeraMitad.substring(0, mitadPrimeraMitad);
        String segundaPartePrimeraMitad = primeraMitad.substring(mitadPrimeraMitad);
        int longitudSegundaMitad = segundaMitad.length();
        int mitadSegundaMitad = longitudSegundaMitad / 2;
        String primeraParteSegundaMitad = segundaMitad.substring(0, mitadSegundaMitad);
        String segundaParteSegundaMitad = segundaMitad.substring(mitadSegundaMitad);
        System.out.println("Primera Mitad: " + primeraMitad);
        System.out.println("Segunda Mitad: " + segundaMitad);
        System.out.println("Primera Parte de la Primera Mitad: " + primeraPartePrimeraMitad);
        System.out.println("Segunda Parte de la Primera Mitad: " + segundaPartePrimeraMitad);
        System.out.println("Primera Parte de la Segunda Mitad: " + primeraParteSegundaMitad);
        System.out.println("Segunda Parte de la Segunda Mitad: " + segundaParteSegundaMitad);
        // Ejercicio 2
        // En cualquier frase sustituir todas las posiciones múltiplos
        // de 3 por ‘#’. Probarlo con “Esta es la frase donde vamos a
        // poner almohadillas”
        String str = "Esta es la frase donde vamos a poner almohadillas";
        String str2 = "";
        int i = 0;
        while (i < str.length()) {
            if (i % 3 == 0)
                str2 += "#";
            else
                str2 += str.charAt(i);
            i++;
        }
        System.out.println(str2);
        // Ejercicio 3
        // Obtener en que posición esta la cuarta ‘a’ en una frase. Si
        // la frase tiene menos de 4 aes tiene que indicarlo. “Probarlo
        // con “Esta es una frase con unas cuantas aes”
        str = "Esta es una frase con unas cuantas aes";
        int a1 = str.indexOf('a');
        boolean flag = false;
        if (a1 != -1) {
            int a2 = str.indexOf('a', a1 + 1);
            if (a2 != -1) {
                int a3 = str.indexOf('a', a2 + 1);
                if (a3 != -1) {
                    int a4 = str.indexOf('a', a3 + 1);
                    if (a4 != -1) {
                        flag = true;
                        System.out.println("La cuarta a del string esta en la posición " + a4);
                    }
                }
            }
        }
        if (flag == false)
            System.out.println("No hay 4 aes en el string");
        // Ejercicio 4
        // En cualquier frase cambiar la primera y la última palabra
        // a mayúsculas. Probarlos con la frase “Esta es la frase donde
        // vamos a hacer los cambios”
        str = "Esta es la frase donde vamos a hacer los cambios";
        String[] partes = str.split((" "));
        String primeraPalabra = partes[0].toUpperCase();
        String ultimaPalabra = partes[partes.length - 1].toUpperCase();
        partes[0] = primeraPalabra;
        partes[partes.length - 1] = ultimaPalabra;
        String newStr = String.join(" ", partes);
        System.out.println(newStr);
        // Ejercicio 5
        // Obtener el número de palabras que hay en cualquier
        // frase. Probarlo con “A ver cuantas palabras hay aquí.”
        str = "      skanfjnsjknfa fkans";
        partes = str.split((" "));
        flag = str.isEmpty();
        int contador = 0;
        if (flag == false) {
            for (i = 0; i < partes.length; i++) {
                if (partes[i].isEmpty() == false) {
                    contador++;
                }
            }
            System.out.println("He encontrado " + contador + " palabras");
        } else
            System.out.println("No he encontrado ninguna palabra :(");
        // Ejercicio 6
        // En cualquier frase sustituir las primeras tres letras ‘a’ por
        // tres asteriscos. Probarlo con la frase “Esta es la frase en la
        // que vamos a probar
        str = "Esta es la frase en la que vamos a probar";
        newStr = "";
        contador = 0;
        
        for (i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' || str.charAt(i) == 'A') && contador < 3) {
                newStr += "*";
                contador++;
            } else {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
        // Ejercicio 7
        // Sustituir en cualquier frase “locomotora” por “máquina”
        // teniendo en cuenta que la palabra locomotora puede tener
        // alguna letra en mayúsculas. Probarlo con “La LOcomotora
        // avanza con paso firme y no hay LOcomoTora que la iguale”.
        str = "La LOcomotora avanza con paso firme y no hay LOcomoTora que la iguale";
        String comparador = "locomotora";
        partes = str.split((" "));
        for (i = 0; i < partes.length; i++) {
            flag = partes[i].equalsIgnoreCase(comparador);
            if (flag == true)
                partes[i] = "maquina";
            System.out.print(partes[i] + " ");
        }
        System.out.println();
        // Ejercicio 8
        // Convertir cualquier palabra con un número impar de
        // caracteres y de más de dos caracteres, en que sea todo con
        // minúsculas, excepto el carácter justo del medio que será con
        // mayúsculas. Probarlo con “TERREMOTO”.
        str = "TERREMOTO";
        int letramedio = str.length() / 2;
        char[] caracteres = str.toCharArray();
        for (i = 0; i < str.length(); i++) {
            if (i == letramedio) {
                caracteres[i] = Character.toUpperCase(caracteres[i]);
            } else {
                caracteres[i] = Character.toLowerCase(caracteres[i]);
            }
        }
        String resultado = new String(caracteres);
        System.out.println(resultado);
        // Ejercicio 9
        // En un String con cualquier numero de letras ‘a’ convertir
        // una en mayúsculas y la siguiente dejarla como está, la
        // siguiente en mayúsculas y la siguiente dejarla… etc…
        // Probarlo con “Esta es una frase con algunas letras a”.
        str = "Esta es una frase con algunas letras a";
        flag = true;
        i = 0;
        char[] caracter = str.toCharArray();
        while (i < caracter.length) {
            if (flag == true) {
                if (caracter[i] == 'a' || caracter[i] == 'A') {
                    flag = false;
                    caracter[i] = Character.toUpperCase(caracter[i]);
                }
            } else if (flag == false) {
                if (caracter[i] == 'a' || caracter[i] == 'A') {
                    flag = true;
                }
            }
            i++;
        }
        resultado = new String(caracter);
        System.out.println(resultado);
        // Ejercicio 10
        // En cualquier frase obtener todas las palabras que
        // contengan alguna ‘e’. Probarlo con la frase “En esta frase hay
        // palabras que tienen la letra a y otras que no”.
        str = "En esta frase hay palabras que tienen la letra a y otras que no";
        contador = 0;
        String palabra[] = str.split(" ");
        for (i = 0; i < palabra.length; i++) {
            if (palabra[i].indexOf('e') != -1 || palabra[i].indexOf('E') != -1)
                contador++;
        }
        System.out.println(contador);
    }
}
