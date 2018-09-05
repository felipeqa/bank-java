package br.com.bytebank.banco.testeutil;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(22,33);
        Conta conta2 = new ContaCorrente(22,44);
        Conta conta3 = new ContaCorrente(22,11);
        Conta conta4 = new ContaCorrente(22,22);

        conta1.deposita(333);
        conta2.deposita(444);
        conta3.deposita(111);
        conta4.deposita(222);

        List<Conta> lista = new ArrayList<>();

        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        lista.add(conta4);

        for(Conta conta : lista) System.out.println(conta);

        System.out.println("-------------------");

        NumeroDaContaComparador comparador = new NumeroDaContaComparador();

        lista.sort(comparador);

        for(Conta conta : lista) System.out.println(conta);
    }
}

class NumeroDaContaComparador implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        if(c1.getNumeroConta() < c2.getNumeroConta()){
            return -1;
        }

        if(c1.getNumeroConta() > c2.getNumeroConta()){
            return 1;
        }

        return 0;
    }

}
