public class ContaCorrente extends Conta implements Tributavel {

    //Invocando o construtor da super classe
    public ContaCorrente(int agencia, int numeroConta){
        super(agencia, numeroConta);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor;
        return super.saca(valorASacar);
    }

    public boolean transfere(double valor, Conta destino){
        if(super.getSaldo() >= valor && valor > 0){
            double taxa = 0.5;
            super.saca(valor + taxa);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }
}
