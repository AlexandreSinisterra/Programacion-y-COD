package progra.boletines.boletin10.ej1;

public class Main {
    public static void main(String[] args) {
        PlazaGaraje prazaGarciaB = new PlazaGaraje("Garcia Barbon","Venta" ,100,"Vigo",12);
        PlazaGarajeTrastero plaza = new PlazaGarajeTrastero("Garcia Barbon","Venta" ,100,"Vigo",12,12,20,10,203);
        Vivienda vivienda = new Vivienda("Garcia Barbon","Venta",1200,"Vigo",12,"4C","3B",plaza);
        System.out.println(vivienda);
        System.out.println(plaza);
    }
}