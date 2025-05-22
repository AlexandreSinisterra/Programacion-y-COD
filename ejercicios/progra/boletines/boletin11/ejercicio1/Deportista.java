package progra.boletines.boletin11.ejercicio1;

public class Deportista extends Persoa{
    private String deporte;
    private String clube;
    private String licencia;

    public Deportista(String nome, String direccion, String dni, String deporte, String clube, String licencia) {
        super(nome, direccion, dni);
        this.deporte = deporte;
        this.clube = clube;
        this.setLicencia(licencia);
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        char[] licenciaChar = licencia.toCharArray();
        char[] anoChar={' ',' ',' ',' '};
        char[] deporteChar={' ',' ',' '};
        char [] numeroChar={' ',' ',' ',' ',' ',' ' };
        for (int i = 0; i<licenciaChar.length; i++){
            if (i<=3){
                anoChar[i]=licenciaChar[i];
            } else if (i >=4 && i<=6){
                deporteChar[i-4]=licenciaChar[i];
            }
            else {
                numeroChar[i-7]=licenciaChar[i];
            }
        }
        try{
            for (int i=0;i<anoChar.length-1;i++){
                if(!Character.isDigit(anoChar[i])){
                    throw new Exception("Ano non vÃ¡lido");
                }
            }
            for (int i = 0;i<deporteChar.length;i++){
                if(!Character.isLetter(deporteChar[i])){
                    throw new Exception(("Deporte non valido"));
                }

            }
            for (int i = 0; i<numeroChar.length;i++){
                if(!Character.isDigit(numeroChar[i])){
                    throw new Exception(("Ano non validO"));
                }
            }
            this.licencia=licencia;
        }catch (Exception e){
            System.err.println("Error "+ e.getMessage());
        }
        this.licencia = licencia;
    }





}