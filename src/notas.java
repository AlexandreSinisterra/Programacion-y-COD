import java.util.Scanner;
public class notas {
    public static void main(String[] args) {
        System.out.println("introduce tu nota: ");
        int nota;
        Scanner sc = new Scanner(System.in);
        nota= sc.nextInt();
        sc.close();
            switch (nota) {

                case 0:
                    System.out.println("suspenso");
                    break;
                case 1:
                    System.out.println("suspenso");
                    break;
                case 2:
                    System.out.println("suspenso");
                    break;
                case 3:
                    System.out.println("suspenso");
                    break;
                case 4:
                    System.out.println("suspenso");
                    break;
                case 5:
                    System.out.println("suficiente");
                    break;
                case 6:
                    System.out.println("bien");
                    break;
                case 7:
                    System.out.println("notable");
                    break;
                case 8:
                    System.out.println("notable alto");
                    break;
                case 9:
                    System.out.println("sobresaliente");
                    break;
                case 10:
                    System.out.println("sobresaliente alto");
                    break;
                default:
                    System.out.println("la nota introducida no es posible");
                    break;
            }
        System.out.println("prueba con otro numero");
    }
}
