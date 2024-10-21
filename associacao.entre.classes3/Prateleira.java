public class Prateleira {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    
    public Prateleira(Produto produto1, Produto produto2, Produto produto3) {
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }
    public Prateleira() {
        this.produto1 = null;
        this.produto2 = null;
        this.produto3 = null;
    }
    
    public Produto getProduto1() {
        return produto1;
    }
    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }
    public Produto getProduto2() {
        return produto2;
    }
    public void setProduto2(Produto produto2) {
        this.produto2 = produto2;
    }
    public Produto getProduto3() {
        return produto3;
    }
    public void setProduto3(Produto produto3) {
        this.produto3 = produto3;
    }
    
    public Produto produtoMaisCaro() {
        Produto maisCaro = produto1;
        
        if (produto2 != null && (maisCaro == null || produto2.getPreco() > maisCaro.getPreco())) {
            maisCaro = produto2;
        }
        if (produto3 != null && (maisCaro == null || produto3.getPreco() > maisCaro.getPreco())) {
            maisCaro = produto3;
        }
        return maisCaro;
    }
    
    @Override
    public String toString() {
        if (produto1 == null && produto2 == null && produto3 == null) {
            return "A prateleira esta vazia.";
        }
        
        String res = "";
        if (produto1 !=  null) {
            res += "Produto 1: " + produto1.toString();
        }
        if (produto2 != null) {
            res += "Produto 2: " + produto2.toString();
        }
        if (produto3 != null) {
            res += "Produto 3: " + produto3.toString();
        }
        return res;
    }
}
