package progra.boletines.boletin6;

import java.util.Scanner;

public class fibonacciRecursivo {
    public static void main(String[] args) {
        System.out.println("Dime cuántos números de Fibonacci quieres: ");
        Scanner sc = new Scanner(System.in);
        int numeros = sc.nextInt();  // cantidad de progra.boletines.boletinIDK.numeros de fibonacci
        sc.close();
        System.out.println("El resultado es: ");
        fibonacci(numeros, 0, 1);  // Comenzamos con 0 y 1, ya que son los dos primeros números de la secuencia
    }
    static void fibonacci(int n, long n1, long n2) {
        if (n != 0) {
            System.out.print(n1 + ", ");  // progra.boletines.boletinIDK.numeros
            // la secuencia de fibonacci va aumentando sumando el numero anterior, asi que hariamos n1(numero actual) + n2(numero anterior)
            fibonacci(n - 1, n1 + n2, n1);
        }
    }
}
