package COD;

import java.util.Scanner;

public class elJuegodelosBarcos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = {//nuestro hermoso tablero vacío
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
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
            meterbarco(tablero,tipobarco+1);
        }
        while(NB4>0||NB3>0||NB2>0);//se repite hasta que los barcos se acaben
        for (int[] ints : tablero) {//simplemente para mostrar el tablero
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    /*

espacio solo para separar funciones

     */
    public static int[][] meterbarco(int [][] tablero, int tamaño_barco){
        Scanner sc = new Scanner(System.in);
        int tamaño, tamaño_inclinado, guardar_columna1;
        boolean error;
        int cambio;
        System.out.println("este es tu tablero:");
        for (int[] ints : tablero) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("donde quieres colocar tu barco, pon las coordenadas de las 2 puntas del barco");
        do {
            error = false;
            System.out.println("fila:");
            int fila1 = sc.nextInt();
            System.out.println("columna:");
            int columna1 = sc.nextInt();
            System.out.println("ahora dime las de la otra punta:");
            System.out.println("fila:");
            int fila2 = sc.nextInt();
            System.out.println("columna:");
            int columna2 = sc.nextInt();
            if (fila1 < 0 || fila1 > 9 || fila2 < 0 || fila2 > 9 || columna1 < 0 || columna1 > 9 || columna2 < 0 || columna2 > 9) {
                error = true;//error de fuera de tablero
                System.out.println("casilla inválida, tiene que estar dentro del tablero, los valores son del 0 al 9.");
                continue;
            }
            if (fila2 < fila1) {//cambio para que la fila 1 siempre sea la que tiene un valor menor
                cambio = fila2;
                fila2 = fila1;
                fila1 = cambio;
            }
            if (columna2 < columna1) {//lo mismo que el cambio de arriba pero con columnas
                cambio = columna2;
                columna2 = columna1;
                columna1 = cambio;
            }
            tamaño_inclinado=fila2-fila1+1;
            tamaño = (fila2 - fila1 + columna2 - columna1)+1;

            if ((tamaño != tamaño_barco)&&(tamaño_inclinado!=tamaño_barco)) {
                error = true;//error de tamaño de barco
                System.out.println("las coordenadas tienen un tamaño diferente al barco.");
                System.out.println("intentelo de nuevo");
                continue;
            }
            if (fila1 == fila2 || columna2 == columna1) {
                for (int i = fila1; i <= fila2; i++) {
                    for (int j = columna1; j <= columna2; j++) {
                        if (tablero[i][j] != 0) {
                            error = true;//error de casilla ocupada
                            System.out.println("Se estaba construyendo el barco pero choco con otro barco en las coordenadas: " + i + " " + j);
                        }
                    }
                }
                if (error) continue;;
                for (int i = fila1; i <= fila2; i++) {
                    for (int j = columna1; j <= columna2; j++) {
                        tablero[i][j] = tamaño_barco;
                    }
                }
            } else {
                guardar_columna1 = columna1;
                for (int i = fila1; i <= fila2; i++) {
                    if (tablero[i][columna1] != 0) {
                        error = true;//error de casilla ocupada
                        System.out.println("Se estaba construyendo el barco pero choco con otro barco en las coordenadas: " + i + " " + columna1);
                    }
                    columna1++;
                }
                if (error) continue;;
                columna1 = guardar_columna1;//me gustaria mas utilizar en el bucle de abajo esta variable, pero lo pongo asi xq queda mas claro
                for (int i = fila1; i <= fila2; i++) {
                    tablero[i][columna1] = tamaño_barco;
                    columna1++;
                }
            }
        }
        while(error);
        return tablero;
    }
    //toca descansito
}
