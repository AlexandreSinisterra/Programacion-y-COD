package progra.ejemplos_explicaciones;

public class exemplosTaboas {
    public static void main (String []args){
        // Definimos los arreglos de nombres y edades.
        String[] nomes = {"Ana", "Carlos", "Pedro", "María", "Lucía"};
        int[] edades = {25, 30, 22, 35, 28};

        // Imprimimos el nombre en la posición 3 (índice 3, que es "María").
        System.out.println(nomes[3]);

        // Encontrar el valor mínimo de edades usando un bucle clásico.
        int minimo = edades[0];  // Inicializamos el mínimo con el primer valor del arreglo.
        for (int i = 1; i < edades.length; i++) { // Usamos 'i = 1' ya que 'i = 0' ya es el valor inicial.
            if (minimo > edades[i]) {
                minimo = edades[i];  // Actualizamos el valor mínimo si encontramos uno más pequeño.
            }
        }
        System.out.println("O valor minimo de idades é: " + minimo);

        // Encontrar el valor mínimo de edades usando un bucle mejorado (for-each).
        minimo = edades[0];  // Reiniciamos el valor mínimo.
        for (int edade : edades) {
            if (minimo > edade) {
                minimo = edade;  // Actualizamos el mínimo si encontramos un valor menor.
            }
        }
        System.out.println("O valor minimo de idades é: " + minimo);
    }
}
