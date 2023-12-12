package trabajo.pkg1.pkg1;

import trabajo.pkg1.pkg1.Ropa;
import java.util.ArrayList;

public class Inventario {

    private final ArrayList<Ropa> ropas;
    private double ganancias;

    public Inventario() {
        this.ropas = new ArrayList<>();
        this.ganancias = 0.0;
    }

    public void agregarRopa(Ropa ropa) {
        ropas.add(ropa);
    }

    public void venderRopa(String tipo, String talla, int cantidad) {
        Ropa ropaAVender = buscarRopa(tipo, talla);
        if (ropaAVender != null && ropaAVender.getCantidad() >= cantidad) {
            ropaAVender.setCantidad(ropaAVender.getCantidad() - cantidad);
            double precioVenta = ropaAVender.getPrecio() * cantidad;
            ganancias += precioVenta;
            System.out.println("Venta exitosa. Se vendieron " + cantidad + " unidades de " + ropaAVender.getTipo() + ". Total a pagar: " + precioVenta);
        } else {
            System.out.println("No hay suficiente stock de esa ropa.");
        }
    }

    public double getGanancias() {
        return ganancias;
    }
    
    public void mostrarInventario() {
        System.out.println("Inventario de ropa: ");
        for (Ropa ropa : ropas) {
            ropa.mostrarInformacion();
        }
    }

    private Ropa buscarRopa(String tipo, String talla) {
        for (Ropa ropa : ropas) {
            if (ropa.getTipo().equalsIgnoreCase(tipo) && ropa.getTalla().equalsIgnoreCase(talla)) {
                return ropa;
            }
        }
        return null;
    }
}