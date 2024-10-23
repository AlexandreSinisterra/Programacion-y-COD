import java.util.Scanner;
public class numeros {
    public static void main(String[] args) {
        System.out.println("introduce tu numero: ");
        int n1;
        Scanner sc = new Scanner(System.in);
        n1= sc.nextInt();
        sc.close();
        int unidades = n1%10;
        int decenas = n1/10;
        String uu="a";
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
                        switch (unidades) {
                            case 0:
                                uu="zero";
                                break;
                            case 1:
                                uu="uno";
                                break;
                            case 2:
                                uu="dos";
                                break;
                            case 3:
                                uu="tres";
                                break;
                            case 4:
                                uu="cuatro";
                                break;
                            case 5:
                                uu="cinco";
                                break;
                            case 6:
                                uu="seis";
                                break;
                            case 7:
                                uu="siete";
                                break;
                            case 8:
                                uu="ocho";
                                break;
                            case 9:
                                uu="nueve";
                                break;
                        }
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
                        if (n1<10)
                        {
                            System.out.println(uu);
                        }
                        else {
                            if(n1>15&&n1<20){
                                System.out.println(dd + "i" + uu);
                            }
                            else {
                                        if (n1 > 20 & n1 < 30) {
                                            dd = "venti";
                                            System.out.println(dd + uu);
                                        } else {
                                            if (n1%10==0) {
                                                System.out.println(dd);
                                            } else{
                                                    System.out.println(dd + " y " + uu);
                                                }
                                        }
                                    }
                            }
                        }
                }
    }






