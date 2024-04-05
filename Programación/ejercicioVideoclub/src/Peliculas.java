public class Peliculas extends Producto {
    private int estado;
    private int duracionAlquiler;
    static int codigoAleatorio = 9999;

    public Peliculas(int codigo, String nombre, int estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return nombre;
    }

    public void setTitulo(String titulo) {
        this.nombre = titulo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDuracionAlquiler() {
        return duracionAlquiler;
    }

    public void setDuracionAlquiler(int duracionAlquiler) {
        this.duracionAlquiler = duracionAlquiler;
    }

    public static int asignarCodigo() {
        codigoAleatorio++;
        return codigoAleatorio;
    }

    public double asignarPrecio() {
        switch (estado) {
            case 0:
                precio = 3;
                duracionAlquiler = 1;
                break;
            case 1:
                precio = 2;
                duracionAlquiler = 2;
                break;
            case 2:
                precio = 1;
                duracionAlquiler = 4;
                break;
            default:
                System.out.println("No existe ese estado");
                precio = 0;
                break;
        }
        return precio;
    }
}