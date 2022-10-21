package org.example.restaurante;

public class Infantil extends Menu{
    private Integer cantidadJuguetes;

    public Infantil(float precioBase, Integer cantidadJuguetes) {
        super(precioBase);
        this.cantidadJuguetes = cantidadJuguetes;
        setRecargo(3.0f);
    }

    public Integer getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public void setCantidadJuguetes(Integer cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    public float calcularPrecioFinal() {
        return super.getPrecioBase() + getCantidadJuguetes() * super.getRecargo();
    }

    @Override
    public void armarMenu() {
        System.out.println("Menu Infantil");
        System.out.println("Precio Base: " + super.getPrecioBase());
        System.out.println("Recargo por juguete: " + super.getRecargo());
        System.out.println("Cantidad de juguetes: " + getCantidadJuguetes());
        System.out.println("Precio Final: " + calcularPrecioFinal());
    }
}
