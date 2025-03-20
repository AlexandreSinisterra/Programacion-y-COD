package progra.boletines.boletin10.ej2;

public abstract class Trabajador extends Persoa {
    public Fecha dataAlta;
    public Trabajador(String dni, String nome, String dataIngreso) {
        super(dni, nome);
        this.dataAlta = new Fecha(dataIngreso);
    }
    public String aCadea() {
        return super.aCadea() + " Fecha de ingreso: %s".formatted(dataAlta.toString());
    }
}
