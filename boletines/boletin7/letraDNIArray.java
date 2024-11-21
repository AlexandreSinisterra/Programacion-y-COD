package boletin7;

import java.util.Scanner;
public class letraDNIArray {
    public static void main (String []args) {//queremos que salga la letra que corresponde al numero
        char[] lDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};//almacenamos las letras, la posicion = numero
        System.out.println("Dime el número del DNI y te indico que letra le corresponde: ");
        Scanner sc = new Scanner(System.in);
        int nDNI = sc.nextInt();;
        int resto = nDNI % 23; //hacemos el resto tal y como nos indica el enunciado
        System.out.println(lDNI[resto]);//el resto es igual al numero, es decir, a la posicion
    }
}
