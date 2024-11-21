package boletin7;

import java.util.Scanner;

/**
 * El programa está diseñado para que elijas entre 3 tipos de array, elijas la longitud y sus valores
 * ademas de que la busqueda del valor solo te pondrá el 1ero si hay repetidos, ya que está hecho para que de el menor
 * numero de vueltas, por eso puse el break, para que no tenga que recorrer todo el array, en caso de que se quieran
 * poner varios valores iguales habría que sacar los breakes o a lo mejor incluir una opcion donde le preguntas si se va
 * a repetir o no, con un if else por ejemplo, para que te lleve al bucle sin repeticiones u otro que recorra el array completo
 * y de varios valores
 */
public class busquedaArrayVariable {

    public static void main(String[] args) {
        System.out.println("(las posiciones empiezan por el 1)Pulsa 1 si quieres un array de string(cadenas), 2 para char(1caracter) y 3 para int(): ");
        Scanner sc = new Scanner(System.in);
        int decision = sc.nextInt();
        switch (decision) {//lo hice con un case y cada uno de ellos hace un tipo de array diferente
            case 1://el codigo luego va a ser igual que el que tengo llamado como busquedaArray pero con la diferencia que podemos decidir la longitud del array y los valores
                cadena();
                break;
            case 2:
                caracter();
                break;
            case 3:
                nEntero();
                break;
            default:
                System.out.println("saliendo del programa, no has introducido inguna de las 3 opciones");
        }
    }

    static void cadena() {
        boolean si = false;
        System.out.println("Dime la longitud del array: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        String[] cadenas = new String[cantidad];//simplemente en vez de colocar un numero como canttidad ponemos una variable que representa un numero
        System.out.println("ahora ve diciendome 1 por 1 los valores: ");
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = sc.nextLine();//hacemos un bucle para ir metiendo los valores 1 por 1
        }
        System.out.println("ahora procedammos con la busqueda, si aparece te digo la posicion, si no pongo -1: ");
        String busqueda = sc.nextLine();
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i] == busqueda) {
                System.out.println("su posicion es el: " + i);
                si = true;
                break;
            }
        }
        if (si == false)
            System.out.println("-1");
    }

    static void caracter() {
        boolean si = false;
        System.out.println("Dime la longitud del array: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        char[] caracteres = new char[cantidad];
        System.out.println("ahora ve diciendome 1 por 1 los valores: ");
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = sc.next().charAt(0);//con esto solo leerá el 1er caracter a pesar de q pongamos una cadena
        }
        System.out.println("ahora procedammos con la busqueda, si aparece te digo la posicion, si no pongo -1: ");
        char busqueda = sc.next().charAt(0);
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == busqueda) {
                System.out.println("su posicion es el: " + i);
                si = true;
                break;
            }
        }
        if (si == false)
            System.out.println("-1");
    }

    static void nEntero() {
        boolean si = false;
        System.out.println("Dime la longitud del array: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int[] nEntero = new int[cantidad];
        System.out.println("ahora ve diciendome 1 por 1 los valores: ");
        for (int i = 0; i < nEntero.length; i++) {
            nEntero[i] = sc.nextInt();
        }
        System.out.println("ahora procedammos con la busqueda, si aparece te digo la posicion, si no pongo -1: ");
        int busqueda = sc.nextInt();
        for (int i = 0; i < nEntero.length; i++) {
            if (nEntero[i] == busqueda) {
                System.out.println("su posicion es el: " + i);
                si = true;
                break;
            }
        }
        if (si == false)
            System.out.println("-1");
    }
}
