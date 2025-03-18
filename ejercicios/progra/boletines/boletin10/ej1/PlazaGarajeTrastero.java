package progra.boletines.boletin10.ej1;

public class PlazaGarajeTrastero extends PlazaGaraje {
    double superficie;
    public PlazaGarajeTrastero(String rua, String operacion, double prezo, String localidade, int numero, double largo, int numeroPlaza, double ancho, double superficie) {
        super(rua, operacion, prezo, localidade, numero, largo, numeroPlaza, ancho);
        this.superficie = superficie;
    }
    public String toString() {
        return "la plaza de garaje trasero de la calle %s, nº %d en la localidad %s cuyo numero es %d, tiene una superficie de %f".formatted(rua,numero,localidade,getNumeroPlaza(),superficie);
    }
}
