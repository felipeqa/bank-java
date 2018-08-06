public class Conta {

    private double saldo;
    private int agencia;
    private int numeroConta;
    private Cliente titular;

    public void deposita(double valor){
        // this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >=valor){
            // this.saldo = this.saldo - valor;
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
