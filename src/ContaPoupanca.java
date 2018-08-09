public class ContaPoupanca extends Conta {

    //Invocando o construtor da super classe
    public ContaPoupanca(int agencia, int numeroConta){
        super(agencia, numeroConta);
    }

    public boolean transfere(double valor, Conta destino){
        if(this.getSaldo() >= valor && valor > 0){
            double taxa = 0.25;
            this.saca(valor + taxa);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

}
