package org.example.restaurante;

public abstract class Menu {
    private float precioBase;
    private float precioFinal;
    private float recargo;

    public Menu(float precioBase) {
        this.precioBase = precioBase;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public float getRecargo() {
        return recargo;
    }

    public void setRecargo(float recargo) {
        this.recargo = recargo;
    }

    public abstract float calcularPrecioFinal();

    public abstract void armarMenu();
}
