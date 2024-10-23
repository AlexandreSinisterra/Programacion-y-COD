import java.util.Scanner;
public class primos {
    public static void main(String[] args) {
        int n;
        boolean primo=true;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (int i=2; i<=n; i++)//numeros primos de 2 a N
        {
            for(int j=2; j<i; j++)//son los numeros menores q el posible numero primo, por los cuales intentaremos dividirlo
            {
                if (i%j==0)//si el numero primo es divisible por cualquier otro q no sea el mismo o 1, significa que no lo es
                    primo=false;//por eso toma el valor de false
            }
            if(primo==true)
            System.out.println(i);//si son primos lo sacará por pantalla
            else
            primo=true;//despues el valor de primo volvera a true por si acaso el siguiente si lo es
        }
    }
}
