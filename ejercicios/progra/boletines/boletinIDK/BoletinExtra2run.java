package progra.boletines.boletinIDK;

import java.util.Scanner;

    public class BoletinExtra2run {
        public static void main(String[] args) {
            System.out.println("2do ejercicio: ");
                System.out.println("dime tu temperatura en Celsius: ");
                    int celsius,fahrenheit,kelvin;
                        Scanner sc = new Scanner(System.in);
                        celsius= sc.nextInt();
                            kelvin=celsius+273;
                            fahrenheit=celsius*9/5+32;
                                System.out.println("su temperatura en kelvin es " + kelvin + " y en fahrenheit es " + fahrenheit);
            System.out.println("3er ejercicio: ");
                int billetes100, billetes20, billetes5, moedas1, total;
                System.out.println("dime cuantos billetes de 100,20,5 y monedas de 1€ tienes respectivamente: ");
                    billetes100= sc.nextInt();
                    billetes20= sc.nextInt();
                    billetes5= sc.nextInt();
                    moedas1= sc.nextInt();
                        total= billetes100*100 + billetes20*20 + billetes5*5 + moedas1;
                            System.out.println("el total de dinero es: " + total + "€");
            System.out.println("4to ejercicio: ");
                System.out.println("introduzca su cantidad total: ");
                    total= sc.nextInt();
                        billetes100=total/100;
                        billetes20=(total-billetes100*100)/20;
                        billetes5=(total-billetes100*100-billetes20*20)/5;
                        moedas1=total-billetes100*100-billetes20*20-billetes5*5;
                            System.out.println("su cantidad de billetes de 100,20,5 y moedas de 1 es de: " + billetes100 + ", " + billetes20 + ", " + billetes5 + " y " + moedas1 + " respectivamente");
            System.out.println("5to ejercicio: ");
                float soldo, ventas, kilometros, dias, soldoliquido;
                    System.out.println("dime tu soldo fixo, o total de ventas, kilometros recorridos e dias de desprazamento respectivamente: ");
                        soldo= sc.nextFloat();
                        ventas= sc.nextFloat();
                        kilometros= sc.nextFloat();
                        dias= sc.nextFloat();
                            soldoliquido= soldo + ventas*5/100 + kilometros*2 + dias*30;
                            soldoliquido= soldoliquido - soldoliquido*18/100 - 36;
                                System.out.println("su soldo líquido es de: " + soldoliquido + "€.");
                sc.close();
        }


    }


