package org.example.calidad;

public class ControlEnvase extends ControlCalidad {
    public ControlEnvase() {
        super();
    }

    @Override
    public void validarCalidadProducto(Articulo articulo) {
        if (articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Rechazado");
        }
    }
}
