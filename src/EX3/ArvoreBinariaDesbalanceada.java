package EX3;

public class ArvoreBinariaDesbalanceada {
    private No raiz;

    public ArvoreBinariaDesbalanceada() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.filhoEsquerda = inserirRec(no.filhoEsquerda, valor);
        } else if (valor > no.valor) {
            no.filhoDireita = inserirRec(no.filhoDireita, valor);
        }

        return no;
    }

    // Método para exibir a árvore em ordem
    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(No no) {
        if (no != null) {
            emOrdemRec(no.filhoEsquerda);
            System.out.print(no.valor + " ");
            emOrdemRec(no.filhoDireita);
        }
    }

    public static void main(String[] args) {
        ArvoreBinariaDesbalanceada arvore = new ArvoreBinariaDesbalanceada();

        // Inserindo elementos na árvore de forma desbalanceada
        arvore.inserir(5);
        arvore.inserir(4);
        arvore.inserir(3);
        arvore.inserir(2);
        arvore.inserir(1);

        // Exibindo a árvore em ordem
        System.out.println("Árvore em ordem:");
        arvore.emOrdem();
    }


}
