public class TesteSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta(1212, 12121);
        conta.deposita(100);
        System.out.println(conta.saca(200));

        System.out.println(conta.getSaldo());

    }
}
