
package COD;

import java.util.Scanner;

public class elJuegodelosBarcos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean segundobarco=false;
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
        System.out.println("jugador 1, su turno");
        int tipobarco;
        int NB4 = 1;
        int NB3 = 1;
        int NB2 = 2;//cantidad de barcos
        do {
            System.out.println("tienes " + NB4 + " barco de 1x4, " + NB3 + " de 1x3 y " + NB2 + " de 1x2");
            System.out.println("1-colocar el barco 1x2");
            System.out.println("2-colocar el barco 1x3");
            System.out.println("3-colocar el barco 1x4");
            tipobarco = sc.nextInt();
            switch (tipobarco) {//vamos restando los tipos de barcos segun los coloquemos
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
            if (NB2 < 0) {
                NB2 = 0;
                System.out.println("ya colocaste el máximo numero de barcos tipo 1x2");
                continue;
            }
            if (NB3 < 0) {
                NB3 = 0;
                System.out.println("ya colocaste el máximo numero de barcos tipo 1x3");
                continue;
            }
            if (NB4 < 0) {
                NB4 = 0;
                System.out.println("ya colocaste el máximo numero de barcos tipo 1x4");
                continue;
            }
            if (NB2==1) segundobarco=true;
            meterbarco(tablero,tipobarco+1, segundobarco);
        }
        while (NB4 > 0 || NB3 > 0 || NB2 > 0);//se repite hasta que los barcos se acaben
        for (int i = 0; i < tablero[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("  +---------------------+");
        int filas = 0;
        for (int[] ints : tablero) {
            System.out.print(filas + " | ");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("|");
            filas++;
        }
        System.out.println("  +---------------------+");
        System.out.println("jugador 2, su turno");
        System.out.println("a ver en cuantos turnos terminas con todos los barcos");
        NB4=1;
        NB3=1;
        NB2=2;
        while (NB4 > 0 || NB3 > 0 || NB2 > 0) {
            String[][] tablero2 = {//nuestro hermoso tablero vacío
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
                    {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"},
            };
            //disparobarco(tablero2, tablero);
        }
    }
    /*

espacio solo para separar funciones

     */
    public static int[][] meterbarco(int[][] tablero, int tamaño_barco, boolean segundobarco) {
        Scanner sc = new Scanner(System.in);
        int tamaño, tamaño_inclinado, guardar_columna1;
        boolean error;
        int cambio, fila1, fila2, columna1,columna2;
        System.out.println("este es tu tablero:");
        System.out.print("    ");
        for (int i = 0; i < tablero[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("  +---------------------+");
        int filas = 0;
        for (int[] ints : tablero) {
            System.out.print(filas + " | ");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("|");
            filas++;
        }
        System.out.println("  +---------------------+");
        System.out.println("donde quieres colocar tu barco, pon las coordenadas de las 2 puntas del barco");
        do {
            error = false;
            System.out.println("fila:");
            fila1 = sc.nextInt();
            System.out.println("columna:");
            columna1 = sc.nextInt();
            System.out.println("ahora dime las de la otra punta:");
            System.out.println("fila:");
            fila2 = sc.nextInt();
            System.out.println("columna:");
            columna2 = sc.nextInt();
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
            tamaño_inclinado = fila2 - fila1 + 1;
            tamaño = (fila2 - fila1 + columna2 - columna1) + 1;

            if ((tamaño != tamaño_barco) && (tamaño_inclinado != tamaño_barco)) {
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
                if (error) continue;
                ;
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
                if (error) continue;
                columna1 = guardar_columna1;//me gustaria mas utilizar en el bucle de abajo esta variable, pero lo pongo asi xq queda mas claro
                for (int i = fila1; i <= fila2; i++) {
                    tablero[i][columna1] = tamaño_barco;
                    columna1++;
                }
            }
        }
        while (error);
        if (segundobarco) {
            switch (tamaño_barco - 1) {
                case 1: barco22(fila1,fila2,columna1,columna2); break;
                case 2: barco3(fila1,fila2,columna1,columna2); break;
                case 3: barco4(fila1,fila2,columna1,columna2); break;
            }
        }
        else {
            switch (tamaño_barco - 1) {
                case 1: barco21(fila1,fila2,columna1,columna2); break;
                case 2: barco3(fila1,fila2,columna1,columna2); break;
                case 3: barco4(fila1,fila2,columna1,columna2); break;
            }
        }
        return tablero;
    }



    /*

espacio solo para separar funciones

     */
    public static String[][] disparobarco(String[][] tablero2, int[][] tablero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("este es tu tablero:");
        System.out.print("    ");
        for (int i = 0; i < tablero2[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("  +---------------------+");
        int filas = 0;
        for (String[] ints : tablero2) {
            System.out.print(filas + " | ");
            for (String anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("|");
            filas++;
        }
        System.out.println("  +---------------------+");
        System.out.println("seleccione las coordenadas del disparo");
        System.out.println("fila:");
        int fila = sc.nextInt();
        System.out.println("columna:");
        int columna = sc.nextInt();
        if (tablero[fila][columna]==0)
        return tablero2;
    }
/*

espacio solo para separar funciones

     */

    public static String barco3(int fila1, int fila2, int columna1, int columna2){
        String fila1S,fila2S,columna1S,columna2S;
        switch (fila1){
            case 0: fila1S="q"; break;
            case 1: fila1S="w"; break;
            case 2: fila1S="e"; break;
            case 3: fila1S="r"; break;
            case 4: fila1S="t"; break;
            case 5: fila1S="y"; break;
            case 6: fila1S="u"; break;
            case 7: fila1S="i"; break;
            case 8: fila1S="o"; break;
            case 9: fila1S="p"; break;
        }
        switch (columna1){
            case 0: columna1S="q"; break;
            case 1: columna1S="w"; break;
            case 2: columna1S="e"; break;
            case 3: columna1S="r"; break;
            case 4: columna1S="t"; break;
            case 5: columna1S="y"; break;
            case 6: columna1S="u"; break;
            case 7: columna1S="i"; break;
            case 8: columna1S="o"; break;
            case 9: columna1S="p"; break;
        }
        switch (fila2){
            case 0: fila2S="q"; break;
            case 1: fila2S="w"; break;
            case 2: fila2S="e"; break;
            case 3: fila2S="r"; break;
            case 4: fila2S="t"; break;
            case 5: fila2S="y"; break;
            case 6: fila2S="u"; break;
            case 7: fila2S="i"; break;
            case 8: fila2S="o"; break;
            case 9: fila2S="p"; break;
        }
        switch (columna2){
            case 0: columna2S="q"; break;
            case 1: columna2S="w"; break;
            case 2: columna2S="e"; break;
            case 3: columna2S="r"; break;
            case 4: columna2S="t"; break;
            case 5: columna2S="y"; break;
            case 6: columna2S="u"; break;
            case 7: columna2S="i"; break;
            case 8: columna2S="o"; break;
            case 9: columna2S="p"; break;
        }
        return fila1S+columna1S+fila2S+columna2S;
    }
    /*

espacio solo para separar funciones

     */

    public static String barco21(int fila1, int fila2, int columna1, int columna2){
        String fila1S,fila2S,columna1S,columna2S;
        switch (fila1){
            case 0: fila1S="q"; break;
            case 1: fila1S="w"; break;
            case 2: fila1S="e"; break;
            case 3: fila1S="r"; break;
            case 4: fila1S="t"; break;
            case 5: fila1S="y"; break;
            case 6: fila1S="u"; break;
            case 7: fila1S="i"; break;
            case 8: fila1S="o"; break;
            case 9: fila1S="p"; break;
        }
        switch (columna1){
            case 0: columna1S="q"; break;
            case 1: columna1S="w"; break;
            case 2: columna1S="e"; break;
            case 3: columna1S="r"; break;
            case 4: columna1S="t"; break;
            case 5: columna1S="y"; break;
            case 6: columna1S="u"; break;
            case 7: columna1S="i"; break;
            case 8: columna1S="o"; break;
            case 9: columna1S="p"; break;
        }
        switch (fila2){
            case 0: fila2S="q"; break;
            case 1: fila2S="w"; break;
            case 2: fila2S="e"; break;
            case 3: fila2S="r"; break;
            case 4: fila2S="t"; break;
            case 5: fila2S="y"; break;
            case 6: fila2S="u"; break;
            case 7: fila2S="i"; break;
            case 8: fila2S="o"; break;
            case 9: fila2S="p"; break;
        }
        switch (columna2){
            case 0: columna2S="q"; break;
            case 1: columna2S="w"; break;
            case 2: columna2S="e"; break;
            case 3: columna2S="r"; break;
            case 4: columna2S="t"; break;
            case 5: columna2S="y"; break;
            case 6: columna2S="u"; break;
            case 7: columna2S="i"; break;
            case 8: columna2S="o"; break;
            case 9: columna2S="p"; break;
        }
        return fila1S+columna1S+fila2S+columna2S;
    }
    /*

espacio solo para separar funciones

     */

    public static String barco22(int fila1, int fila2, int columna1, int columna2){
        String fila1S,fila2S,columna1S,columna2S;
        switch (fila1){
            case 0: fila1S="q"; break;
            case 1: fila1S="w"; break;
            case 2: fila1S="e"; break;
            case 3: fila1S="r"; break;
            case 4: fila1S="t"; break;
            case 5: fila1S="y"; break;
            case 6: fila1S="u"; break;
            case 7: fila1S="i"; break;
            case 8: fila1S="o"; break;
            case 9: fila1S="p"; break;
        }
        switch (columna1){
            case 0: columna1S="q"; break;
            case 1: columna1S="w"; break;
            case 2: columna1S="e"; break;
            case 3: columna1S="r"; break;
            case 4: columna1S="t"; break;
            case 5: columna1S="y"; break;
            case 6: columna1S="u"; break;
            case 7: columna1S="i"; break;
            case 8: columna1S="o"; break;
            case 9: columna1S="p"; break;
        }
        switch (fila2){
            case 0: fila2S="q"; break;
            case 1: fila2S="w"; break;
            case 2: fila2S="e"; break;
            case 3: fila2S="r"; break;
            case 4: fila2S="t"; break;
            case 5: fila2S="y"; break;
            case 6: fila2S="u"; break;
            case 7: fila2S="i"; break;
            case 8: fila2S="o"; break;
            case 9: fila2S="p"; break;
        }
        switch (columna2){
            case 0: columna2S="q"; break;
            case 1: columna2S="w"; break;
            case 2: columna2S="e"; break;
            case 3: columna2S="r"; break;
            case 4: columna2S="t"; break;
            case 5: columna2S="y"; break;
            case 6: columna2S="u"; break;
            case 7: columna2S="i"; break;
            case 8: columna2S="o"; break;
            case 9: columna2S="p"; break;
        }
        return fila1S+columna1S+fila2S+columna2S;
    }
    /*

espacio solo para separar funciones

     */

    public static String barco4(int fila1, int fila2, int columna1, int columna2){
        String fila1S,fila2S,columna1S,columna2S;
        switch (fila1){
            case 0: fila1S="q"; break;
            case 1: fila1S="w"; break;
            case 2: fila1S="e"; break;
            case 3: fila1S="r"; break;
            case 4: fila1S="t"; break;
            case 5: fila1S="y"; break;
            case 6: fila1S="u"; break;
            case 7: fila1S="i"; break;
            case 8: fila1S="o"; break;
            case 9: fila1S="p"; break;
        }
        switch (columna1){
            case 0: columna1S="q"; break;
            case 1: columna1S="w"; break;
            case 2: columna1S="e"; break;
            case 3: columna1S="r"; break;
            case 4: columna1S="t"; break;
            case 5: columna1S="y"; break;
            case 6: columna1S="u"; break;
            case 7: columna1S="i"; break;
            case 8: columna1S="o"; break;
            case 9: columna1S="p"; break;
        }
        switch (fila2){
            case 0: fila2S="q"; break;
            case 1: fila2S="w"; break;
            case 2: fila2S="e"; break;
            case 3: fila2S="r"; break;
            case 4: fila2S="t"; break;
            case 5: fila2S="y"; break;
            case 6: fila2S="u"; break;
            case 7: fila2S="i"; break;
            case 8: fila2S="o"; break;
            case 9: fila2S="p"; break;
        }
        switch (columna2){
            case 0: columna2S="q"; break;
            case 1: columna2S="w"; break;
            case 2: columna2S="e"; break;
            case 3: columna2S="r"; break;
            case 4: columna2S="t"; break;
            case 5: columna2S="y"; break;
            case 6: columna2S="u"; break;
            case 7: columna2S="i"; break;
            case 8: columna2S="o"; break;
            case 9: columna2S="p"; break;
        }
        return fila1S+columna1S+fila2S+columna2S;
    }
}