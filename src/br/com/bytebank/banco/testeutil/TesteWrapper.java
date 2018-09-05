package br.com.bytebank.banco.testeutil;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        //listas guardam sempre a referencia
        int idade = 29; //Class Integer
        Integer idadeRef = new Integer(29); //autoboxing
        int valor = idadeRef.intValue(); //unboxing
        System.out.println("Valor é " + valor);

        Integer idadeRefDois = Integer.valueOf(29);//autoboxing
        Integer valorDois = Integer.valueOf(idadeRefDois);
        System.out.println("Valor dois é " + valorDois.doubleValue());
        System.out.println();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        System.out.println();

        String s = args[0];
        int valorString = Integer.valueOf(s);
        int valorStringDois = Integer.parseInt(s);
        System.out.println("Valor String " + valorString);
        System.out.println("Valor String Dois " + valorStringDois);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);//autoboxing
        numeros.add(idade);
        numeros.add(idadeRef);

        for(Integer num : numeros){
            System.out.println(num);
        }
    }
}
