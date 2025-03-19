package COD.testprogramas;

import COD.programas.MiClase;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiClaseTest {

    private MiClase miClase;

    @BeforeAll
    public static void setup() {
        System.out.println("Se ejecuta antes de todos los tests");
    }

    @BeforeEach
    public void init() {
        miClase = new MiClase();  // Inicializamos la clase antes de cada test
        System.out.println("Se ejecuta antes de cada test");
    }

    @Test
    @Tag("Rápido")
    @DisplayName("Test rápido para sumar dos números")
    void testSuma() {
        System.out.println("Ejecutando test de suma");
        assertEquals(4, miClase.suma(2, 2));
    }

    @Test
    @Tag("Rápido")
    @DisplayName("Test rápido para multiplicación")
    void testMultiplicacion() {
        System.out.println("Ejecutando test de multiplicación");
        assertEquals(6, miClase.multiplicacion(2, 3));
    }

    @Test
    @Tag("Lento")
    @DisplayName("Test lento para la operación de división (simulado con espera)")
    void testDivisionLenta() throws InterruptedException {
        System.out.println("Ejecutando test lento de división");
        Thread.sleep(2000); // Simulando una operación lenta
        assertEquals(2, miClase.division(6, 3));
    }

    @ParameterizedTest(name = "Sumar {0} + {1} = {2}")
    @CsvSource({
            "1, 2, 3",
            "2, 3, 5",
            "3, 5, 8"
    })
    void testSumaParametrizada(int num1, int num2, int resultadoEsperado) {
        // Usamos el método de la clase MiClase para la suma
        assertEquals(resultadoEsperado, miClase.suma(num1, num2));
    }

    @AfterEach
    public void teardown() {
        System.out.println("Se ejecuta después de cada test");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("Se ejecuta después de todos los tests");
    }
}
