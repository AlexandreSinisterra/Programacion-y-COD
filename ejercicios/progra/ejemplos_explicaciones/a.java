package progra.ejemplos_explicaciones;

public class a {
    public static void main(String args[]){
        char caracter;
        caracter = 'a';
        caracter = 9825;//hexadecimal b
        caracter = '\u2661';//unicode a
        caracter = 936;//hexadecimal letra griega
        caracter = '\u03A9';
        System.out.println(caracter);
        for (int i = 97; i<123; i++){
            caracter = (char) i;
            System.out.println(caracter);
        }
    }
}
