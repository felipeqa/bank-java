import javax.sound.midi.Soundbank;

public class TestaTributaveis {

    public static void main(String[] args) {
        SeguroVida sv = new SeguroVida();
        ContaCorrente cc = new ContaCorrente(1212, 2323);
        cc.deposita(100);

        CalculadorImposto imposto = new CalculadorImposto();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);
        calc.registra(sv);
        System.out.println(calc.getTotalImposto());

        imposto.registra(cc);
        imposto.registra(sv);
        System.out.println(imposto.getTotalImposto());
    }
}
