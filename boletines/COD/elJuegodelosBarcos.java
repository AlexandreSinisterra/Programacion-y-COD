package COD;

import java.util.Scanner;

public class elJuegodelosBarcos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        int barco=0;
        do {
            System.out.println("tienes 1 barco de 1x4, otro de 1x3 y 2 de 1x2");
            System.out.println("1-colocar el barco 1x2");
            System.out.println("2-colocar el barco 1x3");
            System.out.println("1-colocar el barco 1x4");
            barco = sc.nextInt();
            if (barco>0&&barco<3);
                System.out.println("valor no permitido, vuelve a introducir");
        }
        while(barco>0&&barco<3);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void barco4(int [] tablero)
}
