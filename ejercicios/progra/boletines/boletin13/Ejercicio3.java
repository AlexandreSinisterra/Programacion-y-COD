package progra.boletines.boletin13;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        // Rellenamos la lista
        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        System.out.println("Original: " + lista);

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            int valor = it.next();
            if (valor == 5 || valor == 7) {
                it.remove(); // Eliminamos con el iterador
            }
        }

        System.out.println("Después de eliminar: " + lista);
    }
}

