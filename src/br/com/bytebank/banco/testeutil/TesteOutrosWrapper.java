package br.com.bytebank.banco.testeutil;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {

    public static void main(String[] args) {


        Integer idadeRef = Integer.valueOf(29);//autoboxing
        System.out.println(idadeRef.intValue());

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Integer.valueOf(23);
        Number refDouble = Double.valueOf(3.3);
        Number refFloatLiteral = Float.valueOf(3.9f);

        System.out.println("Inteiro " + refNumero + ", Double " + refDouble + ", Float Literal" + refFloatLiteral);

        List<Number> lista = new ArrayList<>();
        lista.add(23);
        lista.add(23.3);
        lista.add(1.132f);

        for(Number num : lista){
            System.out.println(num);
        }
    }
}
