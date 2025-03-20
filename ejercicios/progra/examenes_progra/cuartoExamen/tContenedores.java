package progra.examenes_progra.cuartoExamen;

public class tContenedores extends transporte implements calcularFacturacion{

    private int cCarga;
    private int nCompartimentos;
    private int pTeM;

    public int getnCompartimentos() {
        return nCompartimentos;
    }

    public void setnCompartimentos(int nCompartimentos) {
        this.nCompartimentos = nCompartimentos;
    }

    public int getcCarga() {
        return cCarga;
    }

    public void setcCarga(int cCarga) {
        this.cCarga = cCarga;
    }

    public int getpTeM() {
        return pTeM;
    }

    public void setpTeM(int pTeM) {
        this.pTeM = pTeM;
    }


    public tContenedores(String bandeira, String nome, int anoBotadura, String matricula, int nLicenciaM, String dataInspeccion, int nSalvavidas, int slora, int vDesprazado, int nTripulantes, int cCarga, int nCompartimentos, int pTeM) {
        super(bandeira, nome, anoBotadura, matricula, nLicenciaM, dataInspeccion, nSalvavidas, slora, vDesprazado, nTripulantes);
        this.cCarga = cCarga;
        this.nCompartimentos = nCompartimentos;
        this.setpTeM(30);
    }

    @Override
    public String aCadea() {
        return "barcos{" +
                "bandeira='" + getBandeira() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", anoBotadura=" + getAnoBotadura() +
                ", matricula='" + getMatricula() + '\'' +
                '}'+'\''+
                "transporte{" +
                "nLicenciaM=" + getnLicenciaM() +
                ", dataInspeccion='" + getDataInspeccion() + '\'' +
                ", nSalvavidas=" + getnSalvavidas() +
                ", slora=" + getSlora() +
                ", vDesprazado=" + getvDesprazado() +
                ", nTripulantes=" + getnTripulantes() +
                '}'+'\''+
                "tContenedores{" +
                "cCarga=" + cCarga +
                ", nCompartimentos=" + nCompartimentos +
                ", pTeM=" + pTeM +
                '}';
    }

    @Override
    public double calcularFacturacion(double millas) {
        return millas*cCarga*pTeM;
    }
}
