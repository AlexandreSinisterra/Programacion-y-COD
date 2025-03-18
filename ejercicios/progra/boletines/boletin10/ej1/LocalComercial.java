package progra.boletines.boletin10.ej1;

public class LocalComercial extends BienInmob {
    boolean acondicionado;
    boolean posibleEntradaMerc;
    public LocalComercial(String rua, double prezo, String localidade, String operacion, int numero,boolean acondicionado, boolean posibleEntradaMerc) {
        super(rua, operacion, prezo, localidade, numero);
        this.acondicionado = acondicionado;
        this.posibleEntradaMerc = posibleEntradaMerc;
    }

    @Override
    public double calcularGanancia() {
        return 0;
    }
}
