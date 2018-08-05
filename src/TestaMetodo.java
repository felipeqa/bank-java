public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaFelipe = new Conta();
        contaFelipe.saldo = 100;
        contaFelipe.deposita(150);
        System.out.println(contaFelipe.saldo);
        boolean conseguiuSacar = contaFelipe.saca(10);
        System.out.println(contaFelipe.saldo);
        System.out.println(conseguiuSacar);

        Conta contaMarcela = new Conta();
        contaMarcela.saldo = 1000;
        boolean sucesso = contaMarcela.transfere(3000, contaFelipe);
        if(sucesso){
            System.out.println("Transferencia feita com Sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
        System.out.println(contaMarcela.saldo);
        System.out.println(contaFelipe.saldo);

        //contaFelipe.titular.nome = "Felipe Rodrigues";
        System.out.println(contaFelipe.titular);

        // Associando um cliente a uma conta

        Cliente rosangela = new Cliente();
        rosangela.nome = "Rosangela Cardoso";
        rosangela.cpf = "333.333.333-36";
        rosangela.profissao = "Scrum Master";
        Conta contaRosangela = new Conta();
        contaRosangela.saldo = 10000;
        contaRosangela.titular = rosangela;
        contaRosangela.titular.nome = "Outro nome";
        System.out.println(contaRosangela.titular.nome);
        System.out.println(contaRosangela.titular.cpf);
        System.out.println(contaRosangela.titular.profissao);
        System.out.println(contaRosangela.titular);

    }
}
