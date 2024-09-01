package EX4;
import  java.util.Scanner;
public class Prova2AVEstruturaDeDados {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        int opc = 0;
        while (opc != 4) {
            System.out.println("");
            System.out.println("## ÁRVORE BINÁRIA ##");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Sair");
            System.out.println("");
            System.out.print("Informe a opção desejada: ");
            opc = leia.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Informe o valor a ser inserido: ");
                    int valor = leia.nextInt();
                    tree.insert(valor);
                    System.out.println("Valor inserido na árvore.");
                    break;
                case 2:
                    System.out.println("Listagem da árvore:");
                    tree.inorder();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
