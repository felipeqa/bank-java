public class TestaContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1212, 2323);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(7878, 9898);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());


    }
}
