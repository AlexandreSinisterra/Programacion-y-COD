package COD.programas;

public class MiClase {

    // Método para sumar dos números
    public int suma(int a, int b) {
        return a + b;
    }

    // Método para multiplicar dos números
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números
    public int division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}

