package ejemplos_explicaciones;

public class pruebaArray3D {
    public static void main(String[] args) {
        // Crear el array tridimensional
        int[][][] array3D = new int[5][10][10];

        // Rellenar el array con valores (opcional, por defecto sería 0)
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = i + j + k; // Ejemplo: valor calculado basado en índices
                }
            }
        }

        // Mostrar el array por pantalla
        for (int i = 0; i < array3D.length; i++) {
            System.out.println("Capa " + (i + 1) + ":");
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); // Salto de línea al final de cada fila
            }
            System.out.println(); // Salto de línea al final de cada capa
        }
    }
}
