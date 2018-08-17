import java.sql.SQLOutput;

public class TestaContas {

    public static void main(String[] args) {

        SeguroVida sv = new SeguroVida();

        CalculadorImposto imposto = new CalculadorImposto();

        ContaCorrente cc = new ContaCorrente(1212, 2323);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(7878, 9898);
        cp.deposita(200);
        System.out.println("CC antes " + cc.getSaldo());
        System.out.println("CP antes " + cp.getSaldo());

        try{
            cc.transfere(10, cp);
            //aqui estoura um exception
            cc.transfere(1088, cp);
        } catch(SaldoInsuficienteExceptionChecked ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("CC depois " + cc.getSaldo());
        System.out.println("CP depois " + cp.getSaldo());

        System.out.println(cc.getValorImposto());
        System.out.println(sv.getValorImposto());




        System.out.println(imposto.calculaTributo(cc));
        System.out.println( imposto.calculaTributo(sv));


    }
}
