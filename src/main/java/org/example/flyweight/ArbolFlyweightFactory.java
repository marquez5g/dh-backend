package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArbolFlyweightFactory {
    private static final Map<String, Arbol> arboles = new HashMap<>(); //{}

    public static Arbol crearArbol(String tipo) {
        Arbol arbol = arboles.get(tipo);
        if (arbol == null) {
            arbol = new Arbol(tipo);
            arboles.put(tipo, arbol);
        }
        return arbol;
    }
}
