package org.example.restaurante;

public class Main {
    public static void main(String[] args) {
        Menu menuInfantil = new Infantil(100.0f, 2);
        Menu menuClasico = new Clasico(100.0f);
        Menu menuVegetariano = new Vegetariano(100.0f, true, 2);
        menuInfantil.armarMenu();
        menuClasico.armarMenu();
        menuVegetariano.armarMenu();
    }
}
