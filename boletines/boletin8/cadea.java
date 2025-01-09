package boletin8;

import java.util.Scanner;

public class cadea {
    public static String imprimeUltimosCaracteres(String cad) {
        String pedazo= "";
        int tam = cad.length();
        pedazo = pedazo + cad.charAt(tam-3);
        pedazo = pedazo + cad.charAt(tam-2);
        pedazo = pedazo + cad.charAt(tam-1);
        return pedazo;
    }
    public static String imprimeUltimosCaracteres2(String cad) {
        int tam = cad.length();
        return cad.substring(tam-3);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String cadea = sc.next();
        System.out.println(imprimeUltimosCaracteres(cadea));
        System.out.println(imprimeUltimosCaracteres2(cadea));
    }
}
