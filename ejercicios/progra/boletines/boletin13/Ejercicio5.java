package progra.boletines.boletin13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> Enteros = new ArrayList<Integer>();
        int numeros = scanner.nextInt();
        while(numeros!=-1){
            Enteros.add(numeros);
            numeros = scanner.nextInt();

        }
        for (int i = 0; i < Enteros.size(); i++){
            if (i%2==0){
                // System.out.println(Enteros.get(i)100);;
                Enteros.set(i,Enteros.get(i)*100);
            }
        }
        System.out.println(Enteros);

    }
}