package calculadoratest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import calculadora.Calculadora;

class CalculadoraTest {
    
    @BeforeAll
    static void iniciarPruebas() {
        System.out.println("Iniciando pruebas de la Calculadora...");
    }

    @AfterAll
    static void finalizarPruebas() {
        System.out.println("Todas las pruebas han finalizado.");
    }

    @Test
    void pru_1_suma_ValoresPositivos() {
        assertEquals(10, Calculadora.suma(7, 3), "Error en la suma de valores positivos");
    }

    @Test
    void pru_2_suma_ValoresNegativos() {
        assertEquals(-5, Calculadora.suma(-2, -3), "Error en la suma de valores negativos");
    }

    @Test
    void pru_3_resta_ValoresPositivos() {
        assertEquals(4, Calculadora.resta(7, 3), "Error en la resta de valores positivos");
    }

    @Test
    void pru_4_resta_ValoresNegativos() {
        assertEquals(1, Calculadora.resta(-2, -3), "Error en la resta de valores negativos");
    }

    @Test
    void pru_5_multiplicacion_Cero() {
        assertEquals(0, Calculadora.multiplica(0, 5), "Error en la multiplicación por cero");
    }

    @Test
    void pru_6_division_ValoresPositivos() {
        assertEquals(2, Calculadora.divide(10, 5), "Error en la división de valores positivos");
    }

    @Test
    void pru_7_division_EntreCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Calculadora.divide(10, 0));
        assertEquals("No se puede dividir por cero", exception.getMessage(), "Mensaje de error incorrecto en división por cero");
    }

    @Test
    void pru_8_potencia_ExponenteCero() {
        assertEquals(1, Calculadora.potencia(5, 0), "Cualquier número elevado a 0 debe ser 1");
    }

    @Test
    void pru_9_raizCuadrada_Negativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Calculadora.raizCuadrada(-4));
        assertEquals("No se puede calcular la raíz cuadrada de un número negativo", exception.getMessage(), "Error en raíz de número negativo");
    }

    @Test
    void pru_10_logaritmoNatural_CeroONegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Calculadora.logaritmoNatural(0));
        assertEquals("El logaritmo natural solo está definido para números positivos", exception.getMessage(), "Error en logaritmo natural de 0 o número negativo");
    }
}
