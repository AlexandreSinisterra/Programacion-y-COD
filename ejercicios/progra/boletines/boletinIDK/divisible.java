package progra.boletines.boletinIDK;

import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        int n1;
        Scanner sc = new Scanner(System.in);
        n1= sc.nextInt();
        sc.close();
        int n2= n1%3;
        System.out.println(n2);
    }
}
