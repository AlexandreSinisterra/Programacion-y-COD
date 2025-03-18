package progra.boletines.boletin10.ej1;

public class PlazaGaraje extends BienInmob {
    private double ancho;
    private double largo;
    private int numeroPlaza;

    public PlazaGaraje(String rua, String operacion, double prezo, String localidade, int numero,double largo, int numeroPlaza, double ancho) {
        super(rua, operacion, prezo, localidade, numero);
        setLargo(largo);
        setAncho(ancho);
        setNumeroPlaza(numeroPlaza);
    }
    public PlazaGaraje(String rua, String operacion, double prezo, String localidade, int numero) {
        super(rua, operacion, prezo, localidade, numero);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = Math.abs(ancho);
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = Math.abs(largo);
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    @Override
    public double calcularGanancia() {
        if (getOperacion()) return getPrezo();
        else {
            return getPrezo() * ((double) 3 / 100);
        }
    }
}
