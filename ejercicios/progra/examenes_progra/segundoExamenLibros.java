package progra.examenes_progra;
import java.util.Scanner;

/**
 * examen progra 2
 * @author sandark67
 * @version 1.0
 */
public class segundoExamenLibros {
    /**
     * @autor
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String decision, titulo;
        int numerodelista;
        String[] libreria = new String[20];
        do {
            System.out.println("tienes una tabla para rellenar con 20 libros, que deseas hacer?");
            System.out.println("visualizarLibros- muestra los libros en la tabla");
            System.out.println("engadirLibro- se añadirá un libro si hay espacio");
            System.out.println("eliminarLibro- elimina el libro de la posición que desees");
            decision = sc.next();
            if (decision.equals("visualizarLibros")) visualizar(libreria);
            if (decision.equals("engadirLibro")) {
                System.out.println("nombre del libro?");
                titulo = sc.next();
                if (engadir(libreria, titulo)) System.out.println("Se ha añadido el libro");
                else System.out.println("No se ha podido añadir, la lista está llena");
            }
            if (decision.equals("eliminarLibro")) {
                System.out.println("posicion del libro?(del 0 al 19)");
                numerodelista = sc.nextInt();
                if (eliminar(libreria, numerodelista)) System.out.println("Se ha borrado el libro");
                else System.out.println("No se ha podido borrar el libro, no hay un libro en esa posicion");
            }
        }
        while (!decision.equals("Sair"));
    }

    public static void visualizar(String[] libreria) {
        for (int i = 0; i < libreria.length; i++) {//pondria ubn bucle each for, pero en el ordinograma seria mas complicado, no se, nunca probe
            if (libreria[i] == null) System.out.println("baleiro");
            else System.out.println(libreria[i]);
        }
    }

    /**
     * Esta funcion sirve para engadir un libro a lista
     * @param libreria
     * @param titulo
     * @return
     */
    public static boolean engadir(String[] libreria, String titulo) {
        boolean exito = false;
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] == null) {
                libreria[i] = titulo;
                exito = true;
                break;
            }
        }
        return exito;
    }


    /**
     *
     * @param libreria
     * @param posicion
     * @return
     */
    public static boolean eliminar(String[] libreria, int posicion) {
        boolean exito = true;

        if ((posicion >= libreria.length)||(libreria[posicion] == null)) exito = false;
        /*antes pensaba que iba a dar error porque pense que haría las 2 comprobaciones,
        pero si se cumple la 1era ya no hace la 2da y entonces ya no da error al intentar ver un aposicion que no existe
        */
            else libreria[posicion] = null;

        return exito;
    }
}
