package br.com.bytebank.banco.testeutil;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteGenerics {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();
        ArrayList<String> nomes = new ArrayList<String>();

        Conta conta1 = new ContaPoupanca(1212, 3636379);
        Conta conta2 = new ContaCorrente(4545,369852);

        lista.add(conta1);
        lista.add(conta2);

        System.out.println("Quantidade de Objetos atualmente " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumeroConta());
        lista.remove(0);

        Conta conta3 = new ContaPoupanca(0001, 999999);
        Conta conta4 = new ContaCorrente(5000,321321);

        lista.add(conta3);
        lista.add(conta4);

        System.out.println("Quantidade de Objetos atualmente " + lista.size());

        for (int i = 0; i < lista.size(); i++ ){
            Object referencia = lista.get(i);
            System.out.println(referencia);
        }

        System.out.println("----------------");

        for(Conta conta : lista){
            System.out.println(conta);
        }

    }
}
