package org.example.flyweight;

public class Main {
    public static void main(String[] args) {

       /* Arbol arbolFrutal = ArbolFlyweightFactory.crearArbol("Frutal");
        arbolFrutal.setAlto(10);
        arbolFrutal.setColor("Verde");
        arbolFrutal.setHorizontal(10);
        System.out.println(arbolFrutal);
        Arbol arbolFrutal2 = ArbolFlyweightFactory.crearArbol("Frutal");
        arbolFrutal2.setAlto(30);
        arbolFrutal2.setColor("Morado");
        arbolFrutal2.setHorizontal(890);
        System.out.println(arbolFrutal2);
        Arbol arbolFrutal3 = ArbolFlyweightFactory.crearArbol("Frutal");
        arbolFrutal3.setAlto(60);
        arbolFrutal3.setColor("Azul");
        arbolFrutal3.setHorizontal(34);
        System.out.println(arbolFrutal3);
        Arbol arbolFrutal4 = ArbolFlyweightFactory.crearArbol("Frutal");
        arbolFrutal4.setAlto(90);
        arbolFrutal4.setColor("Negro");
        arbolFrutal4.setHorizontal(25);
        System.out.println(arbolFrutal4);
        Arbol arbolFloral = ArbolFlyweightFactory.crearArbol("Floral");
        arbolFloral.setAlto(30);
        arbolFloral.setColor("Amarillo");
        arbolFloral.setHorizontal(30);
        System.out.println(arbolFloral);*/

        for (int i = 0; i < 1000000; i++) {
            Arbol arbol = ArbolFlyweightFactory.crearArbol("Frutal");
            arbol.setAlto(10);
            arbol.setHorizontal(10);
            if (i < 500000){
                arbol.setColor("Rojo");
            } else {
                arbol.setColor("Verde");
            }
            System.out.println(arbol);
        }
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}
