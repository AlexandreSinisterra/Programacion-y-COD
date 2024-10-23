import java.util.Scanner;

public class boletinExtra2 {
    public static void main(String[] args) {
        System.out.println("2do ejercicio: ");
            System.out.println("dime tu temperatura en Celsius: ");
            int celsius,fahrenheit,kelvin;
                Scanner sc = new Scanner(System.in);
                celsius= sc.nextInt();
                    kelvin=celsius+273;
                    fahrenheit=celsius*9/5+32;
                System.out.println("su temperatura en kelvin es " + kelvin + " y en fahrenheit es " + fahrenheit);

        sc.close();
    }


}
