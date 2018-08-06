public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaFelipe = new Conta(1212, 1212);
        contaFelipe.deposita(100);
        contaFelipe.deposita(150);
        System.out.println(contaFelipe.getSaldo());
        boolean conseguiuSacar = contaFelipe.saca(10);
        System.out.println(contaFelipe.getSaldo());
        System.out.println(conseguiuSacar);

        Conta contaMarcela = new Conta(1212, 12121);
        contaMarcela.deposita(1000);
        boolean sucesso = contaMarcela.transfere(100, contaFelipe);
        if(sucesso){
            System.out.println("Transferencia feita com Sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
        System.out.println(contaMarcela.getSaldo());
        System.out.println(contaFelipe.getSaldo());

        // inicializando titular => classe cliente
        contaFelipe.setTitular(new Cliente());
        contaFelipe.getTitular().setNome("Felipe Rodrigue");
        System.out.println(contaFelipe.getTitular().getNome());

        // Associando um cliente a uma conta

        Cliente rosangela = new Cliente();
        rosangela.setNome("Rosangela Cardoso");
        rosangela.setCpf("333.333.333-36");
        rosangela.setProfissao("Scrum Master");
        Conta contaRosangela = new Conta(1212, 12121);
        contaRosangela.deposita(10000);
        contaRosangela.setTitular(rosangela);
        System.out.println(contaRosangela.getTitular().getNome());
        contaRosangela.getTitular().setNome("Outro nome");
        System.out.println(contaRosangela.getTitular().getNome());
        System.out.println(contaRosangela.getTitular().getCpf());
        System.out.println(contaRosangela.getTitular().getProfissao());
        System.out.println(contaRosangela.getTitular());

        System.out.println("Total de contas: " + Conta.getTotal());

    }
}
