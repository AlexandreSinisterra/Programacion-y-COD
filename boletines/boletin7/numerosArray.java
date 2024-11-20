package boletin7;
import java.util.Random;

public class numerosArray {
    public static void main (String []args){
        int[] numeros = new int[5];
        Random numero_random = new Random();//es como cuando creamos un new scaner, pero con lo random
        System.out.println("del derecho: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numero_random.nextInt(50) + 1;//genera un numero entre 1 y 50
            System.out.println(numeros[i]);
        }
        System.out.println("del revés: ");
        for (int i=numeros.length-1;i>=0;i=i-1){
            System.out.println(numeros[i]);
        }
    }
}
