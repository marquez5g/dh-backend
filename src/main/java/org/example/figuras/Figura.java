package org.example.figuras;

public abstract class Figura {
    private String nombre;

    private String mensaje;
    private float area;
    private float perimetro;

    public Figura(String nombre, String mensaje, float area, float perimetro) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void printFigura() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Mensaje: " + this.mensaje);
        System.out.println("Area: " + this.area);
        System.out.println("Perimetro: " + this.perimetro);
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();
}
