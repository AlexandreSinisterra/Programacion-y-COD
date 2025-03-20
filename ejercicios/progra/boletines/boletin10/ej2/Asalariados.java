package progra.boletines.boletin10.ej2;

public class Asalariados extends Trabajador {
    private double sueldo;
    private double porcentajeSS;
    private double porcentajeIRPF;
    public Asalariados(String dni, String nome, String dataIngreso, double sueldo, double porcentajeSS, double porcentajeIRPF) {
        super(dni, nome, dataIngreso);
        this.sueldo = sueldo;
        this.porcentajeSS = porcentajeSS;
        this.porcentajeIRPF = porcentajeIRPF;
    }
    public String aCadea() {
        return super.aCadea() + " Su sueldo es %.2f su porcentaje de Seguridad Social es %.2f y el porcentaje del IRPF es %.2f".formatted(sueldo,porcentajeSS,porcentajeIRPF);
    }

    public double gastosIngresos() {
        return beneficios -= sueldo*(porcentajeSS / 100);
    }
}