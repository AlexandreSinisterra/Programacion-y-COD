package COD.testprogramas;

import COD.programas.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {

    // Test básico de la suma de 1 + 1
    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    // Test parametrizado para varias combinaciones de suma
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 4",
            "49, 51, 100",
            "1, 100, 101"
    })
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    // Métodos que se ejecutan antes y después de cada prueba
    @BeforeEach
    void setUp() {
        System.out.println("Preparing for the test...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after the test...");
    }

    // Métodos estáticos que se ejecutan antes y después de todos los tests
    @BeforeAll
    static void initAll() {
        System.out.println("This is run before all tests.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("This is run after all tests.");
    }
}

