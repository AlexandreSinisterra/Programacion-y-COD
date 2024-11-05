package boletin6;

import java.util.Scanner;//en trabajo

public class cuboFuncion {
    public static void main(String[] args) {
        System.out.println("dime que quieres saber,el volumen(1) o el área(2) del cubo: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
            System.out.println("dime el lado: ");
        int lado = sc.nextInt();
        sc.close();
            volumen(a, lado);
            area(a, lado);
    }
    static void volumen (1,int lado){
      int volumen=lado^3;
      System.out.println("el volumen del cubo es de: "+volumen);
    }
    static void area (2, int lado){
        int area=lado^2;
        System.out.println("el area del cubo es de: "+area);
    }

}
