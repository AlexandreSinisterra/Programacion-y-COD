package progra.examenes_progra.cuartoExamen;

public abstract class barcos {
    public barcos(String bandeira, String nome, int anoBotadura, String matricula) {
        this.bandeira = bandeira;
        this.nome = nome;
        this.anoBotadura = anoBotadura;
        this.matricula = matricula;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoBotadura() {
        return anoBotadura;
    }

    public void setAnoBotadura(int anoBotadura) {
        this.anoBotadura = anoBotadura;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private String bandeira;
    private String nome;
    private int anoBotadura;
    private String matricula;

    public abstract String aCadea();
}
