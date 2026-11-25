import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto f1 = new ProductoFisico("F01", "Peluche oso", 20.00, 0.8);
        Producto f2 = new ProductoFisico("F02", "Cojín decorativo", 15.00, 1.2);
        Producto d1 = new ProductoDigital("D01", "Curso de diseño", 30.00, 500);
        Producto d2 = new ProductoDigital("D02", "Ebook de ventas", 12.00, 15);
        Producto s1 = new Servicio("S01", "Asesoría de marca", 50.00, 3);
        Producto s2 = new Servicio("S02", "Instalación de tienda online", 80.00, 5);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(f1);
        productos.add(f2);
        productos.add(d1);
        productos.add(d2);
        productos.add(s1);
        productos.add(s2);

        System.out.println("=== CATÁLOGO (mostrarInformacion polimórfico) ===");
        for (Producto p : productos) {
            System.out.println(p.mostrarInformacion());
        }
        System.out.println();

        System.out.println("=== COSTOS ADICIONALES ===");
        for (Producto p : productos) {
            System.out.println(p.getNombre() + ": $" + String.format("%.2f", p.calcularCostoAdicional()));
        }
        System.out.println();

        System.out.println("=== MISMO MÉTODO, VERSIONES DISTINTAS ===");
        Producto a = new ProductoFisico("X1", "Artículo A", 40.00, 2);
        Producto b = new ProductoDigital("X2", "Artículo B", 40.00, 100);
        Producto c = new Servicio("X3", "Artículo C", 40.00, 2);
        System.out.println("Físico (2 kg):     costo adicional $" + String.format("%.2f", a.calcularCostoAdicional()));
        System.out.println("Digital (100 MB):  costo adicional $" + String.format("%.2f", b.calcularCostoAdicional()));
        System.out.println("Servicio (2 h):    costo adicional $" + String.format("%.2f", c.calcularCostoAdicional()));
        System.out.println();

        System.out.println("=== DESAFÍO: SUSCRIPCIÓN ===");
        Producto sus = new Suscripcion("U01", "Club de peluches", 9.99, 12);
        productos.add(sus);
        for (Producto p : productos) {
            System.out.println(p.mostrarInformacion());
        }
    }
}