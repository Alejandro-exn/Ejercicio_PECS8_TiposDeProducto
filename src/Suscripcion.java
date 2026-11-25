public class Suscripcion extends Producto {
    private int meses;

    public Suscripcion(String codigo, String nombre, double precio, int meses) {
        super(codigo, nombre, precio);
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }

    @Override
    public double calcularCostoAdicional() {
        return meses * 1.00;
    }

    @Override
    public String mostrarInformacion() {
        return "[Suscripción] " + super.mostrarInformacion()
                + " - Meses: " + meses
                + " - Plataforma: $" + String.format("%.2f", calcularCostoAdicional())
                + " - Final: $" + String.format("%.2f", calcularPrecioFinal());
    }
}