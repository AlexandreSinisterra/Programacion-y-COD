package progra.boletines.boletin10.ej2;


public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    private boolean esBisiesto;

    /**
     * Definimos un dia
     * @param dia el dia que definimos en el calendario
     * @param mes el mes que definimos en el calendario
     * @param ano el año que definimos en el calendario
     */
    public Fecha(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }
    private boolean validarFormatoFecha(String data) {
        return data.contains("-") || data.contains("/");
    }
    private boolean comprobarFormato(String data) {
        return (data.charAt(2) == '-' && data.charAt(5)=='-') || (data.charAt(2)=='/' && data.charAt(5)=='/');
    }
    private boolean comprobarNumero(String numero) {
        boolean esNumero = false;
        for (int i = 0; i < numero.length(); i++) {
            esNumero = Character.isDigit(numero.charAt(i));
        }
        return esNumero;
    }
    private String[] obtenerDias(String data) {
        String[] divisionFecha = new String[0];
        if (data.length()==10 && comprobarFormato(data)) {
            divisionFecha = data.split(Character.toString(data.charAt(2)));
        }
        return divisionFecha;
    }
    public Fecha(String data) {
        String[] divisionFecha = obtenerDias(data);
        /* Seteamos la fecha por defecto, en primera instancia*/
        setAno(1970);
        setMes(1);
        setDia(1);
        /* Comprobaremos si la fecha extraida cumple con los requerimientos */
        if (divisionFecha.length>0) {
            if (comprobarNumero(divisionFecha[0]) && comprobarNumero(divisionFecha[1]) && comprobarNumero(divisionFecha[2])) {
                setAno(Integer.parseInt(divisionFecha[2]));
                setMes(Integer.parseInt(divisionFecha[1]));
                setDia(Integer.parseInt(divisionFecha[0]));
            }
        }



    }

    /// Sirve para averiguar si el año es bisiesto
    /// ```java
    /// if ano MOD 4 == 0 && (ano MOD 100 !=0 || ano MOD 400 == 0)
    /// ```
    /// Es decir si el resto de **ano/4** es igual a 0 y el resto de **ano/100** es distinto a 0 o el resto de **ano/400** es igual a 0 es bisiesto
    /// @return si es bisiesto
    private boolean isEsBisiesto() {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    /**
     * Obtener dia por mes
     * @return la cantidad de dias por mes
     */
    private int obtenerDiasMes() {
        if (mes < 1 || mes > 12) {
            return -1;
        }
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (esBisiesto) {
            diasPorMes[1] = 29;
        }

        return diasPorMes[mes - 1];
    }

    /**
     * Incrementa el mes en uno
     */
    public void incrementarMes() {
        if (mes < 12) {
            mes += 1;
            if (dia>obtenerDiasMes()) {
                dia = 1;
            }
        }
        else if (mes==12) {
            mes = 1;
            dia = 1;
            incrementarAno();
        }
    }
    public void incrementarAno() {
        ano += 1;
        esBisiesto = isEsBisiesto();
    }
    public int incrementarDia(int diasIncrementar) {
        int diasPorMes = obtenerDiasMes();
        if (diasIncrementar+dia<diasPorMes) { // Si el dia es inferior al limite superior del mes
            this.dia += diasIncrementar; // Incrementamos en una cantidad especifica
        }
        else { // En caso contrario
            this.dia = 1; // Dia se resetea a 1
            incrementarMes(); // Se incrementa el mes
        }
        return dia;
    }
    public boolean equals(Fecha fecha) {
        return this.dia == fecha.dia && this.mes == fecha.mes && this.ano == fecha.ano;
    }
    public boolean equals(Object ob) {
        if (ob.getClass().getName().equals(this.getClass().getName())) {
            Fecha ob1 = (Fecha) ob;
            return this.getDia() == ob1.getDia() &&  this.getMes() == ob1.getMes() && this.getAno() == ob1.getAno();
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        int diasPorMes = obtenerDiasMes();
        if (dia<=diasPorMes && dia>=1) { // Si es menor al limite superior del mes y mayor que uno
            this.dia = dia; //  El dia de la fecha es igual al que pasamos por parametro
        }
        else if (dia>diasPorMes) { // Si el dia es mayor al limite superior del mes
            this.dia = 1; // Reseteamos el dia a 1
            incrementarMes(); // Incrementamos el mes
        }
        else { // En caso contrario
            this.dia = 1; // Reseteamos dia a 1
            this.mes = 1; // Reseteamos mes a 1
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes<=12 && mes>=1) {
            this.mes = mes;
        }
        else if (mes<1) {
            this.mes = 1;
        }
        else {
            incrementarAno();
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>=0) {
            this.ano = ano;
        }
        esBisiesto = isEsBisiesto();
    }
}