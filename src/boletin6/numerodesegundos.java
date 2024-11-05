package boletin6;

import java.util.Scanner;

public class numerodesegundos {
    public static void main(String[] args) {
        System.out.println("dime cuantos días, horas y minutos respectivamente, te dire cuantos segundos son");
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        System.out.println("dime el lado: ");
        int lado = sc.nextInt();
        sc.close();
        if (dias!=0)
            volumen(lado);
        if (minutos!=0)
            area(lado);
        if (segundos!=0)
            System.out.println("elegiste ninguno de los 2");

    }
}
