package org.example.calidad;

public class ControlLote extends ControlCalidad {
    public ControlLote() {
        super();
    }

    @Override
    public void validarCalidadProducto(Articulo articulo) {
        if (articulo.getLote() > 1000 && articulo.getLote() < 2000 && getSiguienteControl() != null) {
                getSiguienteControl().validarCalidadProducto(articulo);
        } else {
            System.out.println("Rechazo");
        }
    }
}
