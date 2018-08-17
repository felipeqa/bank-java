public class TestaMetodo {

    public static void main(String[] args) {

        //Criando um objeto do tipo ContaPoupanca com a referencia da Conta
        Conta contaFelipe = new ContaPoupanca(1212, 3332);
        contaFelipe.deposita(100);
        contaFelipe.deposita(150);
        System.out.println(contaFelipe.getSaldo());
        contaFelipe.saca(10);
        System.out.println(contaFelipe.getSaldo());


        //Criando um objeto do tipo ContaPoupanca com a referencia da Conta
        Conta contaMarcela = new ContaPoupanca(1212, 12121);
        contaMarcela.deposita(1000);
        double saldoMarcelaAntesDaTranferencia = contaMarcela.getSaldo();

        try{
            contaMarcela.transfere(100, contaFelipe);
        }catch (SaldoInsuficienteExceptionChecked ex){
            System.out.println(ex.getMessage());
        }

        if(saldoMarcelaAntesDaTranferencia > contaMarcela.getSaldo()){
            System.out.println("Transferencia feita com Sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
        System.out.println("Saldo Marcela: " + contaMarcela.getSaldo());
        System.out.println("Saldo Felipe" + contaFelipe.getSaldo());

        // inicializando titular => classe cliente
        contaFelipe.setTitular(new Cliente());
        contaFelipe.getTitular().setNome("Felipe Rodrigue");
        System.out.println(contaFelipe.getTitular().getNome());

        // Associando um cliente a uma conta

        Cliente rosangela = new Cliente();
        rosangela.setNome("Rosangela Cardoso");
        rosangela.setCpf("333.333.333-36");
        rosangela.setProfissao("Scrum Master");

        //Criando um objeto do tipo ContaCorrente com a referencia da Conta
        Conta contaRosangela = new ContaCorrente(1212, 4578);
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
