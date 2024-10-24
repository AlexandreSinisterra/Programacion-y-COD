package boletin5;

import java.util.Scanner;
public class numerosgrupo10 {
    public static void main(String[] args) {
        int numero;
        int negativo=0; int positivo=0; int cero=0;
        System.out.println("introduce 10 numeros enteros: ");
        for(int i=0; i<10; i++)
        {
            Scanner sc = new Scanner(System.in);
            numero= sc.nextInt();
            if (numero<0)negativo++;
            if (numero>0)positivo++;
            if (numero==0) cero++;
        }
        System.out.println("hay " + positivo + " numeros positivos, " + negativo + " numeros negativos y " + cero + " ceros.");
    }
}
