package ejemplos_explicaciones;

import java.sql.SQLOutput;

public class pilaPuntero {
    public static void main (String [] args){
        int [] pila;
        int cabeza=-1;
        pila = new int[5];
        cabeza = apilar (pila,cabeza,5);//valores pila
        cabeza = apilar (pila,cabeza,3);
        cabeza = apilar (pila,cabeza,0);
        cabeza = apilar (pila,cabeza,23);
        cabeza = apilar (pila,cabeza,453);
        cabeza = apilar (pila,cabeza,67);
        leer(pila,cabeza);
    }
    public static int apilar (int [] pila, int cab, int num){//introducir valores
        if (cab < pila.length-1){
            pila[cab+1] = num;
            cab++;
            System.out.println("el numero "+num+" ha sido almacenado");
        }
        else{
            System.out.println("A pila esta desbordada, non se almacena o numero");
        }
        return cab;
    }
    public static void leer(int [] pila, int cab){//leer pila
        for(int i=0; i<cab+1;i++)
            System.out.println(pila[i]);
    }
}
