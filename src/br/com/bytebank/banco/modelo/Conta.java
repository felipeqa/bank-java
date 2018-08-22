package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 *
 * @author Felipe Rodrigues
 */

// transformando a classe Conta em abstract
public abstract class Conta {

    private double saldo;
    private int agencia;
    private int numeroConta;
    private Cliente titular;
    private static int total;

    /**
     *  Construtor para inicializar uma conta é preciso de uma agencia e conta valida
     * @param agencia 1212
     * @param numeroConta 31313
     */
    // alterando o construtor da classe
    public Conta(int agencia, int numeroConta){

        System.out.println("Criando uma conta!!!");

        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numeroConta < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
        //podemos usar essa abordagem
        this.setNumeroConta(numeroConta);
        this.setAgencia(agencia);

        //ou essa abordagem
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        //this.saldo = 100;

        //Contando o total de vezes que a classe foi inicializada
        Conta.total ++;
        System.out.println("O total de contas é " + Conta.total);
        System.out.println("Estou criando uma conta " + this.numeroConta);
    }

    // usando dois construtores, caso inicialize assim faça isso
    public Conta(){
        //usando o construtor public Conta(int agencia, int numeroConta){
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

    /**
     *  Sacar somente se o valor for menor que o saldo
     * @param valor 12
     */
    public void saca(double valor){
        if(this.saldo < valor){
            throw new SaldoInsuficienteExceptionUnchecked("Deu muito Ruim");
        } else {
            this.saldo -= valor;
        }
    }

    public abstract void transfere(double valor, Conta destino) throws SaldoInsuficienteExceptionChecked;

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        if(numeroConta <= 0){
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numeroConta = numeroConta;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;}
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
