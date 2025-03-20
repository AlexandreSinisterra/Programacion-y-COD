package progra.boletines.boletin10.ej2yo;

public class Voluntarios extends Traballador implements gastoIngreso{
    public Voluntarios(String nome, String direccion, String provincia, String sataAlta, double cuotaManual, String DNI, String dataIngreso, int edade, String profesion, int indicadas, int ingresos) {
        super(nome, direccion, provincia, sataAlta, cuotaManual, DNI, dataIngreso);
        this.setCuotaManual(3);
        this.edade = edade;
        this.profesion = profesion;
        this.indicadas = indicadas;
        this.ingresos = ingresos;
    }

    private int edade;
    private String profesion;
    private int indicadas;
    private int ingresos;

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public int getIndicadas() {
        return indicadas;
    }

    public void setIndicadas(int indicadas) {
        this.indicadas = indicadas;
    }

    @Override
    public String aCadea() {
        return "";
    }

    @Override
    public double calcularIngresos() {
        return this.getIngresos() - this.getCuotaManual();
    }
}
