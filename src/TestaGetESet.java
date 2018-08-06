public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setAgencia(1222);
        conta.setNumeroConta(96980);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumeroConta());

        Cliente paula = new Cliente();
        //conta.titular = paula;

        conta.setTitular(paula);
        Cliente paulaCliente = conta.getTitular();

        System.out.println("Mesma referencia " + paula);
        System.out.println("Mesma referencia " + paulaCliente);
        System.out.println("Mesma referencia " + conta.getTitular());

        conta.deposita(1000);
        System.out.println("Saldo atual " + conta.getSaldo() );
        conta.saca(100);
        System.out.println("Saldo atual " + conta.getSaldo() );
        conta.getTitular().setNome("Paula Rodrigues");
        System.out.println("Cliente " + conta.getTitular().getNome());
        conta.getTitular().setCpf("343.343.343.00");
        System.out.println(conta.getTitular().getCpf());
        conta.getTitular().setProfissao("QA");
        System.out.println(conta.getTitular().getProfissao());

    }
}
