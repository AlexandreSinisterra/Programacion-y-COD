package progra.boletines.boletin5;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int numero;
        int factorial=1;
        System.out.println("mete el numero del que quieras saber su Factorial: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        for (int i=1; i<=numero; i++)
        {
            factorial=factorial*i;
        }
        System.out.println("o Factorial do numero " + numero + " es de: " + factorial + ".");
    }
}
/*
static long factorialRecursivo(int n){
long res;
if(n==0)res=1;
else res= n * factorialRecursivo(n-1);
return res;
}
*/