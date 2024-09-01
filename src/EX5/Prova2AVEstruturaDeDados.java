package EX5;

import  java.util.Scanner;

public class Prova2AVEstruturaDeDados {

    private static No raiz = null;

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opc = 0;
        while (opc != 4) {
            System.out.println("");
            System.out.println("## ÁRVORE BINÁRIA ##");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Informe a opção desejada: ");
            opc = leia.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Informe o valor a ser inserido: ");
                    int valorInserir = leia.nextInt();
                    inserir(valorInserir);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser removido: ");
                    int valorRemover = leia.nextInt();
                    remover(valorRemover);
                    break;
                case 3:
                    System.out.println("Listagem da árvore:");
                    listar(raiz);
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private static No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        }

        return no;
    }


        private static void remover(int valor) {
            raiz = removerRecursivo(raiz, valor);
        }

        private static No removerRecursivo(No no, int valor) {
            if (no == null) {
                return no;
            }

            if (valor < no.valor) {
                no.esquerda = removerRecursivo(no.esquerda, valor);
            } else if (valor > no.valor) {
                no.direita = removerRecursivo(no.direita, valor);
            } else {
                // Nó com o valor a ser removido encontrado

                // Caso 1: Nó sem filhos ou com apenas um filho
                if (no.esquerda == null) {
                    return no.direita;
                } else if (no.direita == null) {
                    return no.esquerda;
                }

                // Caso 2: Nó com dois filhos
                no.valor = encontrarMenorValor(no.direita);

                // Remover o nó que tinha o menor valor
                no.direita = removerRecursivo(no.direita, no.valor);
            }

            return no;
        }

        private static int encontrarMenorValor(No no) {
            int menorValor = no.valor;
            while (no.esquerda != null) {
                menorValor = no.esquerda.valor;
                no = no.esquerda;
            }
            return menorValor;
        }


    private static void listar(No no) {
        if (no != null) {
            listar(no.esquerda);
            System.out.print(no.valor + " ");
            listar(no.direita);
        }
    }




}
