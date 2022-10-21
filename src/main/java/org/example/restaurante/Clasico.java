package org.example.restaurante;

public class Clasico extends Menu{

    public Clasico(float precioBase) {
        super(precioBase);
    }

    @Override
    public float calcularPrecioFinal() {
        return getPrecioBase();
    }

    @Override
    public void armarMenu() {
        System.out.println("Menu Clasico");
        System.out.println("Precio Final: " + calcularPrecioFinal());
    }
}
