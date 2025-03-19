# JUnit: Pruebas Básicas y Parametrizadas

JUnit es un framework utilizado para realizar pruebas unitarias en Java. Para usarlo, por cada caso de prueba creamos un método de prueba, el cual será independiente de los demás y probará un único caso.

## Anotaciones para JUnit

Antes de cada método de prueba, usamos las siguientes anotaciones para configurar y organizar los tests:

| Anotación       | Descripción                                                                                                                                  |
|-----------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| `@Test`         | Indica que el método es un test.                                                                                                              |
| `@DisplayName`  | Indica un nombre para el test, ya sea para la clase de test o el método de test.                                                            |
| `@Tag`          | Define etiquetas para filtrar las pruebas.                                                                                                  |
| `@BeforeEach`   | Se aplica a un método para indicar que se ejecute antes de cada método de prueba.                                                           |
| `@AfterEach`    | Se aplica a un método para indicar que se ejecute después de cada método de prueba.                                                          |
| `@BeforeAll`    | Se aplica a un método estático para indicar que se ejecute antes de todos los métodos de prueba de la clase.                                |
| `@AfterAll`     | Se aplica a un método estático para indicar que se ejecute después de todos los métodos de prueba de la clase.                               |
| `@Disable`      | Se aplica a un método de prueba para deshabilitar esa prueba.                                                                                |
| `@ParameterizedTest(name = "")` | Se usa para pruebas que tienen varios casos englobados por parámetros. En `name` podemos usar `{0}`, `{1}`, etc., haciendo referencia a los valores del CSV. |
| `@CsvSource({"input,result", ...})` | Se debe escribir después de `@ParameterizedTest` y proporciona la fuente de los datos (CSV). |

## Ejemplo Combinado: Pruebas Básicas y Parametrizadas

```java
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
```

## Aserciones

La clase `Assertions` nos permite comprobar si los valores de los tests son correctos, tanto si son positivos como negativos. Aquí están algunos de los métodos de aserción más comunes:

| Método                                                              | Descripción                                                                                       |
|---------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|
| `assertTrue(boolean valor)`                                          | Falla si `valor` no es `true`.                                                                    |
| `assertFalse(boolean valor)`                                         | Falla si `valor` no es `false`.                                                                   |
| `assertFalse(boolean valor, String mensaje)`                        | Falla si `valor` no es `false` y muestra el mensaje especificado.                                 |
| `assertEquals(int esperado, int actual)`                             | Falla si `esperado` es distinto de `actual`.                                                      |
| `assertEquals(int esperado, int actual, String mensaje)`             | Falla si `esperado` es distinto de `actual` y muestra el mensaje.                                 |
| `assertEquals(double esperado, double actual, double delta)`         | Falla si la diferencia entre `esperado` y `actual` es mayor a `delta`.                           |
| `assertNull(Object obj)`                                             | Falla si `obj` no es `null`.                                                                      |
| `assertNotNull(Object obj)`                                          | Falla si `obj` es `null`.                                                                         |
| `assertEquals(Object esperado, Object actual)`                       | Falla si los objetos son distintos, evaluando su método `equals()`.                              |
| `assertNotEquals(Object esperado, Object actual)`                    | Falla si los objetos son iguales, evaluando su método `equals()`.                                |
| `assertSame(Object esperado, Object actual)`                         | Falla si las referencias de los objetos son distintas.                                           |

### Ejemplos de uso de aserciones

```java
import org.junit.jupiter.api.*;

public class AsercionesTest {

    @Test
    void testAserciones() {
        assertTrue(5 > 3, "5 debe ser mayor que 3");
        assertFalse(2 > 3, "2 no debe ser mayor que 3");

        int esperado = 10;
        int actual = 5 + 5;
        assertEquals(esperado, actual, "Los valores deben ser iguales");

        String texto = null;
        assertNull(texto, "El texto debe ser null");

        String otroTexto = "Hola";
        assertNotNull(otroTexto, "El texto no debe ser null");

        String saludo1 = "Hola";
        String saludo2 = "Hola";
        assertEquals(saludo1, saludo2, "Los objetos deben ser iguales");

        assertSame(saludo1, saludo2, "Ambas referencias deben ser la misma");
    }
}
```
### En IntelliJ IDEA:

#### Abrir la configuración de ejecución de JUnit:

1. Abre la clase de test o el paquete de tests que contiene las pruebas que quieres ejecutar.
2. Haz clic derecho sobre el nombre de la clase o el paquete y selecciona **"Run"** o **"Run 'MiClaseTest'"**.

#### Filtrar por etiquetas:

1. En la parte superior derecha de IntelliJ, verás un botón de ejecución (normalmente tiene un pequeño icono de "play" o un nombre como **"Run"**).
2. Haz clic en el menú desplegable de ese botón de ejecución y selecciona **"Edit Configurations..."**.
3. En el panel de configuración, selecciona el **JUnit** de la clase de prueba que deseas configurar.
4. En el campo **"Tags"**, puedes agregar el tag que deseas ejecutar. Solo los tests que contienen ese tag se ejecutarán. Por ejemplo:
    - Escribe **"Rápido"** para ejecutar solo los tests con el tag **"Rápido"**.
    - Escribe **"Lento"** para ejecutar solo los tests con el tag **"Lento"**.
