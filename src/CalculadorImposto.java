public class CalculadorImposto {
    //minha variavel
    private double total;


    private double totalImposto;

    //Minha implementação
    public double calculaTributo(Tributavel t){
        this.total += t.getValorImposto();
        return this.total;
    }

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }

}
