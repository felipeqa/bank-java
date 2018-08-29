package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TeastaGuardadorDeReferencias {

    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();
        Conta cc = new ContaCorrente(1212, 454566);
        Conta cp = new ContaPoupanca(9898, 323211);
        Cliente cliente = new Cliente();


        guardador.adiciona(cc);
        guardador.adiciona(cp);
        guardador.adiciona(cliente);

        int totalReferencias = guardador.getQuatidadeDeReferencias();
        System.out.println("Total de Referencias " + totalReferencias);

        Conta refCC = (Conta)guardador.getReferencia(0);
        Conta refCP = (Conta)guardador.getReferencia(1);
        System.out.println("Numero da Conta " + refCC.getNumeroConta());
        System.out.println("Numero da Conta " + refCP.getNumeroConta());
    }
}
