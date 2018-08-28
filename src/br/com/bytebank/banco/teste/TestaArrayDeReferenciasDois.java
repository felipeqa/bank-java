package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayDeReferenciasDois {

    public static void main(String[] args) {

        Object[] referencias = new Object[5];
        ContaCorrente cc1 = new ContaCorrente(1222,123456);
        referencias[0] = cc1;
        ContaPoupanca cc2 = new ContaPoupanca(4545,987987);
        referencias[1] = cc2;
        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        //fazer o cast
        Conta contaPoupancaCast  = (ContaPoupanca) referencias[1];
        Conta contaCorrenteCast = (ContaCorrente) referencias[0];

        //fazendo o Cast de um referencia ContaCorrente em um ContaPoupanca
        //ContaCorrente ref = (ContaCorrente) referencias[1];


        //System.out.println(cc2.getNumero());

        //Object referenciaGenerica = contas[1];

        //System.out.println( referenciaGenerica.getNumero() );


        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
        //Utilizar após o cast
        System.out.println("Primeira Conta " + contaPoupancaCast.getNumeroConta());
        //Utilizar após o cast
        System.out.println("Segunda Conta " + contaCorrenteCast.getNumeroConta());

        System.out.println("Segunda Conta " + cc2.getNumeroConta());
        System.out.println("Segunda Conta " + ref.getNumeroConta());

        System.out.println("Total de Contas inicializadas = " + ContaCorrente.getTotal());
    }
}
