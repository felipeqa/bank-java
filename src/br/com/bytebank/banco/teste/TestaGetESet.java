package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Cliente;

public class TestaGetESet {

    public static void main(String[] args) {
        //Criando um objeto do tipo ContaCorrente com a referencia da Conta
        Conta conta = new ContaCorrente(1212, 12121);
        conta.setAgencia(1222);
        conta.setNumeroConta(96980);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumeroConta());

        Cliente paula = new Cliente();
        //conta.titular = paula;

        conta.setTitular(paula);
        Cliente paulaCliente = conta.getTitular();

        System.out.println("Mesma referencia " + paula);
        System.out.println("Mesma referencia " + paulaCliente);
        System.out.println("Mesma referencia " + conta.getTitular());

        conta.deposita(1000);
        System.out.println("Saldo atual " + conta.getSaldo() );
        conta.saca(100);
        System.out.println("Saldo atual " + conta.getSaldo() );
        conta.getTitular().setNome("Paula Rodrigues");
        System.out.println("Cliente " + conta.getTitular().getNome());
        conta.getTitular().setCpf("343.343.343.00");
        System.out.println(conta.getTitular().getCpf());
        conta.getTitular().setProfissao("QA");
        System.out.println(conta.getTitular().getProfissao());

        System.out.println("Total de contas: " + Conta.getTotal());

    }
}
