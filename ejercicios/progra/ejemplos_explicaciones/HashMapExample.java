package progra.ejemplos_explicaciones;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 2);
        map.put("Apple", 4); // Actualiza el valor asociado a "Apple"

        System.out.println("Elementos en el HashMap: " + map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());

            if(entry.getValue()==2) {
                System.out.println(entry.getKey());
            }
        }

    }
}
