package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tabalaMultiplicarTest {

    @Test
    void validarTabla() {

        assertAll(
                () -> assertTrue(tabalaMultiplicar.validarTabla(7)),
                () -> assertTrue(tabalaMultiplicar.validarTabla(5)),
                () -> assertFalse(tabalaMultiplicar.validarTabla(-3)),
                () -> assertFalse(tabalaMultiplicar.validarTabla(15))
        );

    }

    @Test
    void calcularCuadrado() {

        assertAll(
                () -> assertEquals(64, tabalaMultiplicar.calcularCuadrado(8)),
                () -> assertEquals(9, tabalaMultiplicar.calcularCuadrado(3))
        );

    }
}