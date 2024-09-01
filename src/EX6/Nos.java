package EX6;

import EX5.No;

public class Nos {
    int valor;
    Nos esquerda;
    Nos direita;

    public Nos(int novovalor) {
        this.valor = novovalor;
        this.esquerda = null;
        this.direita = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nos getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Nos esquerda) {
        this.esquerda = esquerda;
    }

    public Nos getDireita() {
        return direita;
    }

    public void setDireita(Nos direita) {
        this.direita = direita;
    }
}