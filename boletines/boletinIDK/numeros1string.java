package boletinIDK;

import java.util.Scanner;
public class numeros1string {
    public static void main(String[] args) {
        System.out.println("introduce tu nota: ");
        int n1;
        Scanner sc = new Scanner(System.in);
        n1= sc.nextInt();
        sc.close();
        int unidades = n1%10;
        int decenas = (n1-unidades)/10;
        String dd="a";
        if (n1<16&&10<n1) {
            switch (n1) {
                case 11:
                    System.out.println("once");
                    break;
                case 12:
                    System.out.println("doce");
                    break;
                case 13:
                    System.out.println("trece");
                    break;
                case 14:
                    System.out.println("catorce");
                    break;
                case 15:
                    System.out.println("quince");
                    break;

            }
        }
        else {
            switch (decenas) {
                case 0:
                    dd=" ";
                    break;
                case 1:
                    dd="diez";
                    break;
                case 2:
                    dd="veinte";
                    break;
                case 3:
                    dd="treinta";
                    break;
                case 4:
                    dd="cuarenta";
                    break;
                case 5:
                    dd="cincuenta";
                    break;
                case 6:
                    dd="sesenta";
                    break;
                case 7:
                    dd="setenta";
                    break;
                case 8:
                    dd="ochenta";
                    break;
                case 9:
                    dd="noventa";
                    break;
            }
                if(n1>15&&n1<20){
                    System.out.printf(dd + "i");
                }
                else {
                    if(unidades==0){
                        System.out.printf(dd);
                    }
                    else {
                        if(n1==0){
                            System.out.printf("zero");
                        }
                        else{
                            if(n1>15&&n1<20){
                                System.out.printf("veinti");
                            }
                            else {
                                if(n1%10==0) {System.out.printf(dd);}
                                else {
                                    System.out.printf(dd + " y ");
                                }
                        }
                    }
                }
            }
            switch (unidades) {
                case 0:
                    dd = " ";
                    break;
                case 1:
                    dd = "uno";
                    break;
                case 2:
                    dd = "dos";
                    break;
                case 3:
                    dd = "tres";
                    break;
                case 4:
                    dd = "cuatro";
                    break;
                case 5:
                    dd = "cinco";
                    break;
                case 6:
                    dd = "seis";
                    break;
                case 7:
                    dd = "siete";
                    break;
                case 8:
                    dd = "ocho";
                    break;
                case 9:
                    dd = "nueve";
                    break;
            }
                System.out.printf(dd);
        }
    }
}

