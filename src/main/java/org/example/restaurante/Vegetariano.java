package org.example.restaurante;

public class Vegetariano extends Menu{
    private Boolean tieneEspecias;
    private Integer cantidadSalsas;

    public Vegetariano(float precioBase, Boolean tieneEspecias, Integer cantidadSalsas) {
        super(precioBase);
        this.tieneEspecias = tieneEspecias;
        this.cantidadSalsas = cantidadSalsas;
        setRecargo(2.0f);
    }

    public Integer getCantidadSalsas() {
        return cantidadSalsas;
    }

    public void setCantidadSalsas(Integer cantidadSalsas) {
        this.cantidadSalsas = cantidadSalsas;
    }

    public Boolean getTieneEspecias() {
        return tieneEspecias;
    }

    public void setTieneEspecias(Boolean tieneEspecias) {
        this.tieneEspecias = tieneEspecias;
    }

    @Override
    public float calcularPrecioFinal() {
        float precio = getPrecioBase() + (2 * getCantidadSalsas());
        if (getTieneEspecias()) {
            precio += (getPrecioBase() * 0.01f);
        }
        return precio;
    }

    @Override
    public void armarMenu() {
        System.out.println("Menu Vegetariano");
        System.out.println("Precio Base: " + super.getPrecioBase());
        System.out.println("¿Incluye especias?: " + getTieneEspecias());
        System.out.println("Recargo por salsa: " + super.getRecargo());
        System.out.println("Cantidad de salsas: " + getCantidadSalsas());
        System.out.println("Precio Final: " + calcularPrecioFinal());
    }
}
