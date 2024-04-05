public class Cd extends Producto {
    private String autor;
    static int codigoAleatorio = 19999;

    public Cd(int codigo, String nombre, String autor, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static int asignarCodigo() {
        codigoAleatorio++;
        return codigoAleatorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
