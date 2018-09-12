package br.com.bytebank.banco.testeutil;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacao {

    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(22,33);
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Nico");
        conta1.setTitular(cliente1);
        conta1.deposita(333.0);

        Conta conta2 = new ContaCorrente(22,44);
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Guilherme");
        conta2.setTitular(cliente2);
        conta2.deposita(444.0);

        Conta conta3 = new ContaCorrente(22,11);
        Cliente cliente3 = new Cliente();
        cliente3.setNome("Paulo");
        conta3.setTitular(cliente3);
        conta3.deposita(111.0);

        Conta conta4 = new ContaCorrente(22,22);
        Cliente cliente4 = new Cliente();
        cliente4.setNome("Ana");
        conta4.setTitular(cliente4);
        conta4.deposita(222.0);

//        conta1.deposita(333);
//        conta2.deposita(444);
//        conta3.deposita(111);
//        conta4.deposita(222);

        List<Conta> lista = new ArrayList<>();

        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        lista.add(conta4);

        for(Conta conta : lista) System.out.println(conta);

        System.out.println("-------------------");

//        NumeroDaContaComparador comparador = new NumeroDaContaComparador();
//        lista.sort(comparador);

        TitularDaContaComparator comparadorDeTitular = new TitularDaContaComparator();
        lista.sort(comparadorDeTitular);

        for(Conta conta : lista) System.out.println("Cliente, " + conta.getTitular().getNome() + " " + conta);
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

class TitularDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        String titularOne = c1.getTitular().getNome();
        String titularTwo = c2.getTitular().getNome();

        return titularOne.compareTo(titularTwo);
    }
}
