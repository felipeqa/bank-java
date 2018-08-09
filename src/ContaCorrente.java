public class ContaCorrente extends Conta {

    //Invocando o construtor da super classe
    public ContaCorrente(int agencia, int numeroConta){
        super(agencia, numeroConta);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
