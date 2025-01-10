package progra.ejemplos_explicaciones;

import java.util.Scanner;

public class unCafe {
    public static void main(String[] args) {
        Double dinero, vuelta;
        Double precio_cafe = 0.50;
        Double precio_te = 0.70;
        Double precio_chocolate = 0.90;
        Double precio=0.00;
        Double precio_azucar=1.20;
        System.out.println("que producto quieres?:");
        System.out.println("1-cafe");
        System.out.println("2-te");
        System.out.println("3-chocolate");
        Scanner sc = new Scanner(System.in);
        int eleccion = sc.nextInt();
        while (eleccion<1||eleccion>3){
            System.out.println("no has elegido ninguna de las opciones, vuelve a introducir un numero: ");
            System.out.println("que producto quieres?:");
            System.out.println("1-cafe");
            System.out.println("2-te");
            System.out.println("3-chocolate");
            eleccion = sc.nextInt();
        }
        System.out.println("quieres azuxar? 1.20€ por cada: ");
        System.out.println("1-si");
        System.out.println("2-no");
        int azucar = sc.nextInt();
        while(azucar>2||azucar<1) {
            System.out.println("no has pulsado ninguna de las elecciones: ");
            System.out.println("1-si");
            System.out.println("2-no");
            azucar = sc.nextInt();
        }
        if (azucar==1){
            System.out.println("cuanto quieres?: ");
            int cantidad= sc.nextInt();
            while (cantidad<0){
                System.out.println("es un numero negativo, pon positivos:");
                cantidad= sc.nextInt();
            }
            precio=precio_azucar*cantidad;
        }
        switch (eleccion) {
            case 1:
                precio+=precio_cafe;
                System.out.println("cuesta " + precio+", introduce el dinero.");
                dinero = sc.nextDouble();
                vuelta = dinero - precio;
                while (vuelta < 0) {
                    System.out.println("no es suficiente, introduce mas.");
                    dinero = sc.nextDouble();
                    vuelta = dinero + vuelta;
                }
                System.out.println("gracias por la compra, su vuelta es de: " + vuelta);
                break;
            case 2:
                precio+=precio_te;
                System.out.println("cuesta " + precio+", introduce el dinero.");
                dinero = sc.nextDouble();
                vuelta = dinero - precio;
                while (vuelta < 0) {
                    System.out.println("no es suficiente, introduce mas.");
                    dinero = sc.nextDouble();
                    vuelta = dinero + vuelta;
                }
                System.out.println("gracias por la compra, su vuelta es de: " + vuelta);
                break;
            case 3:
                precio+=precio_chocolate;
                System.out.println("cuesta " + precio+", introduce el dinero.");
                dinero = sc.nextDouble();
                vuelta = dinero - precio;
                while (vuelta < 0) {
                    System.out.println("no es suficiente, introduce mas.");
                    dinero = sc.nextDouble();
                    vuelta = dinero + vuelta;
                }
                System.out.println("gracias por la compra, su vuelta es de: " + vuelta);
        }
        sc.close();
    }
}
