public class CarrinhoDeCompras {
    private Produto[] produtos;
    private int tamanhoAtual;
    private static final int TAMANHO_MAXIMO = 10;

    public CarrinhoDeCompras() {
        produtos= new Produto[TAMANHO_MAXIMO];
        tamanhoAtual = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (tamanhoAtual < TAMANHO_MAXIMO) {
            produtos[tamanhoAtual] = produto;
            tamanhoAtual++;
            System.out.println("Produto adicionado no carrinho.");
        } else {
            System.out.println("O carrinho está cheio. Não é possível adicionar mais produto.");
        }
    }

    public void removerProduto(int indice) {
        if (indice >= 0 && indice < tamanhoAtual) {
            for (int i = indice; i < tamanhoAtual - 1; i++) {
                produtos[i] = produtos[i + 1];
            }
            produtos[tamanhoAtual - 1] = null;
            tamanhoAtual--;
            System.out.println("Produto removido do carrinho.");
        } else {
            System.out.println("Índice inválido. Produto não encontrado no carrinho.");
        }
    }

    public void exibirCarrinho() {
        System.out.println("===== Carrinho de Compras =====");
        if (tamanhoAtual > 0) {
            for (int i = 0; i < tamanhoAtual; i++) {
                System.out.println("Produto " + i + ": " + produtos[i].getNome() + ", Preço: " + produtos[i].getPreco());
            }
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    public Produto acessarProduto(int indice) {
        if (indice >= 0 && indice < tamanhoAtual) {
            return produtos[indice];
        } else {
            System.out.println("índice inválido. Produto não encontrado no carrinho.");
            return null;
        }
    }

    public void pesquisarProduto(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < tamanhoAtual; i++) {
            if (produtos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto: " + produtos[i].getNome() + ", Preço: R$ " + produtos[i].getPreco());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }

}
