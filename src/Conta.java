public class Conta {

    private double saldo;
    private int agencia;
    private int numeroConta;
    private Cliente titular;
    private static int total;



    // alterando o construtor da classe
    public Conta(int agencia, int numeroConta){

        System.out.println("Criando uma conta!!!");
        //podemos usar essa abordagem
        this.setNumeroConta(numeroConta);
        this.setAgencia(agencia);

        //ou essa abordagem
        this.numeroConta = numeroConta;
        this.agencia = agencia;

        //Contando o total de vezes que a classe foi inicializada
        Conta.total ++;
    }

    // usando dois construtores, caso inicialize assim faça isso
    public Conta(){
        this(2000, 30000);
    }

    public void deposita(double valor){
        // this.saldo = this.saldo + valor;
        if(valor > 0){
            this.saldo += valor;
            return;
        }else{
            System.out.println("Tentativa de deposito de um valor negativo");
        }

    }

    public boolean saca(double valor){
        if(this.saldo >= valor && valor > 0){
            // this.saldo = this.saldo - valor;
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor && valor > 0){
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

    // Metódo static é um metodo da classe, e não de uma referencia
    public static int getTotal(){
        return Conta.total;
    }
}
