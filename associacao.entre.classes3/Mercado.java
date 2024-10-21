public class Mercado {
    private Prateleira prateleira1;
    private Prateleira prateleira2;
    
    public Mercado(Prateleira prateleira1, Prateleira prateleira2) {
        this.prateleira1 = prateleira1;
        this.prateleira2 = prateleira2;
    }
    
    public Prateleira getPrateleira1() {
        return prateleira1;
    }
    public Prateleira getPrateleira2() {
        return prateleira2;
    }
    
    public double mediaValorProdutos() {
        double totalPreco = 0;
        int i = 0;
        
        if (prateleira1.getProduto1() != null) {
            totalPreco += prateleira1.getProduto1().getPreco();
            i++;
        }
        if (prateleira1.getProduto2() != null) {
            totalPreco += prateleira1.getProduto2().getPreco();
            i++;
        }
        if (prateleira1.getProduto3() != null) {
            totalPreco += prateleira1.getProduto3().getPreco();
            i++;
        }
        if (prateleira2.getProduto1() != null) {
            totalPreco += prateleira2.getProduto1().getPreco();
            i++;
        }
        if (prateleira2.getProduto2() != null) {
            totalPreco += prateleira2.getProduto2().getPreco();
            i++;
        }
        if (prateleira2.getProduto3() != null) {
            totalPreco += prateleira2.getProduto3().getPreco();
            i++;
        }
        
        return i > 0 ? totalPreco / i : 0;
    }
}
