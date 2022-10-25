package org.example.calidad;

public abstract class ControlCalidad {
    ControlCalidad siguienteControl;
    public abstract void validarCalidadProducto(Articulo articulo);

    public void setSiguienteControl(ControlCalidad siguienteControl) {
        this.siguienteControl = siguienteControl;
    }

    public ControlCalidad getSiguienteControl() {
        return siguienteControl;
    }
}
