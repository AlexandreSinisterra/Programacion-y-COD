package boletinIDK;

import java.util.Scanner;
public class numerosif {
    public static void main(String[] args) {
        System.out.println("introduce tu nota: ");
        int n1;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        sc.close();
        int unidades = n1 % 10;
        String uu = "a";
        if (n1 < 16 & 10 < n1) {
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
        } else {
            switch (unidades) {
                case 0:
                    uu = " ";
                    break;
                case 1:
                    uu = "uno";
                    break;
                case 2:
                    uu = "dos";
                    break;
                case 3:
                    uu = "tres";
                    break;
                case 4:
                    uu = "cuatro";
                    break;
                case 5:
                    uu = "cinco";
                    break;
                case 6:
                    uu = "seis";
                    break;
                case 7:
                    uu = "siete";
                    break;
                case 8:
                    uu = "ocho";
                    break;
                case 9:
                    uu = "nueve";
                    break;
            }

            if (n1 > 0 && n1 < 10) {
                System.out.printf(uu);
            } else {
                if (n1 > 15 && n1 < 20) {
                    System.out.printf("diezi" + uu);
                } else {
                    if (n1 > 89) {
                        if(n1!=90){uu = " y " + uu;}
                        System.out.printf("noventa" + uu);
                    } else {
                        if (n1 > 79) {
                            if(n1!=80){uu = " y " + uu;}
                            System.out.printf("ochenta" + uu);
                        } else {
                            if (n1 > 69) {
                                if(n1!=70){uu = " y " + uu;}
                                System.out.printf("setenta" + uu);
                            } else {
                                if (n1 > 59) {
                                    if(n1!=60){uu = " y " + uu;}
                                    System.out.printf("sesenta" + uu);
                                } else {
                                    if (n1 > 49) {
                                        if(n1!=50){uu = " y " + uu;}
                                        System.out.printf("cincuenta" + uu);
                                    } else {
                                        if (n1 > 39) {
                                            if(n1!=40){uu = " y " + uu;}
                                            System.out.printf("cuarenta" + uu);
                                        } else {
                                            if (n1 > 29) {
                                                if(n1!=30){uu = " y " + uu;}
                                                System.out.printf("treinta" + uu);
                                            } else {
                                                if (n1 > 20) {
                                                    System.out.printf("veinti" + uu);
                                                } else {
                                                    if (n1 > 19) {
                                                        System.out.printf("veinte");
                                                    } else {
                                                        System.out.printf("zero");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
