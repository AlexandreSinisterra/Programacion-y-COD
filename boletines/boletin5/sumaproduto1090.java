package boletin5;

public class sumaproduto1090 {
    public static void main(String[] args) {
        int suma=0;
        double producto=1;
        for (int i=11; i<90; i++){
            suma= suma + i;
            producto = producto * i;
        }
        System.out.println("la suma de los boletinIDK.numeros comprendidos entre 10 y 90 es " + suma + " y su producto es " + producto);
    }
}
