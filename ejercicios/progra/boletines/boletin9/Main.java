package progra.boletines.boletin9;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Dioses malignos","H.P LofCraft",1990,(short) 200,6);
        libro1.amosar();
        Libro libro2 = new Libro("Dioses antiguos","H.P LofCraft",1993,(short) 100,2);
        libro2.amosar();
        Libro libro3 = new Libro("Dioses antiguos y su mundo","H.P LofCraft",1993,(short) 300,5);
        libro3.amosar();

    }
}