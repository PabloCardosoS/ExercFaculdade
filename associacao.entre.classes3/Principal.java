public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("amarciante", 
            Teclado.leDouble("Digite o preco do amaciante: "),
            new Data(10, 4, 2014)
        );
        Produto produto2 = new Produto("creme dental", 
            Teclado.leDouble("Digite o preco do creme dental: "),
            new Data(5, 5, 2015)
        );
        Produto produto3 = new Produto("leite condensado",
            Teclado.leDouble("Digite o preco do leite condensado: "),
            new Data(4, 12, 2012)
        );
        
        Prateleira prateleira1 = new Prateleira(produto1, produto2, produto3);
        
        Prateleira prateleira2 = new Prateleira();
        Produto produto4 = new Produto("cortina", 167.98, new Data(13, 10, 2023));
        prateleira2.setProduto1(produto4);
        
        Mercado mercado = new Mercado(prateleira1, prateleira2);
        
        Data dataAtual = new Data(25, 04, 2023);
        
        // Verificar produto vencido na prateleira 1:
        if (prateleira1.getProduto1() != null 
            && prateleira1.getProduto1().verificaProdutoVencido(dataAtual)) {
                System.out.println(prateleira1.getProduto1().toString());
        }
        if (prateleira1.getProduto2() != null
            && prateleira1.getProduto2().verificaProdutoVencido(dataAtual)) {
                System.out.println(prateleira1.getProduto2().toString());
        }
        if (prateleira1.getProduto3() != null
            && prateleira1.getProduto3().verificaProdutoVencido(dataAtual)) {
                System.out.println(prateleira1.getProduto3().toString());
        }
        // Verificar produto vencido na prateleira 2:
        if (prateleira2.getProduto1() != null
            && prateleira2.getProduto1().verificaProdutoVencido(dataAtual)) {
                System.out.println(prateleira2.getProduto1().toString());
        }
        if (prateleira2.getProduto2() != null
            && prateleira2.getProduto2().verificaProdutoVencido(dataAtual)) {
                System.out.println(prateleira2.getProduto2().toString());
        }
        if (prateleira2.getProduto3() != null
            && prateleira2.getProduto3().verificaProdutoVencido(dataAtual)) {
                System.out.println(prateleira2.getProduto3().toString());
        }
        
        // Exibir o produto mais caro
        Produto maisCaro = mercado.getPrateleira1().produtoMaisCaro();
        if (maisCaro == null || (mercado.getPrateleira2().produtoMaisCaro() != null 
            && mercado.getPrateleira2().produtoMaisCaro().getPreco() > maisCaro.getPreco())) {
                maisCaro = mercado.getPrateleira2().produtoMaisCaro();    
        }
        
        System.out.println("\nProduto mais caro do mercado: ");
        System.out.println(maisCaro != null ? maisCaro.toString() : "Nao ha produto no mercado.");
        
        // Exibir a media de precos dos produtos do mercado
        System.out.println("\nMedia de preco dos produtos: R$ " + mercado.mediaValorProdutos());
        
                
    }
}
