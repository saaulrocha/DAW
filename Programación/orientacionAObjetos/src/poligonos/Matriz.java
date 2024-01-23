package poligonos;

public class Matriz {
    private int numFilas;
    private int numColumnas;
    private char charRelleno;

    public int getNumFilas() {
        return numFilas;
    }
    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }
    public int getNumColumnas() {
        return numColumnas;
    }
    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }
    public char getCharRelleno() {
        return charRelleno;
    }
    public void setCharRelleno(char charRelleno) {
        this.charRelleno = charRelleno;
    }
    public Matriz() {
    }
    public Matriz(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
    }
    public Matriz(int numFilas, int numColumnas, char charRelleno) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.charRelleno = charRelleno;
    }

    public char[][] pintarMatriz() {
        char[][] cuadradoMatriz = new char[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                cuadradoMatriz[i][j] = charRelleno;
            }
        }
        return cuadradoMatriz;
    }
    public void elegirPunto(int fila, int col) {
        elegirPunto(fila, col, 'O');
        }
    public void elegirPunto(int fila, int col, char simbolo) {
            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {
                    if (i == fila && j == col) {
                        System.out.print(simbolo);
                    }
                    else
                      System.out.print(charRelleno);
            }
             System.out.println();
        }
    }
        
    }

