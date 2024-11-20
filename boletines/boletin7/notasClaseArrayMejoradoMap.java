package boletin7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class notasClaseArrayMejoradoMap {
    public static void main (String []args){
        Map<String, Integer> mapaNotas = new HashMap<>();//aqui introduciremos los nombres y las notas correspondientes
        String nombre="";
        int longituddenombre;
        int aprobados=0;
        int suspendidos=0;
        int avg=0;
        int cantidade=0;
        int maximo=0;
        boolean repetido;
        boolean nombrecorrecto=false;
        int[] notas = new int[30];//notas
        Random numero_random = new Random();
        for (int i = 0; i < notas.length; i++) {//asignamos un valor a cada posicion del array
            notas[i] = numero_random.nextInt(10) + 0;//genera un numero entre 0 y 10
        }
        for (int n1:notas){//n1 va tomando cada uno de los valores dentro del array
            if (n1 >= 5) aprobados++;//si el valor es >= 5 entonces aumenta 1 el valor de los aprobados
            else suspendidos++;//sino estan aprobados pues estan suspensos
            avg+=n1;//voy almacenando en avg la suma total
            cantidade++;//la cantidad de notas para despues dividirlo y q te de el avg

            if (maximo < n1) {//se va comparando el valor de maximo con el de n1, si n1 es mayor pues maximo obtendra su valor, asi obtiene siempre el mayor
                maximo = n1;
            }
        }
        avg=avg/cantidade;//calcular el avg
        System.out.println("los nombres de los alumnos y sus notas son: ");
        for (int i = 0; i < 30; i++) {//va asignando valores de las posiciones del notasnome
            longituddenombre = numero_random.nextInt(10) + 1;
            for (int j = 0; j < longituddenombre; j++) {//este bucle se repite una cantidad de veces aleatoria entre 1 y 10, siendo la longitud del siguiente nombre
                nombre += (char) ('A' + (int) (Math.random() * 26));  // Genera una letra aleatoria de A a Z y se van sumando al nombre
            }
            do{
                if (mapaNotas.containsKey(nombre)){//con el contains compruebo si en el map tengo una key con el mismo nombre
                    repetido=true;//un map es como 2 arrays que uno son las keys y les corresponden un value
                    nombre += (char) ('A' + (int) (Math.random() * 26));
                }
                else repetido=false;

            }
            while(repetido==true);
            /**
             lo que acabo de hacer aqui, en el do while, he hecho que haga una comparación del nombre con todos los demas nombres del array por si acaso
             hay un valor repetido y que le añada un caracter y que el valor de repetido sea true, mientras que repetido sea true se sigue repitiendo, hasta
             que no haya ningun valor al nombre y el valor vuelva a false.
             **/
            mapaNotas.put(nombre, notas[i]);//aqui adjudico el valos de la key que seria el nombre y el value que seria la nota
            nombre="";//volvemos a valor "" de nombre, para que vuelva a empezar
        }
        for (Map.Entry<String, Integer> entry : mapaNotas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        /**
         * creamos una variable entry del tipo map que tendra string como key e ira recorriendo nuestro map, tomando los valores del nuestro
         * luego ponemos que los saque por pantalla
         */
        System.out.println(" ");
        System.out.println("la cantidad de alumnos suspendidos es de: "+suspendidos);
        System.out.printf("y sus nombres son: ");
        for (Map.Entry<String, Integer> entry : mapaNotas.entrySet()) {//lo va recorriendo y cuando el value es igual a 0,1,2,3,4 le pediremos que nos diga su key
            if (entry.getValue().equals(0)||entry.getValue().equals(1)||entry.getValue().equals(2)||entry.getValue().equals(3)||entry.getValue().equals(4)) {
                System.out.printf(entry.getKey()+",");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("la cantidad de alumnos aprobados es de: "+aprobados);
        System.out.printf("y sus nombres son: ");
        for (Map.Entry<String, Integer> entry : mapaNotas.entrySet()) {//lo mismo pero con otros numeros
            if (entry.getValue().equals(5)||entry.getValue().equals(6)||entry.getValue().equals(7)||entry.getValue().equals(8)||entry.getValue().equals(9)||entry.getValue().equals(10)) {
                System.out.println(entry.getKey()+",");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("la nota media es de: "+avg);//sacamos por pantalla el avg que calculamos mucho antes
        System.out.println("la nota máxima es de: "+maximo);//lo mismo pero con el maximo
        System.out.println("de que alumno quieres saber la nota?: ");
        Scanner sc = new Scanner(System.in);
        String alumno= sc.nextLine();//metemos el nombre del alumno
            if (mapaNotas.containsKey(alumno)){//con contain podemos ver si nuestro map contiene la llave alumno
                System.out.println("La nota de " + alumno + " es: " + mapaNotas.get(alumno));//nos saca el value de esa key
                nombrecorrecto = true;
            }
        //tengo como nombrecorrecto por defecto en falso, por que solo te pide un nombre, si lo tienes correcto te lo pone por pantalla y el valor pasa a true
        while (nombrecorrecto==false){//si sigue en false, osea que los nombres no coinciden, se haría este bucle
            System.out.println("el nombre no pertenece a ningun alumno, prueba con mayusculas o revisa si esta bien escrito: ");
            alumno= sc.nextLine();
            if (mapaNotas.containsKey(alumno)) {
                System.out.println("La nota de " + alumno + " es: " + mapaNotas.get(alumno));
                nombrecorrecto = true;
            }
        }
        System.out.println("las notas en orden son: ");
        for (int i = 0; i <= 10; i++) {//las notas son del 0 al 10
            for (int orden : notas) {
                if (i == orden) {//si el valor de la nota es igual que el de la nota del array pues lo saca por pantalla y vamos aumentando
                    System.out.printf(orden+",");
                }
            }
        }
        System.out.println("");//simplemente pongo estas cosas para ir separando
    }
}
