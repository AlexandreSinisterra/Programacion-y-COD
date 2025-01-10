package progra.boletines.boletinIDK;

import java.util.Scanner;
class num {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un número del 0 al 100:"); //Pedimos al usuario que introduzca un numero del 0 al 100
        int numero = entradaTeclado.nextInt();

        if (numero >= 0 && numero <= 100) {
            System.out.println("Has introducido el número: " + num(numero));
        } else {
            System.out.println("El número introducido no está entre 0 y 100.");
        }

        entradaTeclado.close();
//Preguntamos si el numero es mayor o igual a 0 o menor o igual a 100 que realize el programa, si el numero es contrario a estos no hara el programa
    }

    static String num(int numero) {//con esto calculamos el string progra.boletines.boletinIDK.num(numero), cuando lo calculamos volvemos arriba y sale por pantalla
        String[] unidades = { //elige el valor de las unidades
                "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
        };

        String[] decenas = { //elige el valor de las decenas
                "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
        };

        if (numero < 20) {
            return unidades[numero]; //volverá ya que ya tiene el valor de progra.boletines.boletinIDK.num(numero)
        } else if (numero < 30) {
            return (numero == 20) ? "veinte" : "veinti" + unidades[numero - 20];  //progra.boletines.boletinIDK.num(numero) puede tomar esos 2 valores
            //cuando ponemos unidades[numero] toma el valor en el array de la posicion q tiene [numero], en este caso se suma al veinti
        } else {
            int unidad = numero % 10;
            int decena = numero / 10;
            return decenas[decena] + (unidad != 0 ? " y " + unidades[unidad] : "");
            //con las decenas ocurre lo mismo que las unidades
        }
    }
}
