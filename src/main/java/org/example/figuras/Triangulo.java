package org.example.figuras;

public class Triangulo extends Figura{
    private float base;
    private float altura;

    public Triangulo(String nombre, String mensaje, float area, float perimetro, float base, float altura) {
        super(nombre, mensaje, area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.setArea((this.getBase() * this.getAltura()) / 2);
    }

    @Override
    public void calcularPerimetro() {
        this.setPerimetro(this.getBase() * 3);
    }
}
