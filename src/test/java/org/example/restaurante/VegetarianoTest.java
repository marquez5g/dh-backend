package org.example.restaurante;

import static org.junit.jupiter.api.Assertions.*;

class VegetarianoTest {

    @org.junit.jupiter.api.Test
    void calcularPrecioFinal() {
        Menu menuVegetariano = new Vegetariano(100.0f, true, 2);
        assertEquals(105.0f, menuVegetariano.calcularPrecioFinal());
    }
}