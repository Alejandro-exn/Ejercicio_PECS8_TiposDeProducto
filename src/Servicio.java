public class Servicio extends Producto {
    private int horas;

    public Servicio(String codigo, String nombre, double precio, int horas) {
        super(codigo, nombre, precio);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    @Override
    public double calcularCostoAdicional() {
        return horas * 10.0;
    }

    @Override
    public String mostrarInformacion() {
        return "[Servicio] " + super.mostrarInformacion()
                + " - Horas: " + horas
                + " - Mano de obra: $" + String.format("%.2f", calcularCostoAdicional())
                + " - Final: $" + String.format("%.2f", calcularPrecioFinal());
    }
}