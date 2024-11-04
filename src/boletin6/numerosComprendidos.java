package boletin6;

import java.util.Scanner;
public class numerosComprendidos {
    public static void main(String[] args) {
        System.out.println("dime 2 numeros y te digo cuales hay de por medio: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        numerosComprendidos (a,b);
    }
    static void numerosComprendidos(int n1, int n2) {
        if (n1 > n2) {
            int aux = n1;
            n1=n2;
            n2=aux;
        }
        for(int i=n1+1;i<n2;i++)
        {
            System.out.println(i);
        }
    }
    static void numerosComprendidos(double n1, double n2){
        int n1Int=(int)Math.round(n1);
        int n2Int=(int)Math.round(n2);
        numerosComprendidos(n1Int,n2Int);
    }
}
