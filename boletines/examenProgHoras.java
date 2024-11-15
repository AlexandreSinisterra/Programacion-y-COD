import java.util.Scanner;

public class examenProgHoras {
    public static void main(String[] args) {
        System.out.println("dime tu hora, introduciendo las horas,minutos y segundos respectivamente : ");
        Scanner sc = new Scanner(System.in);
            long horas= sc.nextLong();
            long minutos= sc.nextLong();
            long segundos= sc.nextLong();
        System.out.println("ahora dime cuantos segundos quieres añadir: ");
            long añadido= sc.nextLong();//pongo long por si los valores son demasiado grandes, si queremos meter muchos segundos
        sc.close();
        segundos+=añadido;
        while(segundos>=60){//con los bucles iremos sumando a la siguiente unidad de medida de tiempo, son bucles por si acaso introducimos pas de 60 segundos
            minutos++;//1 minuto son 60 segundos
            segundos-=60;
        }
        while(minutos>=60){
            horas++;//1hora son 60 minutos
            minutos-=60;
        }
        while(horas>=24){
            horas-=24;//no hace falta poner la cantidad de dias, asique solo resto 24 para que pase 1 dia
        }
        System.out.println("a nova hora será as "+horas+":"+minutos+":"+segundos);

    }
}
