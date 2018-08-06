public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200.00) ;
        primeiraConta.setAgencia(1145);
        primeiraConta.setNumeroConta(96910);
        //primeiraConta.titular = "Felipe Rodrigues";

        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(500);
        segundaConta.setAgencia(1035);
        segundaConta.setNumeroConta(10109);
        //segundaConta.titular = "Rosangela Santos";

        System.out.println("A conta " + primeiraConta.getNumeroConta() + " tem " + primeiraConta.getSaldo() + " !" );
        System.out.println("A conta " + segundaConta.getNumeroConta() + " tem " + segundaConta.getSaldo() + " ! ");
        segundaConta.setTitular(new Cliente());
        System.out.println();

    }
}
