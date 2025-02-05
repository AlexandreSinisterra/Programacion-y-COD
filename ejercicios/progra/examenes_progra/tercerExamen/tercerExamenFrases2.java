package progra.examenes_progra.tercerExamen;

import java.util.Scanner;

public class tercerExamenFrases2 {
    public static void main(String[] args) {
        System.out.println("Escriba la frase:");
        Scanner sc = new Scanner(System.in);
        String cadea = sc.nextLine();
        System.out.println(nvocales(cadea));
    }

    public static int nvocales(String cadea) {
        int numero=0;
        String cadea2 = "", a="a",e="e",i="i",o="o",u="u";
        char letra;
        cadea = cadea.toLowerCase();
        int longitud=cadea.length();
        for (int j=0; j<longitud; j++){
            letra=cadea.charAt(j);
            cadea2=cadea2+letra;
            if(cadea2.equals(a)||cadea2.equals(e)||cadea2.equals(i)||cadea2.equals(o)||cadea2.equals(u)){
                numero++;
            }
            cadea2="";
        }
        return numero;

    }
}