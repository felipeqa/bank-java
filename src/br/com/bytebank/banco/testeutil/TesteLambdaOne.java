package br.com.bytebank.banco.testeutil;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteLambdaOne {

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

        List<Conta> lista = new ArrayList<>();

        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        lista.add(conta4);

        lista.sort((c1, c2) -> Integer.compare(c1.getNumeroConta(), c2.getNumeroConta())); //LAMBDA

        lista.forEach(conta -> System.out.println("Cliente, " + conta.getTitular().getNome() + " " + conta)); //forEach com LAMBDA

        System.out.println("**********************************");

        Comparator<Conta> comp = (c1, c2) -> { //LAMBDA
                String titularOne = c1.getTitular().getNome();
                String titularTwo = c2.getTitular().getNome();

                return titularOne.compareTo(titularTwo);
        };

        lista.sort(comp);

        lista.forEach(new Consumer<Conta>() { // forEach com classe anonima
            @Override
            public void accept(Conta conta) {
                System.out.println("Cliente, " + conta.getTitular().getNome() + " " + conta);
            }
        });
    }
}