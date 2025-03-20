package progra.boletines.boletin9.Conta;

public class Conta {
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public double gettInterese() {
        return tInterese;
    }

    public void settInterese(double tInterese) {
        this.tInterese = tInterese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private String nomeCliente;
    private String nConta;
    private double tInterese;
    private double saldo;

    public Conta(String nomeCliente, String nConta, double tInterese, double saldo) {
        this.nomeCliente = nomeCliente;
        this.nConta = nConta;
        this.tInterese = tInterese;
        this.saldo = saldo;
    }

    public Conta() {
        this.nomeCliente = "";
        this.nConta = "";
        this.tInterese = 0;
        this.saldo = 0;
    }

    public void ingreso(double cantidade){
        this.saldo += cantidade;
    }

    public void reintegro(double cantidade){
        this.saldo -= cantidade;
    }

    public void transferencia(double cantidade, String nConta){
        this.saldo -= cantidade;
        System.out.println("Se an tranferido "+cantidade+"€ a la cuenta "+nConta+",te quedan "+this.saldo);
    }
}
