package br.com.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {

        int a = 3;
        String nome = "Felipe"; //object literal

        String novoNome = nome.replace("e", "E");
        String novoNomeDois = nome.toLowerCase();
        String subString = nome.substring(2);
        String stringComEspaco = "               FELIPE RODRIGUES     ";
        String stringTrim = stringComEspaco.trim();
        System.out.println("String " + nome);
        System.out.println("String nome depois do método replace " + novoNome);
        System.out.println("String depois do metódo down case " + novoNomeDois);
        System.out.println("charAt 0 da string nome  = " + nome.charAt(0));
        System.out.println("indexOf pe da string nome  = " + nome.indexOf("pe"));
        System.out.println("Substring do Nome a partir do index 2 " + subString);

        for(int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }

        System.out.println(stringComEspaco);
        System.out.println(stringTrim);
        System.out.println("String contains FEL = "+ stringComEspaco.contains("FEL"));
        System.out.println("String contains fel = "+ stringComEspaco.contains("fel"));





    }
}
