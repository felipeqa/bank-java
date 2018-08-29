package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaLivre;

    public GuardadorDeReferencias(){
        this.referencias = new Object[10];
        this.posicaLivre = 0;
    }

    public void adiciona(Object ref) {
        this.referencias[this.posicaLivre] = ref;
        posicaLivre++;
    }

    public int getQuatidadeDeReferencias() {
        return this.posicaLivre;
    }

    public Object getReferencia(int index) {
        return this.referencias[index];
    }
}
