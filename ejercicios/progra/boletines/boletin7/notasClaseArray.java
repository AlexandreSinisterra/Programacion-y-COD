package progra.boletines.boletin7;

import java.util.Random;
public class notasClaseArray {
    public static void main (String []args){
        int aprobados=0;
        int suspendidos=0;
        int avg=0;
        int cantidade=0;
        int maximo=0;
        int[] notas = new int[30];
        Random numero_random = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = numero_random.nextInt(10) + 0;//genera un numero entre 1 y 50
        }
        for (int n1:notas){
            if (n1 >= 5) aprobados++;
            else suspendidos++;
            avg+=n1;
            cantidade++;

            if (maximo < n1) {
                maximo = n1;
            }
        }
        avg=avg/cantidade;
        System.out.println("la cantidad de alumnos suspendidos es de: "+suspendidos);
        System.out.println("la cantidad de alumnos aprobados es de: "+aprobados);
        System.out.println("la nota media es de: "+avg);
        System.out.println("la nota máxima es de: "+maximo);
    }
}
