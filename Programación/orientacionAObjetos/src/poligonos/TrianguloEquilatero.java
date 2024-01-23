package poligonos;

public class TrianguloEquilatero {
    private int lado;
    private String color;
    
    public double calcularArea() {
		double area = this.lado * this.lado * Math.sqrt(3) / 4;
		//double area = Math.pow(this.lado, 2) * Math.sqrt(3) / 4; Alternativa
		return area;
	}

	public int calcularPerimetro() {
		int perimetro = lado * 3;
		return perimetro;
	}
}
