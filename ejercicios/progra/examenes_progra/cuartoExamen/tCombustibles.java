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

        String RESET = "\u001B[0m";
        String BLUE = "\u001B[34m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        return BLUE + "Barcos:\n" +
                GREEN + "  Bandeira: " + YELLOW + "'" + getBandeira() + "'\n" +
                GREEN + "  Nome: " + YELLOW + "'" + getNome() + "'\n" +
                GREEN + "  Ano de Botadura: " + YELLOW + getAnoBotadura() + "\n" +
                GREEN + "  Matricula: " + YELLOW + "'" + getMatricula() + "'\n\n" +
                BLUE + "Transporte:\n" +
                GREEN + "  Número de Licencia: " + YELLOW + getnLicenciaM() + "\n" +
                GREEN + "  Data de Inspección: " + YELLOW + "'" + getDataInspeccion() + "'\n" +
                GREEN + "  Número de Salvavidas: " + YELLOW + getnSalvavidas() + "\n" +
                GREEN + "  Slora: " + YELLOW + getSlora() + "\n" +
                GREEN + "  Volumen desplazado: " + YELLOW + getvDesprazado() + " m^3\n" +
                GREEN + "  Número de Tripulantes: " + YELLOW + getnTripulantes() + "\n\n" +
                BLUE + "Combustibles:\n" +
                GREEN + "  Tipo de Fluido: " + YELLOW + "'" + gettFluido() + "'\n" +
                GREEN + "  Volumen de Fluido: " + YELLOW + getvFluido() + "L\n" +
                GREEN + "  Número de Depósitos: " + YELLOW + getnDepositos() + "\n" +
                GREEN + "  Precio por tonelada y por milla: " + YELLOW + getpMeM() + " kg\n" + RESET;
    }

    @Override
    public double calcularFacturacion(double millas) {
        return millas*pMeM+vFluido*pMeM;
    }
}
