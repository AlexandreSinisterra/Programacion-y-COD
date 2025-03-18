package progra.boletines.boletin9;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    public Libro(String titulo, String autor, int ano, short numPaginas, float valoracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        //setano(ano);
        this.numPaginas = numPaginas;
        //setnumPaginas(numPaginas)
        setValoracion(valoracion);
        //this.valoracion=valoracion
    }
    public void amosar() {
        String valoracionEscrita = getValoracionEscrita();
        System.out.printf("El titulo es " + titulo + " su autor es " + autor + " se publico en el año " + ano + " tiene un total de %s paginas. Su valoracion es de %s\n",numPaginas, valoracionEscrita);
    }

    /**
     * Obtener la valoracion escrita con el numero de estrellas en un color
     * @return la valoracion escrita
     */
    private String getValoracionEscrita() {
        String valoracionEscrita = "";
        if (valoracion<=4) {
            valoracionEscrita = "\033[31m";
        } else if (valoracion>4 && valoracion<6) {
            valoracionEscrita = "\033[33m";
        }
        else if (valoracion>=6) {
            valoracionEscrita = "\033[32m";
        }
        valoracionEscrita += valoracion;
        valoracionEscrita += " \033[0mestrellas";
        return valoracionEscrita;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        if (valoracion<=10) {
            this.valoracion = valoracion;
        }
    }
}