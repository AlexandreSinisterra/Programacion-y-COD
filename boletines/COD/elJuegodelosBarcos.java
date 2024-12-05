package COD;

import java.util.Scanner;

public class elJuegodelosBarcos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = {//nuestro hermoso tablero vacío
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        int tipobarco; int NB4=1; int NB3=1; int NB2=2;//cantidad de barcos
        do {
            System.out.println("tienes "+NB4+" barco de 1x4, "+NB3+" de 1x3 y "+NB2+" de 1x2");
            System.out.println("1-colocar el barco 1x2");
            System.out.println("2-colocar el barco 1x3");
            System.out.println("3-colocar el barco 1x4");
            tipobarco = sc.nextInt();
            switch (tipobarco){//vamos restando los tipos de barcos segun los coloquemos
                case 1:
                    NB2--;
                    break;
                case 2:
                    NB3--;
                    break;
                case 3:
                    NB4--;
                    break;
                default:
                    System.out.println("valor no permitido, vuelve a introducir");
                    continue;
            }
            // ahora vamos por si ponen barcos de más, osea que el valor de los barcos sea <0
            if (NB2<0){ NB2=0;
                System.out.println("ya colocaste el máximo numero de barcos tipo 1x2");
                continue;
            }
            if (NB3<0){ NB3=0;
                System.out.println("ya colocaste el máximo numero de barcos tipo 1x3");
                continue;
            }
            if (NB4<0){ NB4=0;
                System.out.println("ya colocaste el máximo numero de barcos tipo 1x4");
                continue;
            }
            meterbarco(tablero,tipobarco);
        }
        while(NB4>0||NB3>0||NB2>0);//se repite hasta que los barcos se acaben
        for (int[] ints : tablero) {//simplemente para mostrar el tablero
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static int[][] meterbarco(int [][] tablero, int barco){
        Scanner sc = new Scanner(System.in);
        int tamaño_barco=barco;
        System.out.println("este es tu tablero:");
        for (int[] ints : tablero) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("donde quieres colocar tu barco, pon las coordenadas de las 2 puntas del barco, solo horizontal y vertical se puede colocar");
        System.out.println("fila:");
        int fila1= sc.nextInt();
        System.out.println("columna:");
        int columna1= sc.nextInt();
        System.out.println("ahora dime las de la otra punta:");
        System.out.println("fila:");
        int fila2= sc.nextInt();
        System.out.println("columna:");
        int columna3= sc.nextInt();


        return tablero;
    }
}
