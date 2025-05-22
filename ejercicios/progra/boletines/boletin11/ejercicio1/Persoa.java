package progra.boletines.boletin11.ejercicio1;

public abstract class Persoa {



    private String nome;
    private String direccion;
    private String dni;


    public Persoa(String nome, String direccion, String dni) {
        this.nome = nome;
        this.direccion = direccion;
        this.setDni(dni);

    }

    public String getNome() {
        return nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(String dni) {
        try {
            if(dni.length()!=9){
                throw new Exception("DniNonValido");
            }

            this.dni=dni;
        }catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}