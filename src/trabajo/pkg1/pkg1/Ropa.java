package trabajo.pkg1.pkg1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Ropa {
    

    private String talla;
    private int cantidad;
    private double precio;
    private String tipo;

    // Constantes para tipos de ropa
    public static final String TIPO_CAMISA = "Camisa";
    public static final String TIPO_PANTALON = "Pantalón";
    public static final String TIPO_ZAPATO = "Zapato";

    public Ropa(String talla, String tipo, int cantidad, double precio) {
        this.talla = talla;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo de ropa: " + tipo);
        System.out.println("Talla: " + talla);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
        System.out.println("--------------------");
    }
}

