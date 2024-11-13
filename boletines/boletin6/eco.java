package boletin6;

import java.util.Scanner;
public class eco {
    public static void main(String[] args) {
        System.out.println("dime cuantos 'ecos' quieres: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        veceseco(a);
    }
        static void veceseco ( int n1){

            for (int i = 0; i < n1; i++) {
                System.out.println("Ecoo…");
            }
        }
    }