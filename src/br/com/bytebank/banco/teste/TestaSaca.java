package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Conta;

public class TestaSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(1212, 2381999);
        conta.deposita(100);
        conta.saca(90);
        System.out.println("Saldo atual é de : " + conta.getSaldo());

    }
}
