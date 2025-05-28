package COD.soluciones.coches.model;

public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }
}