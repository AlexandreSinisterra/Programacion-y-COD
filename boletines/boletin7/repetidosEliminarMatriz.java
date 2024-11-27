package boletin7;

import java.util.Random;
public class repetidosEliminarMatriz {
    public static void main (String []args){
        int[] notas = new int[30];
        Random numero_random = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = numero_random.nextInt(10) + 0;
        }
        int vueltas=0;
        int longitud=notas.length;
        int repeticiones=-1;
        boolean primer_5=false;
        for (int contenido:notas){
            vueltas++;
            for (int i=vueltas;i<notas.length; i++) {
                if (contenido==notas[i]) {
                        notas[i]= 5;
                }
            }
            if (contenido==5){
                repeticiones++;
            }
        }
        longitud-=repeticiones;
        int[] norepetir = new int[longitud];
            for (int i=0,posicion=0; i<notas.length;i++,posicion++){
                if(primer_5==false) {
                    norepetir[posicion] = notas[i];
                    if (notas[i]==5) primer_5=true;
                }
                else{
                    if (notas[i]==5) posicion--;
                    else norepetir[posicion] = notas[i];
                }
            }
        for (int contenido:norepetir)
            System.out.println(contenido);
    }
}
