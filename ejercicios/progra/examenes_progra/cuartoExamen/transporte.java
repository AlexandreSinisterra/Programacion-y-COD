package progra.examenes_progra.cuartoExamen;

public abstract class transporte extends barcos{
    public transporte(String bandeira, String nome, int anoBotadura, String matricula, int nLicenciaM, String dataInspeccion, int nSalvavidas, int slora, int vDesprazado, int nTripulantes) {
        super(bandeira, nome, anoBotadura, matricula);
        this.nLicenciaM = nLicenciaM;
        this.dataInspeccion = dataInspeccion;
        this.nSalvavidas = nSalvavidas;
        this.slora = slora;
        this.vDesprazado = vDesprazado;
        this.setnTripulantes(nTripulantes);
    }



    public String getDataInspeccion() {
        return dataInspeccion;
    }

    public void setDataInspeccion(String dataInspeccion) {
        this.dataInspeccion = dataInspeccion;
    }

    public int getnLicenciaM() {
        return nLicenciaM;
    }

    public void setnLicenciaM(int nLicenciaM) {
        this.nLicenciaM = nLicenciaM;
    }

    public int getnSalvavidas() {
        return nSalvavidas;
    }

    public void setnSalvavidas(int nSalvavidas) {
        this.nSalvavidas = nSalvavidas;
    }

    public int getSlora() {
        return slora;
    }

    public void setSlora(int slora) {
        this.slora = slora;
    }

    public int getvDesprazado() {
        return vDesprazado;
    }

    public void setvDesprazado(int vDesprazado) {
        this.vDesprazado = vDesprazado;
    }

    public int getnTripulantes() {
        return nTripulantes;
    }

    public void setnTripulantes(int nTripulantes) {
        if (nTripulantes<=nSalvavidas) {
            this.nTripulantes = nTripulantes;
        }
    }

    private int nLicenciaM;
    private String dataInspeccion;
    private int nSalvavidas;
    private int slora;
    private int vDesprazado;
    private int nTripulantes;
}
