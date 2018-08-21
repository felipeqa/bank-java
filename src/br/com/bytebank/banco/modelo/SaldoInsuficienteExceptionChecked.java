package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteExceptionChecked extends Exception{

    public SaldoInsuficienteExceptionChecked(String msg){
        super(msg);
    }
}
