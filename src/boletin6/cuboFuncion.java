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
            if (a==1)
            volumen(lado);
            if (a==2)
            area(lado);
    }
    static void volumen (int lado){
      int volumen=lado*lado*lado;
      System.out.println("el volumen del cubo es de: "+volumen);
    }
    static void area (int lado){
        int area=lado*lado;
        System.out.println("el area del cubo es de: "+area);
    }

}
