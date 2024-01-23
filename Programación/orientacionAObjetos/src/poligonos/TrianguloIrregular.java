package poligonos;

public class TrianguloIrregular {
    private int lado1;
    private int lado2;
    private int lado3;
    public TrianguloIrregular(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public TrianguloIrregular(int lados) {
        this.lado1 = lados;
        this.lado2 = lados;
        this.lado3 = lados;
    }
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        
    }
}

