package progra.boletines.boletin10.ej2yo;

public abstract class Socio {
    private String nome;
    private String direccion;
    private String provincia;
    private String sataAlta;
    private double cuotaManual;
    private String DNI;

    public Socio(String nome, String direccion, String provincia, String sataAlta, double cuotaManual, String DNI) {
        this.nome = nome;
        this.direccion = direccion;
        this.provincia = provincia;
        this.sataAlta = sataAlta;
        this.cuotaManual = cuotaManual;
        this.DNI = DNI;
    }


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSataAlta() {
        return sataAlta;
    }

    public void setSataAlta(String sataAlta) {
        this.sataAlta = sataAlta;
    }

    public double getCuotaManual() {
        return cuotaManual;
    }

    public void setCuotaManual(double cuotaManual) {
        this.cuotaManual = cuotaManual;
    }

    public abstract String aCadea();

}
