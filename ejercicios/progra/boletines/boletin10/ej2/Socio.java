package progra.boletines.boletin10.ej2;


public class Socio extends Persoa implements GastosIngresos {
    String direccion;
    double cuotaMensual;
    Fecha dataIngreso;

    public Socio(String dni, String nome, String dataIngreso, String direccion, double cuotaMensual) {
        super(dni, nome);
        this.direccion = direccion;
        this.cuotaMensual = cuotaMensual;
        this.dataIngreso = new Fecha(dataIngreso);
    }
    public String aCadea() {
        return super.aCadea() + " Direccion: %s, Cuota: %.2f y la fecha de alta es %s".formatted(direccion,cuotaMensual,dataIngreso.toString());
    }
    @Override
    public double gastosIngresos() {
        beneficios += cuotaMensual;
        return cuotaMensual;
    }
}

