import javax.sound.midi.Soundbank;

public class TesteReferencias {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira " + primeiraConta.saldo);

        //apontar duas referencias para o mesmo objeto
        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda " + segundaConta.saldo);

        segundaConta.saldo += 100;

        System.out.println("Saldo da primeira " + primeiraConta.saldo);

        Conta terceiraConta = new Conta();

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
            System.out.println("Segunda conta referencia" + segundaConta);
            System.out.println("Terceira conta referencia " + terceiraConta);
        }
    }
}
