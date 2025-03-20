package progra.boletines.boletin9.Conta;

public class Main {
    public static void main(String[] args){

        Conta conta = new Conta( "Sandark","453784",5000,5000);

        System.out.println(conta.getSaldo());

        conta.transferencia(67,"214");

        System.out.println(conta.getSaldo());
    }
}
