package progra.examenes_progra.cuartoExamen;

public class Main {
    public static void main (String []args){
        tContenedores barcoContenedor1 = new tContenedores("Paradis", "Leviathan", 845, "AT9845", 1122, "6/5/845", 50, 80, 1200, 25, 5000, 10, 30);
        System.out.println(barcoContenedor1.aCadea());
        System.out.println("El precio de la facturación del barco "+ barcoContenedor1.getNome() +" es de: "+barcoContenedor1.calcularFacturacion(235)+"€\n");
        tCombustibles barcoCombustible1 = new tCombustibles("Marley", "Nautilus", 845, "AT1001", 789, "25/12/845", 50, 100, 1500, 30, "Gasóleo", 5000, 10, 25);
        System.out.println(barcoCombustible1.aCadea());
        System.out.println("El precio de la facturación del barco "+ barcoCombustible1.getNome() +" es de: "+barcoCombustible1.calcularFacturacion(235)+"€\n");
        Viaxeiro viaxeiroTitan = new Viaxeiro("Muralha Maria", "Recon Corps", 850, "ATX-RC321", 1105, 65, 120, 500, 150, 200, 30, "20/12/850", 1000);
        System.out.println(viaxeiroTitan.aCadea());
        System.out.println("El precio de la facturación del barco "+ viaxeiroTitan.getNome() +" es de: "+viaxeiroTitan.calcularFacturacion(235)+"€\n");
    }
}
