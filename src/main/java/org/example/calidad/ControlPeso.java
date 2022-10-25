package org.example.calidad;

public class ControlPeso extends ControlCalidad {
    public ControlPeso() {
        super();
    }

    @Override
    public void validarCalidadProducto(Articulo articulo) {
        if (articulo.getPeso() > 1200 && articulo.getPeso() < 1300 && getSiguienteControl() != null) {
            getSiguienteControl().validarCalidadProducto(articulo);
        } else  {
            System.out.println("Rechazado");
        }
    }
}
