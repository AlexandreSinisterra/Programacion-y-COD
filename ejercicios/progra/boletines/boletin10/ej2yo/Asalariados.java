package progra.boletines.boletin10.ej2yo;

public class Asalariados extends Traballador implements gastoIngreso{
    public Asalariados(String nome, String direccion, String provincia, String sataAlta, double cuotaManual, String DNI, String dataIngreso, double soldo, double SS, double IRPF) {
        super(nome, direccion, provincia, sataAlta, cuotaManual, DNI, dataIngreso);
        this.soldo = soldo;
        this.SS = 0.15;
        this.IRPF = IRPF;
    }

    private double soldo;
    private double SS;
    private double IRPF;

    public double getSS() {
        return SS;
    }

    public void setSS(double SS) {
        this.SS = SS;
    }

    public double getSoldo() {
        return soldo;
    }

    public void setSoldo(double soldo) {
        this.soldo = soldo;
    }

    public double getIRPF() {
        return IRPF;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }

    @Override
    public String aCadea() {
        return "";
    }

    @Override
    public double calcularIngresos() {
        return -(this.soldo + this.soldo*this.SS);
    }
}
