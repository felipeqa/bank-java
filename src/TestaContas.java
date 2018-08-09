public class TestaContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1212, 2323);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(7878, 9898);
        cp.deposita(200);
        System.out.println("CC antes " + cc.getSaldo());
        System.out.println("CP antes " + cp.getSaldo());

        cc.transfere(10, cp);
        cp.transfere(20, cc);

        System.out.println("CC depois " + cc.getSaldo());
        System.out.println("CP depois " + cp.getSaldo());


    }
}
