package boletinIDK;

import java.util.Scanner;

public class ternario
{
    public static void main(String[] args) {
        System.out.println("nombre de las 2 personas: ");
            int peso1,peso2,pesado;
            String nombre1,nombre2,ppesado;

            Scanner sc = new Scanner(System.in);
            nombre1= sc.next();
            nombre2= sc.next();
            System.out.println("peso de las 2 personas: ");
            peso1= sc.nextInt();
            peso2= sc.nextInt();

            pesado= (peso1>peso2)?peso1:peso2;
            ppesado= (peso1>peso2)?nombre1:nombre2;

            System.out.println("la persona mas pesada es " + ppesado + " con un peso de: " + pesado + ".");
    }
}
