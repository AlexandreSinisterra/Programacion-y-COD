package progra.boletines.boletin5;

import java.util.Scanner;
public class arearectangulo {
    public static void main(String[] args) {
        int base,altura,area;
        System.out.println("dame la base de tu rectangulo: ");
        Scanner sc = new Scanner(System.in);
        base= sc.nextInt();
        while(base<0)
        {
            System.out.println("la base tiene que ser un numero positivo, vuelve a ponerlo: ");
            base= sc.nextInt();
        }
        System.out.println("ahora dame la altura de tu rectangulo: ");
        altura= sc.nextInt();
        while(altura<0)
        {
            System.out.println("la altura tiene que ser un numero positivo, vuelve a ponerlo: ");
            altura= sc.nextInt();
        }
        area=base*altura;
        System.out.println("El área del rectangulo es de: " +area);
    }
}
