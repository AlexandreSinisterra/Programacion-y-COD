package boletin7;

import java.util.Scanner;

public class busquedaArray {
    public static void main (String []args) {
        char[] lDNI = {1,2,3,4,5,6,7,8,9,10};
        boolean si = false;//por defecto esta en falso, asi que el programa deberia poner -1 salvo que introduzcamos uno correcto
        System.out.println("Dime un numero y te digo la posicion si está, si no está pondré -1: ");
        Scanner sc = new Scanner(System.in);
        int nDNI = sc.nextInt();
        for (int i = 0; i < lDNI.length; i++) {
            if (lDNI[i]==nDNI){
                System.out.println("su posicion es el: "+i);
                si=true;
                break;
            }
        }
        if(si==false)
        System.out.println("-1");
    }

}
