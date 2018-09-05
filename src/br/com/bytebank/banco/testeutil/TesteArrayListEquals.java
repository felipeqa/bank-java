package br.com.bytebank.banco.testeutil;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TesteArrayListEquals {

    public static void main(String[] args) {
        //Generics <>
        List<Conta> lista = new ArrayList<Conta>();

//        Conta cc1 = new ContaCorrente(22, 22);
//        Conta cc2 = new ContaCorrente(22, 22);
//
//        boolean igual = cc1.ehIgual(cc2);
//        System.out.println(igual);

        Conta conta1 = new ContaPoupanca(1212, 3636379);
        Conta conta2 = new ContaCorrente(4545,369852);
        Conta conta3 = new ContaPoupanca(1212, 3636379);
        lista.add(conta1);
        lista.add(conta2);

        boolean existe = lista.contains(conta3);

        System.out.println("Ja existe? " + existe);

//       for(Conta conta : lista){
//           if(conta.ehIgual(conta3)){
//                System.out.println("Ja tenho essa conta!!!");
//           }
//        }

        for(Conta conta : lista){
            System.out.println(conta);
        }

    }
}
