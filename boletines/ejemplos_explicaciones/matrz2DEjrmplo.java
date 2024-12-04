package ejemplos_explicaciones;

public class matrz2DEjrmplo {
        public static void main(String[] args) {
            // Declaración e inicialización de un array de 2 dimensiones (3x3)
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Acceder y mostrar los elementos del array de 2 dimensiones
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); // Nueva línea después de cada fila
                }
    }
}
