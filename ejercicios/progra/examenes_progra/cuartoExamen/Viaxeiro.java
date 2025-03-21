package progra.examenes_progra.cuartoExamen;

public class Viaxeiro extends barcos implements calcularFacturacion{
    public Viaxeiro(String bandeira, String nome, int anoBotadura, String matricula, int nLicenciaV, int eslora, int vDesprazado, int nTripulantes, int nPasaxeirosT, int nPasaxeiros1a, int nCamions, String dataInspeccion, int nSalvavidas) {
        super(bandeira, nome, anoBotadura, matricula);
        this.nLicenciaV = nLicenciaV;
        this.eslora = eslora;
        this.vDesprazado = vDesprazado;
        this.setnTripulantes(nTripulantes,nPasaxeirosT,nPasaxeiros1a,nSalvavidas);
        this.setnPasaxeirosT(nTripulantes,nPasaxeirosT,nPasaxeiros1a,nSalvavidas);
        this.setnPasaxeiros1a(nTripulantes,nPasaxeirosT,nPasaxeiros1a,nSalvavidas);
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

    public void setnTripulantes(int nTripulantes, int nPasaxeirosT, int nPasaxeiros1a, int nSalvavidas) {
       if(nTripulantes+nPasaxeirosT+nPasaxeiros1a<=nSalvavidas)
        this.nTripulantes = nTripulantes;
    }

    public int getnPasaxeirosT() {
        return nPasaxeirosT;
    }

    public void setnPasaxeirosT(int nTripulantes, int nPasaxeirosT, int nPasaxeiros1a, int nSalvavidas) {
        if(nTripulantes+nPasaxeirosT+nPasaxeiros1a<=nSalvavidas)
            this.nPasaxeirosT = nPasaxeirosT;
    }

    public int getnPasaxeiros1a() {
        return nPasaxeiros1a;
    }

    public void setnPasaxeiros1a(int nTripulantes, int nPasaxeirosT, int nPasaxeiros1a, int nSalvavidas) {
        if(nTripulantes+nPasaxeirosT+nPasaxeiros1a<=nSalvavidas)
            this.nPasaxeiros1a = nPasaxeiros1a;
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

        String RESET = "\u001B[0m";
        String BLUE = "\u001B[34m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        return BLUE + "Barcos:\n" +
                GREEN + "  Bandeira: " + YELLOW + "'" + getBandeira() + "'\n" +
                GREEN + "  Nome: " + YELLOW + "'" + getNome() + "'\n" +
                GREEN + "  Ano de Botadura: " + YELLOW + getAnoBotadura() + "\n" +
                GREEN + "  Matricula: " + YELLOW + "'" + getMatricula() + "'\n\n" +
                BLUE + "Viaxeiro:\n" +
                GREEN + "  Número de Licencia: " + YELLOW + nLicenciaV + "\n" +
                GREEN + "  Eslora: " + YELLOW + eslora + "\n" +
                GREEN + "  Volumen Desplazado: " + YELLOW + vDesprazado + " m^3\n" +
                GREEN + "  Número de Tripulantes: " + YELLOW + nTripulantes + "\n" +
                GREEN + "  Número de Pasaxeiros Totales: " + YELLOW + nPasaxeirosT + "\n" +
                GREEN + "  Número de Pasaxeiros 1ª Clase: " + YELLOW + nPasaxeiros1a + "\n" +
                GREEN + "  Número de Camions: " + YELLOW + nCamions + "\n" +
                GREEN + "  Data de Inspección: " + YELLOW + "'" + dataInspeccion + "'\n" +
                GREEN + "  Número de Salvavidas: " + YELLOW + nSalvavidas + "\n" + RESET;
    }

    @Override
    public double calcularFacturacion(double millas) {
        return millas*nPasaxeiros1a*7+millas*nPasaxeirosT*5+millas*3.5+millas*nCamions*10;
    }
}
