package boletin8;

import java.util.Scanner;

public class puntos {
    public static String imprimir(String cad) {
        String pedazo = "";
        int tam = cad.length();
        for (int i=0;i<tam; i++) {
            if (i%3==0&&i!=0) pedazo = pedazo + ".";
            pedazo = pedazo + cad.charAt(i);
        }
        return pedazo;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String cadea = sc.next();
        System.out.println(imprimir(cadea));
    }
}
