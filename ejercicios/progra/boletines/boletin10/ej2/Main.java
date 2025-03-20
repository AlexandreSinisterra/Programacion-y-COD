package progra.boletines.boletin10.ej2;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("2030451X","HLJ","10/07/2023","C/Anld",100.20);
        socio1.gastosIngresos();
        Asalariados asalariados = new Asalariados("2030451X","HLJ","10/07/2023",23.12,14,23);
        asalariados.gastosIngresos();
        Voluntarios voluntarios = new Voluntarios("2030451X","HLJ","01-07-2023",23,"Contable",10);
        voluntarios.gastosIngresos();
        System.out.println(Persoa.beneficios);
        System.out.println(voluntarios.dataAlta);
    }
}