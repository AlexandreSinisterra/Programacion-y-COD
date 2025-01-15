package progra.ejemplos_explicaciones;

public class colorestring {
    public static void main(String[]args){
        String str = "Hola, mundo!";char[] charArray = str.toCharArray();
        // Códigos ANSI para colores
        String[] colors = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[0m"};

        for (int i = 0; i < charArray.length; i++) {

            System.out.print(colors[i % colors.length] + charArray[i] + "\u001B[0m"); // Cambiar de color

        }
    }
}
