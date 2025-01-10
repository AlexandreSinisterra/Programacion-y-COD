package progra.boletines.boletin5;

import java.util.Scanner;
public class tablademultiplicar {
    public static void main(String[] args) {
        int numero, n2;
        int seguir=1;
        int veces=1;
        System.out.println("dime un numero para que te muestre su tabla de multiplicar: ");
        Scanner sc = new Scanner(System.in);
        numero= sc.nextInt();
        while (seguir!=0){
            n2=veces*numero;
            veces++;
            System.out.println(n2);
            System.out.println("para seguir salir pulse 0, para seguir cualquier otro numero: ");
            seguir= sc.nextInt();
        }

    }
}
