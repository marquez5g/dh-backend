package org.example.calidad;

public class Main {
    public static void main(String[] args) {
        ControlCalidad controlLote = new ControlLote();
        ControlCalidad controlPeso = new ControlPeso();
        ControlCalidad controlEnvase = new ControlEnvase();
        controlLote.setSiguienteControl(controlPeso);
        controlPeso.setSiguienteControl(controlEnvase);
        Articulo articulo = new Articulo("Coca Cola", 1500, 1250, "sano");
        Articulo articulo2 = new Articulo("Coca Cola", 1500, 1250, "dañado");
        controlPeso.validarCalidadProducto(articulo);
        controlPeso.validarCalidadProducto(articulo2);
    }
}
