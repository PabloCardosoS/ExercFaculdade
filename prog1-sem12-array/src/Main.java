import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== Carrinho de Compras =====" +
                    "\n 1. Adicionar produto" +
                    "\n 2. Remover produto" +
                    "\n 3. Exibir carrinho" +
                    "\n 4. Acessar produto" +
                    "\n 5. Pesquisar produto" +
                    "\n 0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço: ");
                    double preco = scanner.nextDouble();

                    Produto produto = new Produto(nome, preco);
                    carrinhoDeCompras.adicionarProduto(produto);
                    break;
                case 2:
                    System.out.print("Digite o índice do produto a ser removido: ");
                    int indiceRemover = scanner.nextInt();
                    carrinhoDeCompras.removerProduto(indiceRemover);
                    break;
                case 3:
                    carrinhoDeCompras.exibirCarrinho();
                    break;
                case 4:
                    System.out.print("Digite o índice do produto a ser acessado: ");
                    int indiceAcessar = scanner.nextInt();
                    Produto produtoAcessado = carrinhoDeCompras.acessarProduto(indiceAcessar);
                    if (produtoAcessado != null) {
                        System.out.println("Produto acessado: " + produtoAcessado.getNome() +
                                ", Preço: " + produtoAcessado.getPreco());
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto a ser pesquisado: ");
                    String nomePesquisa = scanner.nextLine();
                    carrinhoDeCompras.pesquisarProduto(nomePesquisa);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Favor digitar um número válido.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}