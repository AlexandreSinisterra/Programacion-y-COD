package progra.boletines.boletin10.ej2yo;

public abstract class Traballador extends Socio{

    public Traballador(String nome, String direccion, String provincia, String sataAlta, double cuotaManual, String DNI, String dataIngreso) {
        super(nome, direccion, provincia, sataAlta, cuotaManual, DNI);
        this.dataIngreso = dataIngreso;
    }

    public String getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(String dataIngreso) {
        this.dataIngreso = dataIngreso;
    }

    private String dataIngreso;



}
