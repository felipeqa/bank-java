package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class FinalTeste {

    public static void main(String[] args) {
        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(5555, 312555);
        ContaPoupanca cp = new ContaPoupanca(1222,313123);
        Cliente cliente = new Cliente();

        // to string sempre é chamado para exibir o que foi enviado aou sout
        System.out.println("CC = " + cc.toString());
        System.out.println("CP = " + cp);
        println();
        println("Referencia " + cp);
        println("Referencia " + cc);

    }

    static void println(){};
    static void println(int a) { }
    static void println(boolean valor) { }

    static void println(ContaCorrente conta) { }
    static void println(Object referencia){ }
}
