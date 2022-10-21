package org.example.figuras;

public class Circulo extends Figura{
    private float radio;

    public Circulo(String nombre, String mensaje, float area, float perimetro, float radio) {
        super(nombre, mensaje, area, perimetro);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        this.setArea((float) (Math.PI * Math.pow(this.getRadio(), 2)));
    }

    @Override
    public void calcularPerimetro() {
        this.setPerimetro((float) (2 * Math.PI * this.getRadio()));
    }
}
