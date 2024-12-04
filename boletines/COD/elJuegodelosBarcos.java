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
        int tipobarco; int NB4=1; int NB3=1; int NB2=2;
        boolean repetido;
        do {
            repetido=false;
            System.out.println("tienes "+NB4+" barco de 1x4, "+NB3+" de 1x3 y "+NB3+" de 1x2");
            System.out.println("1-colocar el barco 1x2");
            System.out.println("2-colocar el barco 1x3");
            System.out.println("1-colocar el barco 1x4");
            tipobarco = sc.nextInt();
            if (tipobarco>0&&tipobarco<3);{System.out.println("valor no permitido, vuelve a introducir");}
            if (repetido==true);{System.out.println("valor repetido");}
            meterbarco(tablero,tipobarco);
        }
        while((tipobarco>0&&tipobarco<3)||NB4>0||NB3>0||NB2>0);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void meterbarco(int [] tablero, int barco)
}
