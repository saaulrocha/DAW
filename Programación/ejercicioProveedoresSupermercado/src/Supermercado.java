public class Supermercado {

    private String nombre;
    private Productos[] productos;
    private int[] unidades;
    private double[] precios;
    private int contador;
    private double precioTotal;

    public Supermercado(String nombre) {
        this.nombre = nombre;
        this.productos = new Productos[10];
        this.unidades = new int[10];
        this.precios = new double[10];
        this.contador = 0;
        this.precioTotal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Productos[] getProductos() {
        return productos;
    }

    public void setProductos(Productos[] productos) {
        this.productos = productos;
    }

    public int[] getUnidades() {
        return unidades;
    }

    public void setUnidades(int[] unidades) {
        this.unidades = unidades;
    }

    public double[] getPrecios() {
        return precios;
    }

    public void setPrecios(double[] precios) {
        this.precios = precios;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void addProducto(Productos producto, int unidades, double precio) {
        this.productos[contador] = producto;
        this.unidades[contador] = unidades;
        this.precios[contador] = precio;
        this.contador++;
        this.precioTotal += precio;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos y precio total de " + nombre + ":\n");
        for (int i = 0; i < contador; i++) {
            sb.append(productos[i].getNombre() + ", " + unidades[i] + " unidades, " + precios[i] + " euros\n");
        }
        sb.append("El precio total de " + nombre + " es: " + precioTotal + " euros\n");
        return sb.toString();
    }
}