package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

        //declarando de forma literal
        int[] refs = {10,20,30,40,50};

        for(int i = 0; i < idades.length; i++ ){
           idades[i] = i * i;
           System.out.println(idades[i]);
        }

        for(int i = 0; i < refs.length; i++){
            System.out.println(refs[i]);
        }
    }
}
