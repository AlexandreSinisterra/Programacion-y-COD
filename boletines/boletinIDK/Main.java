package boletinIDK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1er ejercicio: ");
            System.out.println("introduce un numero: ");
                int n1;
                Scanner sc = new Scanner(System.in);
                    n1= sc.nextInt();

                if(n1>0)
                 {
                 System.out.println("es positivo");
                 }

        System.out.println("2do ejercicio: ");
            System.out.println("introduce 2 boletinIDK.numeros: ");
                short n2,n3;

                    n2= sc.nextShort();
                    n3= sc.nextShort();

            if (n1>=n2)
        {
                int resta = n2 - n3;
                System.out.println("su resta es: " + resta);

        }   else {
                int suma = n2 + n3;
                System.out.println("su suma es: " + suma);
            }

        System.out.println("3do ejercicio: ");
            System.out.println("dime un numero: ");
                int n4;

                    n4= sc.nextInt();

            if (n4==0)
            {
                System.out.println("dime un numero: ");
            }
        sc.close();
    }
}