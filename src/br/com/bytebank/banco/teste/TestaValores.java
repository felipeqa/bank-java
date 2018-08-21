package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaValores {

    public static void main(String[] args) {

        //Criando um objeto do tipo ContaPupanca com a referencia da Conta
        Conta conta = new ContaPoupanca(1313, 12458);
        System.out.println("Agencia: " + conta.getAgencia() + " Conta: " + conta.getNumeroConta());
    }


}
