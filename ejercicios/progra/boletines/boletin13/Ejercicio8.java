import java.util.HashSet;
import java.util.Set;

public class Ejercicio8 {

    // Método estático genérico para la intersección de dos conjuntos
    static <E> Set<E> interseccion(Set<E> conxunto1, Set<E> conxunto2) {
        // Crear un nuevo conjunto a partir de conxunto1
        Set<E> resultado = new HashSet<>(conxunto1);
        // Retener solo elementos que también están en conxunto2
        resultado.retainAll(conxunto2);
        return resultado;
    }

    public static void main(String[] args) {
        // Crear dos conjuntos ejemplo
        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto1.add(4);

        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);
        conjunto2.add(6);

        // Realizar la intersección
        Set<Integer> interseccionConjuntos = interseccion(conjunto1, conjunto2);

        // Imprimir el resultado
        System.out.println("Intersección de los conjuntos: " + interseccionConjuntos);

            System.out.println(conjunto2);

        for (int elemento : conjunto2) {
            System.out.println(elemento);
        }

    }
}
