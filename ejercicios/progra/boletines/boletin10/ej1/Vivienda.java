package progra.boletines.boletin10.ej1;

public class Vivienda extends BienInmob {
    boolean tenAdega;
    String observaciones;
    private int numeroHabitaciones;
    PlazaGaraje garaje;
    private String portal;
    private String piso;

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = Math.abs(numeroHabitaciones);
    }

    public boolean isTenAdega() {
        return tenAdega;
    }

    public void setTenAdega(boolean tenAdega) {
        this.tenAdega = tenAdega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public PlazaGaraje getGaraje() {
        return garaje;
    }

    public void setGaraje(PlazaGaraje garaje) {
        this.garaje = garaje;
    }

    public Vivienda(String rua, String operacion, double prezo, String localidade, int numero, String portal, String piso, PlazaGaraje garaje) {
        super(rua, operacion, prezo, localidade, numero);
        this.garaje = garaje;
        this.portal = portal;
        this.piso = piso;
    }
    @Override
    public double calcularGanancia() {
        return 0;
    }
}
