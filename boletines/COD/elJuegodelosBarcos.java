
package COD;

import java.util.Scanner;

public class elJuegodelosBarcos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("empecemos el juego");
        System.out.println("nombre del jugador 1 en esta partida: ");
        String nombre1 = sc.next();
        int turno1 = jugador();//jugador es la funcion con la que se lleva a cabo la partida
        System.out.println("siguiente juego");
        System.out.println("nombre del jugador 1 en esta partida: ");
        String nombre2 = sc.next();
        int turno2 = jugador();
        if (turno1 == turno2) {//si los turnos son iguales significa un empate, no creo q tenga q comentar eso...
            System.out.println("EMPATE");
        } else {
            int tdelGanador = (turno1 > turno2) ? turno2 : turno1;//se elige el turno mas pequeño como ganbador
            String ndelGanador = (turno1 > turno2) ? nombre1 : nombre2;//si se tardan mas en el primer juego, quiere decir que el jugador 1 (el que coloca los barcos), gana
            int diferenciaTurnos = turno1 - tdelGanador + turno2 - tdelGanador;//matematicas simples, es literalmente--> z=x-x+x-y --> z=x-y ("y" siendo la menos, asi me ahorro volver a comparar cual es mas pequeño)
            System.out.println("el ganador es " + ndelGanador + " con " + tdelGanador + " turnos, una diferencia de " + diferenciaTurnos + " turnos.");
        }
    }

    public static int jugador() {
        Scanner sc = new Scanner(System.in);//hice un
        int[][][] tablero = new int[5][10][10];//creacion de un array tridimensional, seria 5 de profundo y un 10x10
        for (int i = 0; i < 5; i++)
                /*lo hago con un triple array ya que en cada plano sin contar con el primero que seria el tablero, colocaria un barco x plano
                así cuando en un plano esté lleno de 0 significa que no hay barco, y en el tablero significaría la victoria
            */
            for (int j = 0; j < 10; j++)
                for (int k = 0; k < 10; k++)
                    tablero[i][j][k] = 0;//lo recorremos y lo rellenamos de 0 que seria nuestra agua
        System.out.println("jugador 1, su turno");
        int tipobarco;
        int NB4 = 1;
        int NB3 = 1;
        int NB2 = 2;//cantidad de barcos
        int vuelta = 0;// turnos de colocación para ir poniendolo en planos
        do {
            System.out.println("tienes " + NB4 + " barco de 1x4, " + NB3 + " de 1x3 y " + NB2 + " de 1x2");
            System.out.println("1-colocar el barco 1x2");
            System.out.println("2-colocar el barco 1x3");
            System.out.println("3-colocar el barco 1x4");
            tipobarco = sc.nextInt();//seleccion del tipo de barco
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
                    continue;//vuelve a empezar el bucle
            }
            // ahora vamos por si ponen barcos de más, osea que el valor de los barcos sea <0
            if (NB2 < 0) {
                NB2 = 0;//ya que ahora seria un -1 lo igualo a 0 para volver a dale su valor
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
            vuelta++;//contador de vueltas, osea,barcos colocados
            meterbarco(tablero, tipobarco + 1, vuelta);// +1 ya que las opciones eran 1,2,3 para barcos de tamaño 2,3,4
        }
        while (NB4 > 0 || NB3 > 0 || NB2 > 0);//se repite hasta que los barcos se acaben
        for (int i = 0; i < tablero[0].length; i++) {//decoracion del tablero
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("  +---------------------+");
        int filas = 0;
        for (int[] ints : tablero[0]) {
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
        String[][] tablero2 = new String[10][10];//tablero del que dispara
        for (int i = 0; i < tablero2.length; i++) {
            for (int j = 0; j < tablero2[i].length; j++) {
                tablero2[i][j] = "?";//rellenamos el tablero con "?"
            }
        }
        return disparobarco(tablero2, tablero);//devolvemos el valor que nos da "disparobarco" que serian los turnos que hemos tardado
    }

    /*

espacio solo para separar funciones

     */
    public static int[][][] meterbarco(int[][][] tablero, int tamaño_barco, int vuelta) {//va cambiendo el tablero, metiendo los barcos
        Scanner sc = new Scanner(System.in);
        int tamaño, tamaño_inclinado, guardar_columna1;
        boolean error;
        int cambio, fila1, fila2, columna1, columna2;
        System.out.println("este es tu tablero:");
        System.out.print("    ");
        for (int i = 0; i < tablero[0].length; i++) {//mostramos el tablero
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("  +---------------------+");
        int filas = 0;
        for (int[] ints : tablero[0]) {
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
            tamaño_inclinado = fila2 - fila1 + 1;//si es inclinado las columnas y filas 1, y las 2, tendran el mismo valor
            tamaño = (fila2 - fila1 + columna2 - columna1) + 1;//esto es si es recto

            if ((tamaño != tamaño_barco) && (tamaño_inclinado != tamaño_barco)) {
                error = true;//error de tamaño de barco
                System.out.println("las coordenadas tienen un tamaño diferente al barco.");
                System.out.println("intentelo de nuevo");
                continue;
            }
            if (fila1 == fila2 || columna2 == columna1) {
                for (int i = fila1; i <= fila2; i++) {
                    for (int j = columna1; j <= columna2; j++) {
                        if (tablero[0][i][j] != 0) {
                            error = true;//error de casilla ocupada
                            System.out.println("Se estaba construyendo el barco pero choco con otro barco en las coordenadas: " + i + " " + j);
                        }
                    }
                }
                if (error) continue;
                for (int i = fila1; i <= fila2; i++) {
                    for (int j = columna1; j <= columna2; j++) {
                        tablero[0][i][j] = tamaño_barco;//colocamos el barco recto
                        tablero[vuelta][i][j] = tamaño_barco;
                    }
                }
            } else {
                guardar_columna1 = columna1;
                for (int i = fila1; i <= fila2; i++) {
                    if (tablero[0][i][columna1] != 0) {
                        error = true;//error de casilla ocupada
                        System.out.println("Se estaba construyendo el barco pero choco con otro barco en las coordenadas: " + i + " " + columna1);
                    }
                    columna1++;
                }
                if (error) continue;
                columna1 = guardar_columna1;//me gustaria mas utilizar en el bucle de abajo esta variable, pero lo pongo asi xq queda mas claro
                for (int i = fila1; i <= fila2; i++) {
                    tablero[0][i][columna1] = tamaño_barco;//colocamos el barco en diagonal
                    tablero[vuelta][i][columna1] = tamaño_barco;
                    columna1++;
                }
            }
        }
        while (error);
        return tablero;//sacamos el tablero como valor
    }

    /*

espacio solo para separar funciones

     */
    public static int disparobarco(String[][] tablero2, int[][][] tablero) {//el turno del que dispara
        boolean hundido;
        boolean tablerocompleto1boolean=false;
        boolean tablerocompleto2boolean=false;
        boolean tablerocompleto3boolean=false;
        int turno = 0;
        int tablerocompleto1 = 5;
        int tablerocompleto2 = 5;
        int tablerocompleto3 = 5;
        boolean win = false;
        Scanner sc = new Scanner(System.in);
        while (!win) {// se seguira jugando hasta que gane
            turno++;//se van contando los turnos
            win = true;
            System.out.println("este es tu tablero:");
            System.out.print("    ");
            for (int i = 0; i < tablero2[0].length; i++) {//mostramos el tablero
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
            int columna = sc.nextInt();//coordenadas de disparo
            if (tablero[0][fila][columna] < 0) {
                System.out.println("volviste a disparar en un sitio donde ya habias disparado");
                win = false;
            }
            else {
                if (tablero[0][fila][columna] == 0) {//si no hay barcos significa que en array hay un "0" q representa el agua
                    System.out.println("agua");
                    tablero2[fila][columna] = "O";//ponemos en el tablero que ve el simbolo que elegimos para agua
                    win=false;
                } else {
                    System.out.println("tocado");//si es cualquier otro numero significa q es un barco
                    tablero2[fila][columna] = "X";//lo represento ene l tablero con una "X"
                    for (int i = 0; i < 5; i++) {
                        tablero[i][fila][columna] = -1;//ponemos -1 para indicar que ya disparamos ahí
                    }
                    for (int i = 1; i < 5; i++) {
                        hundido = true;
                        for (int j = 0; j < 10; j++) {
                            for (int k = 0; k < 10; k++) {
                                if (i == tablerocompleto1 || i == tablerocompleto2 || i == tablerocompleto3) continue;//nos saltamos las capas completas
                                if (tablero[i][k][j]>0) hundido=false;
                                //revisamos toda la capa a ver si hay algun valor >0, que serian los barcos, si no hay significa que esta hundido
                                if (tablero[0][k][j]>0) win=false;
                                //lo mismo pero con el 1er nivel del tablero que serian donde estan todos los abrcos, si no hay barcos es una victoria
                            }
                        }
                        if (hundido&&!(tablerocompleto1boolean)) {//vamos indicando que capas estan completas para no volver a hacerlas y que nos digan hundido
                            System.out.println("HUNDIDO, 3 barcos restantes");
                            tablerocompleto1 = i;
                            tablerocompleto1boolean=true;
                            hundido=false;
                        }
                        if (hundido&&!(tablerocompleto2boolean)) {
                            System.out.println("HUNDIDO, 2 barcos restantes");
                            tablerocompleto2 = i;
                            tablerocompleto2boolean=true;
                            hundido=false;
                        }
                        if (hundido&&!(tablerocompleto3boolean)) {
                            System.out.println("HUNDIDO, 1 barco restante");
                            tablerocompleto3 = i;
                            tablerocompleto3boolean=true;
                        }
                    }
                    if (win) { //mensaje de victoria
                        System.out.println("HUNDIDO, no quedan barcos");
                        System.out.println("GANASTE");
                        System.out.println("tardaste " + turno + " turnos");
                    }
                }
            }
        }
        return turno;//regresamos el numero de turnos que tardo el jugador
    }
}