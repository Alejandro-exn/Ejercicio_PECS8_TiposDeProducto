public class Producto {
    protected String codigo;
    protected String nombre;
    protected double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularCostoAdicional() {
        return 0;
    }

    public double calcularPrecioFinal() {
        return precio + calcularCostoAdicional();
    }

    public String mostrarInformacion() {
        return codigo + " - " + nombre + " - Precio: $" + String.format("%.2f", precio);
    }
}