package progra.boletines.boletin10.ej2;

public class Voluntarios extends Trabajador implements GastosIngresos {
    private int edade;
    private String profesion;
    private double horas;

    public Voluntarios(String dni, String nome, String dataIngreso, int edade, String profesion, double horas) {
        super(dni, nome, dataIngreso);
        this.edade = edade;
        this.profesion = profesion;
        this.horas = horas;
    }
    public String aCadea() {
        return super.aCadea() + " Edad: %d, Profesion: %s, Horas: %.2f".formatted(edade,profesion,horas);
    }
    @Override
    public double gastosIngresos() {
        return beneficios-=3;
    }
}
