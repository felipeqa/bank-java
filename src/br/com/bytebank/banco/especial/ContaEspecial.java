package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.SaldoInsuficienteExceptionChecked;
import br.com.bytebank.banco.modelo.Tributavel;

public class ContaEspecial extends Conta implements Tributavel {

    //Invocando o construtor da super classe
    public ContaEspecial(int agencia, int numeroConta){
        super(agencia, numeroConta);
    }

    @Override
    public void saca(double valor) {
        double valorASacar = valor;
        super.saca(valorASacar);
        // ver saldo sem o private, não é visivel para os filhos
        // double saldo; classe mãe
        //super.saldo;
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
}
