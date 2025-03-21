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
                BLUE + "Contenedores:\n" +
                GREEN + "  Capacidade de Carga: " + YELLOW + cCarga + "T\n" +
                GREEN + "  Número de Compartimentos: " + YELLOW + nCompartimentos + "\n" +
                GREEN + "  Precio por tonelada y por milla: " + YELLOW + pTeM + "€\n" + RESET;
    }

    @Override
    public double calcularFacturacion(double millas) {
        return millas*pTeM+cCarga*pTeM;
    }
}
