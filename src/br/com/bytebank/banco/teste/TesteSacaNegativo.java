package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteSacaNegativo {

    public static void main(String[] args) {
        //Criando um objeto do tipo ContaPoupanca com a referencia da Conta
        Conta conta = new ContaPoupanca(1212, 12121);
        conta.deposita(100);
        System.out.println(conta.getSaldo());

        System.out.println(conta.getSaldo());

    }
}
