package progra.examenes_progra.tercerExamen;

import java.util.Scanner;

public class tercerExamenFrases {
    public static void main(String[] args) {
        System.out.println("Escriba la frase:");
        Scanner sc = new Scanner(System.in);
        String cadea = sc.nextLine();
        System.out.println(fraseACamel(cadea));
    }

    public static String fraseACamel(String cadea) {
        int posicion = 0, longitud, principio = 0, vueltas = 0;
        boolean hay_espacios = true;
        String cadea2 = "", mayuscula = "", cadea3 = "", espacio = "";
        char letra;
        cadea = cadea.toLowerCase();
        hay_espacios = cadea.contains(" ");
        while (hay_espacios) {
            longitud = cadea.length();
            hay_espacios = cadea.contains(" ");
            posicion = cadea.indexOf(" ");
            if (posicion==-1){
                while (principio < longitud) {
                    if (vueltas == 0) {
                        letra = cadea.charAt(principio);
                        mayuscula = mayuscula + letra;
                        mayuscula = mayuscula.toUpperCase();
                        cadea2 = cadea2 + mayuscula;
                        mayuscula = "";
                    } else {
                        letra = cadea.charAt(principio);
                        cadea2 = cadea2 + letra;
                    }
                    vueltas++;
                    principio++;
                }
            }
            else {
                while (principio < posicion) {
                    if (vueltas == 0) {
                        letra = cadea.charAt(principio);
                        mayuscula = mayuscula + letra;
                        mayuscula = mayuscula.toUpperCase();
                        cadea2 = cadea2 + mayuscula;
                        mayuscula = "";
                    } else {
                        letra = cadea.charAt(principio);
                        cadea2 = cadea2 + letra;
                    }
                    vueltas++;
                    principio++;
                }
            }
            principio = 0;
            vueltas = 0;
            cadea = cadea.substring(cadea.indexOf(" ")+1, longitud);
        }
            return cadea2;

    }
}
