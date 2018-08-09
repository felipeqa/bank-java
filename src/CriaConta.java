public class CriaConta {
    public static void main(String[] args) {

        //Criando um objeto do tipo ContaCorrente com a referencia da Conta
        Conta primeiraConta = new ContaCorrente(1212, 12121);
        primeiraConta.deposita(200.00) ;
        primeiraConta.setAgencia(1145);
        primeiraConta.setNumeroConta(96910);
        //primeiraConta.titular = "Felipe Rodrigues";

        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        //Criando um objeto do tipo ContaPoupanca com a referencia da Conta
        Conta segundaConta = new ContaPoupanca(1212, 12121);
        segundaConta.deposita(500);
        segundaConta.setAgencia(1035);
        segundaConta.setNumeroConta(10109);
        //segundaConta.titular = "Rosangela Santos";

        System.out.println("A conta " + primeiraConta.getNumeroConta() + " tem " + primeiraConta.getSaldo() + " !" );
        System.out.println("A conta " + segundaConta.getNumeroConta() + " tem " + segundaConta.getSaldo() + " ! ");
        segundaConta.setTitular(new Cliente());
        System.out.println();

        System.out.println(Conta.getTotal());
        // Se o atributo não fosse privado poderia ser invocado assim:
        //System.out.println(Conta.total);

    }
}
