public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200.00;
        primeiraConta.agencia = 1145;
        primeiraConta.numeroConta = 96910;
        primeiraConta.titular = "Felipe Rodrigues";

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;
        segundaConta.agencia = 1035;
        segundaConta.numeroConta = 10109;
        //segundaConta.titular = "Rosangela Santos";

        System.out.println("A conta " + primeiraConta.numeroConta + " tem " + primeiraConta.saldo + " !" );
        System.out.println("A conta " + segundaConta.numeroConta + " tem " + segundaConta.saldo + " ! ");
        System.out.println(segundaConta.titular);

    }
}
