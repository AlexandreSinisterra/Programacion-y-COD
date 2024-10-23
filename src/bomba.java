import java.util.Scanner;
public class bomba {
    public static void main(String[] args) {
        System.out.println("no sirve xq si hace 1 salta a los demás");
        System.out.println("Hay una bomba, corta el cable correcto, buena suerte");
        System.out.println("60,59,58,57,56,55,54,53,52,51");
        System.out.println("1-cortar cable rojo");
        System.out.println("2-cortar cable azul");
        System.out.println("3-cortar cable verde");
        System.out.println("4-nada");
        int decision;
        Scanner sc = new Scanner(System.in);
        decision = sc.nextInt();

        switch (decision) {
            case 1:
                System.out.println("click");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println("BOOOOM");
                System.out.println("estás muerto :)");
                System.out.println("Bad ending");
                break;
            case 2:
                System.out.println("click");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println("parece que no ha explotado, ¡enhorabuena!");
                System.out.println("Lucky ending");
                break;
            case 3:
                System.out.println("click");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println("20,19,18,17,16,15,14,13,12,11");
                System.out.println("Parece que has reducido el tiempo, tienes otro intento");
                System.out.println("1-cortar cable rojo");
                System.out.println("2-cortar cable azul");
                System.out.println("4-nada");
                decision = sc.nextInt();
                    decision=decision+10;
                switch (decision) {
                    case 11:
                        System.out.println("click");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println("BOOOOM");
                        System.out.println("estás muerto :)");
                        System.out.println("Bad ending");
                        break;
                    case 12:
                        System.out.println("click");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println("parece que no ha explotado, ¡enhorabuena!");
                        System.out.println("Good ending");
                        break;
                    case 14:
                        System.out.println("click");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println("BOOOOM");
                        System.out.println("estás muerto :)");
                        System.out.println("Bad ending");
                        break;
                }break;
                    case 4:
                        System.out.println("50,49,48,47,46,45,44,43,42,41");
                        System.out.println("seguro que no quieres hacer nada?");
                        System.out.println("1-cortar cable rojo");
                        System.out.println("2-cortar cable azul");
                        System.out.println("3-cortar cable verde");
                        System.out.println("4-nada");
                        decision = sc.nextInt();
                        decision=decision+20;
                        switch (decision) {
                            case 21:
                                System.out.println("click");
                                System.out.println(".");
                                System.out.println(".");
                                System.out.println(".");
                                System.out.println("BOOOOM");
                                System.out.println("estás muerto :)");
                                System.out.println("Bad ending");
                                break;
                            case 22:
                                System.out.println("click");
                                System.out.println(".");
                                System.out.println(".");
                                System.out.println(".");
                                System.out.println("parece que no ha explotado, ¡enhorabuena!");
                                System.out.println("Good ending");
                                break;
                            case 23:
                                System.out.println("click");
                                System.out.println(".");
                                System.out.println(".");
                                System.out.println(".");
                                System.out.println("10,9,8,7,6,5,4,3,2,1");
                                System.out.println("Parece que puedes hacer algo, pero date prisa");
                                System.out.println("1-cortar cable rojo");
                                System.out.println("2-cortar cable azul");
                                System.out.println("4-nada");
                                decision = sc.nextInt();
                                decision=decision+30;
                                switch (decision) {
                                    case 31:
                                        System.out.println("click");
                                        System.out.println(".");
                                        System.out.println(".");
                                        System.out.println(".");
                                        System.out.println("BOOOOM");
                                        System.out.println("estás muerto :)");
                                        System.out.println("Bad ending");
                                        break;
                                    case 32:
                                        System.out.println("click");
                                        System.out.println(".");
                                        System.out.println(".");
                                        System.out.println(".");
                                        System.out.println("parece que no ha explotado, ¡enhorabuena!");
                                        System.out.println("Good ending");
                                        break;
                                    case 34:
                                        System.out.println(".");
                                        System.out.println(".");
                                        System.out.println(".");
                                        System.out.println("BOOOOM");
                                        System.out.println("estás muerto :)");
                                        System.out.println("Bad ending");

                                        break;
                                }break;
                                    case 24:
                                        System.out.printf("bueno, no pasa nada, no todo el mundo le apetece participar en estas cosas");
                                        System.out.println(" hasta nunca");
                                        System.out.println("click");
                                        System.out.println("click");
                                        System.out.println("click");
                                        System.out.println(".");
                                        System.out.println(".");
                                        System.out.println(".");
                                        System.out.println("BOOOOM");
                                        System.out.println("estás muerto :)");
                                        System.out.println("Bad ending2");
                                        break;


                        }
                        sc.close();
                }
        }
    }
