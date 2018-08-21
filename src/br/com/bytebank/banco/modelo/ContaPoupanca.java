package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

    //Invocando o construtor da super classe
    public ContaPoupanca(int agencia, int numeroConta){
        super(agencia, numeroConta);
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteExceptionChecked{
        double taxa = 0.25;
        if(valor + taxa  > super.getSaldo()){
            throw new SaldoInsuficienteExceptionChecked("Saldo Insuficiente");
        }else{
            super.saca(valor + taxa);
            destino.deposita(valor);
        }
    }

    public void sacaPoupanca(double valor) throws SaldoInsuficienteExceptionChecked{
        if(super.getSaldo() < valor){
            throw new SaldoInsuficienteExceptionChecked("Erro saldo insuficiente");
        } else {
            double saldoAtual = super.getSaldo();
            super.saca(saldoAtual);

        }
    }

}
