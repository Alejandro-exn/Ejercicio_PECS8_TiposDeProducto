public class ProductoDigital extends Producto {
    private double tamanoMB;

    public ProductoDigital(String codigo, String nombre, double precio, double tamanoMB) {
        super(codigo, nombre, precio);
        this.tamanoMB = tamanoMB;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    @Override
    public double calcularCostoAdicional() {
        return tamanoMB * 0.02;
    }

    @Override
    public String mostrarInformacion() {
        return "[Digital] " + super.mostrarInformacion()
                + " - Tamaño: " + tamanoMB + " MB"
                + " - Descarga: $" + String.format("%.2f", calcularCostoAdicional())
                + " - Final: $" + String.format("%.2f", calcularPrecioFinal());
    }
}