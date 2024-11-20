import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapEjemplo {
    public static void main(String[] args) {
        // Crear un mapa para almacenar nombres de alumnos y sus notas
        Map<String, Integer> mapaNotas = new HashMap<>();

        // Crear un objeto Scanner para recibir entradas del usuario
        Scanner sc = new Scanner(System.in);

        // Variable para controlar la entrada de alumnos
        String nombre;
        int nota;

        // Bucle para ingresar varios alumnos
        while (true) {
            System.out.print("Introduce el nombre del alumno (o escribe 'salir' para terminar): ");
            nombre = sc.nextLine();

            // Si el nombre es "salir", terminamos el bucle
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            // Pedir la nota del alumno
            System.out.print("Introduce la nota de " + nombre + ": ");
            nota = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer de entrada

            // Insertar el nombre y la nota en el mapa
            mapaNotas.put(nombre, nota);
        }

        // Mostrar el mapa completo de alumnos y sus notas
        System.out.println("\nLista completa de alumnos y sus notas:");
        for (Map.Entry<String, Integer> entry : mapaNotas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Consultar la nota de un alumno específico
        System.out.print("\nIntroduce el nombre de un alumno para consultar su nota: ");
        String nombreConsulta = sc.nextLine();

        if (mapaNotas.containsKey(nombreConsulta)) {
            // Si el nombre existe, mostramos la nota
            System.out.println("La nota de " + nombreConsulta + " es: " + mapaNotas.get(nombreConsulta));
        } else {
            // Si el nombre no existe en el mapa
            System.out.println("El alumno no está registrado.");
        }

        // Cerrar el Scanner
        sc.close();
    }
}
/**
 -primero hay que colocar

 import java.util.HashMap;
 import java.util.Map;

 -luego se crea el mapa

 Map<String, Integer> mapaNotas = new HashMap<>();

 en este caso hice que la key sea un String y el valor un int
 el nombre que le pusimos a map es mapaNotas

 -metemos los valores con

 mapaNotas.put(nombre, nota);

 en mi caso el primer valor se llama nombre y el segundo nota, se puede poner un array dentro

 -con esto vemos si nuestro mapa contiene la key "alumno"

 mapaNotas.containsKey(alumno)

 -con esto nos da el value que corresponde a la key alumno

 mapaNotas.get(alumno)

 -con este bucle sacamos el contenido del map

 for (Map.Entry<String, Integer> entry : mapaNotas.entrySet()) {
 System.out.println(entry.getKey() + ": " + entry.getValue());
 }

 entry la declaramos como un map con la clave string y el valor integer
 mapaNotas.entrySet() nos devuelve un conjunto (Set) de objetos Map.Entry, en un map cada set esta compuesto por una clave y un valor
 Map.Entry<String, Integer> almacenará los valores anteriores
 hacemos un bucle porque nuestra clave y el valor irá cambiando en cada vuelta, ya que el map.entry estara recorriendo nuestro mapaNotas
 **/
