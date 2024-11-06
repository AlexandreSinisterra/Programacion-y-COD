package boletin6;

import java.util.Scanner;

public class fibonacciRecursivo {
    public static void main(String[] args) {
        System.out.println("dime cuantos numeros de fibonacci quieres: ");
        Scanner sc = new Scanner(System.in);
        int numeros = sc.nextInt();//con esto tenemos el numero maximo de numeros que queremos
        sc.close();
        int a=1;
        int b=1;//estas 2 variables seran las que nos calculen los numeros
        int n3=numeros;//es simplemente para que en la 3era vuelta empiece a calcular los numeros, ya que son != a 1
        System.out.println("el resultado es: ");
        fibonacci (numeros,a,n3,b);
    }
    static void fibonacci(int n1,int n2,int n3,int n4) {
        if(n3!=n1&&(n3!=n1+1)){
            n2=n2+n4;//aqui sumaremos el numero anterior a n2 de la secuencia que lo metemos a n4
            n4=n2-n4;//si ponemos que el numero siguiente(n2) sea n2+n4, pues el anterior es simplemente n2-n4
        }
        if (n1 != 0) {
            System.out.println(n2+",");
            fibonacci(n1 - 1,n2,n3,n4); //vamos restando 1 a la cantidad de numeros que queremos, cuando llegue a 0 se terminara el recursivo
        }
    }
}
