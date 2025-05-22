import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Crear un TreeSet y añadir algunos elementos
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Mostrar el TreeSet
        System.out.println("Elementos en el TreeSet: " + numeros);

        // Obtener el primer y último elemento
        System.out.println("Primer elemento: " + numeros.first());
        System.out.println("Último elemento: " + numeros.last());

        // Obtener el elemento más cercano que es mayor que un valor dado
        System.out.println("Elemento mayor que 25: " + numeros.higher(25));
        System.out.println("Elemento mayor que 40: " + numeros.higher(40)); // null, ya que no hay

        // Obtener el elemento más cercano que es menor que un valor dado
        System.out.println("Elemento menor que 25: " + numeros.lower(25));
        System.out.println("Elemento menor que 10: " + numeros.lower(10)); // null, ya que no hay

        // Obtener un rango de elementos entre dos valores
        System.out.println("Elementos entre 15 y 45: " + numeros.subSet(15, 45));
    }
}
