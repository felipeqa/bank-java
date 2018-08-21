package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteReferencias {

    public static void main(String[] args) {

        //Criando um objeto do tipo ContaCorrente com a referencia da Conta
        Conta primeiraConta = new ContaCorrente(1212, 12121);
        primeiraConta.deposita(300);

        System.out.println("Saldo da primeira " + primeiraConta.getSaldo());

        //apontar duas referencias para o mesmo objeto
        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda " + segundaConta.getSaldo());

        segundaConta.deposita(100);

        System.out.println("Saldo da primeira " + primeiraConta.getSaldo());

        //Criando um objeto do tipo ContaCorrente com a referencia da Conta
        Conta terceiraConta = new ContaCorrente(1212, 12121);

        // comparando as referencias iguais
        if(primeiraConta == segundaConta){
            System.out.println("São a mesma referencia");
        }

        //Comparando referencias diferentes
        if(primeiraConta == terceiraConta || segundaConta == terceiraConta){
            System.out.println("São a mesma referencia");
        }else{
            System.out.println("São referencias diferentes");
            System.out.println("Primeira conta referencia " + primeiraConta );
            System.out.println("Segunda conta referencia " + segundaConta);
            System.out.println("Terceira conta referencia " + terceiraConta);
        }
    }
}
