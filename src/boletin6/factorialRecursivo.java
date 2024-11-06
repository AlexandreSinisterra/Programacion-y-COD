package boletin6;

import java.util.Scanner;

public class factorialRecursivo {
    public static void main(String[] args) {
        System.out.println("dime un numero y te digo su factorial: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        sc.close();
            factorial (n1);//calculamos el factorial
            System.out.println("el factorial de "+n1+" es: "+factorial(n1));
    }
    static int factorial(int numero) {
        int resto;
        if (numero == 0) resto = 1;//esto es por si el numero que introducimos es 0
        else resto=numero*factorial(numero - 1);//se iran restanto 1 al numero y multiplicandose como un bucle
        return resto;
    }
}
