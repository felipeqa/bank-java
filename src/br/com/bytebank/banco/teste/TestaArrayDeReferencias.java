package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArrayDeReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente(1222,123456);
        contas[0] = cc1;
        ContaCorrente cc2 = new ContaCorrente(4545,987987);
        contas[1] = cc2;
        ContaCorrente ref = contas[1];

        System.out.println("Primeira Conta " + contas[0].getNumeroConta());
        System.out.println("Segunda Conta " + contas[1].getNumeroConta());
        System.out.println("Segunda Conta " + cc2.getNumeroConta());
        System.out.println("Segunda Conta " + ref.getNumeroConta());

        System.out.println("Total de Contas inicializadas = " + ContaCorrente.getTotal());
    }
}
