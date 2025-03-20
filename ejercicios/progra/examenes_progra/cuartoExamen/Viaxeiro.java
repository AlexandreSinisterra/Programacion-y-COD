package progra.examenes_progra.cuartoExamen;

public class Viaxeiro extends barcos implements calcularFacturacion{
    public Viaxeiro(String bandeira, String nome, int anoBotadura, String matricula, int nLicenciaV, int eslora, int vDesprazado, int nTripulantes, int nPasaxeirosT, int nPasaxeiros1a, int nCamions, String dataInspeccion, int nSalvavidas) {
        super(bandeira, nome, anoBotadura, matricula);
        this.nLicenciaV = nLicenciaV;
        this.eslora = eslora;
        this.vDesprazado = vDesprazado;
        this.setnTripulantes(nTripulantes,nPasaxeirosT,nPasaxeiros1a);
        this.setnPasaxeirosT(nTripulantes,nPasaxeirosT,nPasaxeiros1a);
        this.setnPasaxeiros1a(nTripulantes,nPasaxeirosT,nPasaxeiros1a);
        this.nCamions = nCamions;
        this.dataInspeccion = dataInspeccion;
        this.nSalvavidas = nSalvavidas;
    }

    public int getnLicenciaV() {
        return nLicenciaV;
    }

    public void setnLicenciaV(int nLicenciaV) {
        this.nLicenciaV = nLicenciaV;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
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

    public void setnTripulantes(int nTripulantes, int nPasaxeirosT, int nPasaxeiros1a) {
       if(nTripulantes+nPasaxeirosT+nPasaxeiros1a<=nSalvavidas)
        this.nTripulantes = nTripulantes;
    }

    public int getnPasaxeirosT() {
        return nPasaxeirosT;
    }

    public void setnPasaxeirosT(int nTripulantes, int nPasaxeirosT, int nPasaxeiros1a) {
        if(nTripulantes+nPasaxeirosT+nPasaxeiros1a<=nSalvavidas)
            this.nPasaxeirosT = nTripulantes;
    }

    public int getnPasaxeiros1a() {
        return nPasaxeiros1a;
    }

    public void setnPasaxeiros1a(int nTripulantes, int nPasaxeirosT, int nPasaxeiros1a) {
        if(nTripulantes+nPasaxeirosT+nPasaxeiros1a<=nSalvavidas)
            this.nPasaxeiros1a = nTripulantes;
    }

    public int getnCamions() {
        return nCamions;
    }

    public void setnCamions(int nCamions) {
        this.nCamions = nCamions;
    }

    public String getDataInspeccion() {
        return dataInspeccion;
    }

    public void setDataInspeccion(String dataInspeccion) {
        this.dataInspeccion = dataInspeccion;
    }

    public int getnSalvavidas() {
        return nSalvavidas;
    }

    public void setnSalvavidas(int nSalvavidas) {
        this.nSalvavidas = nSalvavidas;
    }

    private int nLicenciaV;
    private int eslora;
    private int vDesprazado;
    private int nTripulantes;
    private int nPasaxeirosT;
    private int nPasaxeiros1a;
    private int nCamions;
    /*

    si no puede llevar camiones pondrán un 0,
    esto se puede hacer ya que es una tasa extra
    aplicada a algunos barcos viaxeiros

     */
    private String dataInspeccion;
    private int nSalvavidas;

    @Override
    public String aCadea() {
        return "barcos{" +
                "bandeira='" + getBandeira() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", anoBotadura=" + getAnoBotadura() +
                ", matricula='" + getMatricula() + '\'' +
                '}'+'\''+
                "Viaxeiro{" +
                "nLicenciaV=" + nLicenciaV +
                ", eslora=" + eslora +
                ", vDesprazado=" + vDesprazado +
                ", nTripulantes=" + nTripulantes +
                ", nPasaxeirosT=" + nPasaxeirosT +
                ", nPasaxeiros1a=" + nPasaxeiros1a +
                ", nCamions=" + nCamions +
                ", dataInspeccion='" + dataInspeccion + '\'' +
                ", nSalvavidas=" + nSalvavidas +
                '}';
    }

    @Override
    public double calcularFacturacion(double millas) {
        return millas*nPasaxeiros1a*7+millas*nPasaxeirosT*5+millas*3.5+millas*nCamions*10;
    }
}
