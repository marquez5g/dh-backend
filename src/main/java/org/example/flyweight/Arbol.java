package org.example.flyweight;

public class Arbol {
    private final String tipo;
    private int alto;
    private String color;
    private int horizontal;

    public Arbol(String tipo) {
        this.tipo = tipo;
        System.out.println("Creando un arbol de tipo: " + tipo);
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "tipo='" + tipo + '\'' +
                ", alto=" + alto +
                ", color='" + color + '\'' +
                ", horizontal=" + horizontal +
                '}';
    }
}
