package progra.boletines.boletin7;

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
        int primer_valor=notas[0];
        boolean primer_valor2=false;    
        for (int contenido:notas){
            vueltas++;
            for (int i=vueltas;i<notas.length; i++) {
                if (contenido==notas[i]) {
                        notas[i]= primer_valor;
                }
            }
            if (contenido==primer_valor){
                repeticiones++;
            }
        }
        longitud-=repeticiones;
        int[] norepetir = new int[longitud];
            for (int i=0,posicion=0; i<notas.length;i++,posicion++){
                if(primer_valor2==false) {
                    norepetir[posicion] = notas[i];
                    if (notas[i]==primer_valor) primer_valor2=true;
                }
                else{
                    if (notas[i]==primer_valor) posicion--;
                    else norepetir[posicion] = notas[i];
                }
            }
        for (int contenido:norepetir)
            System.out.println(contenido);
    }
}
