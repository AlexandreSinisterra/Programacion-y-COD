package progra.examenes_progra.cuartoExamen;

public class tCombustibles extends transporte implements calcularFacturacion{
    public String gettFluido() {
        return tFluido;
    }

    public void settFluido(String tFluido) {
        this.tFluido = tFluido;
    }

    public int getvFluido() {
        return vFluido;
    }

    public void setvFluido(int vFluido) {
        this.vFluido = vFluido;
    }

    public int getnDepositos() {
        return nDepositos;
    }

    public void setnDepositos(int nDepositos) {
        this.nDepositos = nDepositos;
    }

    public int getpMeM() {
        return pMeM;
    }

    public void setpMeM(int pMeM) {
        this.pMeM = pMeM;
    }

    private String tFluido;
    private int vFluido;
    private int nDepositos;
    private int pMeM;

    public tCombustibles(String bandeira, String nome, int anoBotadura, String matricula, int nLicenciaM, String dataInspeccion, int nSalvavidas, int slora, int vDesprazado, int nTripulantes, String tFluido, int vFluido, int nDepositos, int pMeM) {
        super(bandeira, nome, anoBotadura, matricula, nLicenciaM, dataInspeccion, nSalvavidas, slora, vDesprazado, nTripulantes);
        this.tFluido = tFluido;
        this.vFluido = vFluido;
        this.nDepositos = nDepositos;
        this.setpMeM(20);
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
                "tCombustibles{" +
                "tFluido='" + tFluido + '\'' +
                ", vFluido=" + vFluido +
                ", nDepositos=" + nDepositos +
                ", pMeM=" + pMeM +
                '}';
    }

    @Override
    public double calcularFacturacion(double millas) {
        return millas*vFluido*pMeM;
    }
}
