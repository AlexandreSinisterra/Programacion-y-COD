package boletin6;

import java.util.Scanner;

public class potenciaRecursiva {
    public static void main(String[] args) {
        System.out.println("dime la base y la potencia respectivamente y te digo el resultado: ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int potencia = sc.nextInt();
        sc.close();
        total (base,potencia);//calculamos la potencia
        System.out.println("eel resultado es: "+total (base,potencia));
    }
    static int total(int n1, int n2) {
        int resto;
        if (n2 == 0) resto = 1;//esto es por si el exponente que introducimos es 0
        else resto=n1*total(n1,n2 - 1);//se iran restanto 1 a al exponente y multiplicando por la base hasta que sea 0
        return resto;
    }
}
