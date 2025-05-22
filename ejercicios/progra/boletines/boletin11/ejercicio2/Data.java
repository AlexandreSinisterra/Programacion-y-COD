package progra.boletines.boletin11.ejercicio2;

public class Data {



    private int dia;
    private int mes;
    private int ano;

    // Excepción personalizada:
    public static class FormatoDataErroneo extends RuntimeException {
        public FormatoDataErroneo(String mensaje) {
            super(mensaje);
        }
    }

    public Data(int dia, int mes, int ano) {
        try {
            setAno(ano);
            setMes(mes);
            validarDia(dia,mes,ano);
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } catch (FormatoDataErroneo e){
            this.dia = 1;
            this.mes = 1; // VALORES POR DEFECT EN CASO DE ERROR
            this.ano = 1970;
            System.out.println("Error: " +  e.getMessage() + ". Fecha por defecto 1/1/1970");
        }

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        try {
            if (dia < 1 || dia > 31){
                throw new FormatoDataErroneo("Día debe estar entre 1 y 31");
            }
        } catch (FormatoDataErroneo e){
            this.dia = 1;
            throw e; // Pa que lo pille el constructor de vuelta

        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        try {
            if (mes <1 || mes > 12){
                throw new FormatoDataErroneo("Mes debe estar entre 1 y 12");

            }
            this.mes = mes;
        } catch (FormatoDataErroneo e){
            this.mes=1;
            throw e;

        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        try {
            if(ano < 1970 || ano > 2999){
                throw new FormatoDataErroneo("Año debe de estar comprendido entre 1970 y 2999");
            }
            this.ano = ano;

        } catch (FormatoDataErroneo e){
            this.ano = 1970;
            throw e;

        }
    }

    private void validarDia(int dia, int mes, int ano){
        int maxDias = 31;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            maxDias = 30;

        } else if (mes == 2){
            maxDias = esBisiesto() ? 29 : 28;
        }
        if (dia < 1 || dia > maxDias){
            throw new FormatoDataErroneo("Día "+ dia + " no valido para mes " + mes +
                    " en año" + ano+". Debe estar entre 1 y "+maxDias);
        }
    }

    public boolean dataIgual (Data outraData){
        return this.dia == outraData.dia &&
                this.mes == outraData.mes &&
                this.ano == outraData.ano;
    }

    public void mostrarData(){
        System.out.println(dia + "/" + mes + "/"+ano);
    }

    public boolean esBisiesto(){
        return (ano % 4==0 );
    }




}