package boletin7;

import java.util.Scanner;
import java.util.Random;
public class notasClaseArrayMejorado {
    public static void main (String []args){
        String nombre="";
        int longituddenombre;
        int aprobados=0;
        int suspendidos=0;
        int avg=0;
        int cantidade=0;
        int maximo=0;
        int n2=0;
        int[] notas = new int[30];
        String[] notasnome = new String[30];
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
        System.out.println("los nombres de los alumnos son: ");
        for (int i = 0; i < notasnome.length; i++) {
            longituddenombre = numero_random.nextInt(10) + 1;
            for (int j = 0; j < longituddenombre; j++) {
                nombre += (char) ('A' + (int) (Math.random() * 26));  // Genera una letra aleatoria de A a Z
            }
            notasnome[i] = nombre;
            System.out.printf(nombre+",");
            nombre="";
        }
        System.out.println(" ");
        System.out.println("la cantidad de alumnos suspendidos es de: "+suspendidos);
        System.out.println("y sus nombres son: ");
        for (int n1:notas){
            if (n1 < 5){
                System.out.println(notasnome[n2]);
            }
            n2++;
        }
        n2=0;
        System.out.println("la cantidad de alumnos aprobados es de: "+aprobados);
        System.out.println("y sus nombres son: ");
        for (int n1:notas){
            if (n1 >= 5){
                System.out.println(notasnome[n2]);
            }
            n2++;
        }
        System.out.println("la nota media es de: "+avg);
        System.out.println("la nota máxima es de: "+maximo);
        System.out.println("de que alumno quieres saber la nota?: ");
        Scanner sc = new Scanner(System.in);
        String alumno= sc.nextLine();
        for (int i = 0; i < notasnome.length; i++) {
            if (notasnome[i]==alumno) System.out.println(notas[i]);
        }
        System.out.println("las notas en prden son: ");
        for (int i = 0; i <= 10; i++) {
            for (int orden : notas) {
                if (i == orden) {
                    System.out.printf(orden+",");
                }
            }
        }
    }
}
