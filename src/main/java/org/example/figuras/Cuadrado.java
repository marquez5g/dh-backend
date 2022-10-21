package org.example.figuras;

public class Cuadrado extends Figura{
    private float lado;

    public Cuadrado(float lado) {
        super("Cuadrado", "Es un cuadrado", 0, 0);
        this.lado = lado;
    }

    public Cuadrado(String nombre, String mensaje, float area, float perimetro, float lado) {
        super(nombre, mensaje, area, perimetro);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        if (this.getLado() > 0) {
            this.setArea(this.getLado() * this.getLado());
        } else {
            this.setMensaje("El lado debe ser mayor a 0");
            //this.setArea(0);
        }
    }

    @Override
    public void calcularPerimetro() {
        this.setPerimetro(this.getLado() * 4);
    }
}
