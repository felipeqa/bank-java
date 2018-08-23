package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    //Invocando o construtor da super classe
    public ContaCorrente(int agencia, int numeroConta){
        super(agencia, numeroConta);
    }

    @Override
    public void saca(double valor) {
        double valorASacar = valor;
        super.saca(valorASacar);
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteExceptionChecked{
        double taxa = 0.5;
        if(valor > super.getSaldo()){
            throw new SaldoInsuficienteExceptionChecked("Saldo Insuficiente");
        }else{
            super.saca(valor + taxa);
            destino.deposita(valor);
        }
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

    @Override
    public String toString() {
        return "Conta Corrente, " + super.toString();
    }
}
