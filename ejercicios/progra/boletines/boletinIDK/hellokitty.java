package progra.boletines.boletinIDK;

import java.util.Scanner;
public class hellokitty {
        public static void main(String[] args) {
                System.out.println("te gusta hello kitty? 1 para si, 0 para no: ");
                Scanner sc = new Scanner(System.in);
                int respuesta = sc.nextInt();
                if (respuesta==1)
                {
                        System.out.println("based");
                }
                else {
                        if (respuesta==0) {
                                System.out.println("gilipollas");
                        }
                        else {
                                System.out.println("no pusiste ni zero ni uno");
                        }
                }
        }
}
