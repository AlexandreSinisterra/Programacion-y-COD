package ejemplos_explicaciones;

import java.util.Scanner;

public class pruebaWhileContinue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            numero=sc.nextInt();
            if (numero==3){
                System.out.println("Si");
                continue;}
            System.out.println("a");
        }
        while(numero==0);
    }
}
/* queria ver si con el continue tambien se saltaba la comprobación del final porque tneia mis dudas y ya estoy cansado
ayuda, dormi toda la tarde, me quede en un juego con el autoclicker puesto mientras dormia para conseguir recompensas
despues de dormir 4h me desperte y vi q no funcionaba el autoclicker, que solo funciono la primero media hora
asique lo que hice fue volver a ponerlo e irme a dormir otras 2h más, y ahora quiero volver a dormir, no sabia a que
jugar y dije, pues voy a hacer el hundir la flota, lo peor? todo esto esque no hay monster.
 */