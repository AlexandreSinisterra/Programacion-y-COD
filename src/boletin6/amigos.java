package boletin6;

import java.util.Scanner;

public class amigos {
    public static void main(String[] args) {
        System.out.println("dime 2 numeros enteros positivos y te digo si son amigos: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        amigosdea (a);
        amigosdeb (b);
        if (amigosdea (a)==b||amigosdeb(b)==a)
            System.out.println(a+" y "+b+" son amigos.");
    }
    static int amigosdea(int n1){
        int amigos=0;
        for (int i=1; i<n1; i++)
        {
            if (n1%i==0) amigos=amigos+i;
        }
        return amigos;
    }
    static int amigosdeb(int n2){
        int amigos=0;
        for (int i=1; i<n2; i++)
        {
            if (n2%i==0) amigos=amigos+i;
        }
        return amigos;
    }
}
