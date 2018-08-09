public class TestaValores {

    public static void main(String[] args) {

        //Criando um objeto do tipo ContaPupanca com a referencia da Conta
        Conta conta = new ContaPoupanca(1313, 12458);
        System.out.println("Agencia: " + conta.getAgencia() + " Conta: " + conta.getNumeroConta());
    }


}
