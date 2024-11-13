package boletinIDK;

import java.util.Scanner;
public class medianotas {
    public static void main(String[] args) {
        int nota,suma,numero,media;
        suma=0;
        numero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu nota para la media, para salir -1: ");
        nota= sc.nextInt();
            while(nota!=-1)
            {
                suma=suma+nota;
                numero++;
                System.out.println("introduce la siguiente nota, para salir -1: ");
                nota= sc.nextInt();
            }
            media=suma/numero;
            System.out.println("su media es de: " + media);
    }
}
