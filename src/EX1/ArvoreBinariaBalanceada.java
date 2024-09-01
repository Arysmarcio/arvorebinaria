package EX1;

public class ArvoreBinariaBalanceada {
    No raiz;

    public ArvoreBinariaBalanceada() {
        this.raiz = null;
    }
    public void inserir(int valor) {
        this.raiz = inserirRec(this.raiz, valor);
    }

    private No inserirRec(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirRec(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRec(no.direita, valor);
        }

        return no;
    }
    public void imprimirEmOrdem() {
        imprimirEmOrdemRec(this.raiz);
    }

    private void imprimirEmOrdemRec(No no) {
        if (no != null) {
            imprimirEmOrdemRec(no.esquerda);
            System.out.print(no.valor + " ");
            imprimirEmOrdemRec(no.direita);
        }
    }


    public static void main(String[] args) {
        ArvoreBinariaBalanceada arvore = new ArvoreBinariaBalanceada();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(20);

        System.out.println("Árvore em ordem:");
        arvore.imprimirEmOrdem();
    }




}
