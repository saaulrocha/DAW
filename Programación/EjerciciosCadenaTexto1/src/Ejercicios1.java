public class Ejercicios1 {
    public static void main(String[] args) throws Exception {
        // Convertir string a int
        // int long1 = 342432342;
        // String texto = String.valueOf(long1);
        // System.out.println(texto);
        // Acceder carácter por índice;
        // texto.length() < longitud del texto
        // .charAt(i) < Acceder a valor de string por índice
        // strchr en c = string.indexof (Devuelve -1 si no lo encuentra y si lo encuentra devuelve el índice donde lo ha encontrado)
        String texto = "sssssssssfjnbabfhbahs";
        int indice = texto.indexOf('s');
        while (indice != -1) {
            System.out.println(indice);
            indice = texto.indexOf('s', indice + 1);
        }
    }
}
