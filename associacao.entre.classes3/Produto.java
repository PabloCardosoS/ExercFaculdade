public class Produto {
    private String nome;
    private double preco;
    private Data validade;
    
    public Produto(String nome, double preco, Data validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Data getValidade() {
        return validade;
    }
    public void setValidade(Data validade) {
        this.validade = validade;
    }
    
    @Override
    public String toString() {
        return "O produto: "+ this.getNome() + " tem o preco de " + this.getPreco() 
            + ".\nData de Validade: " + this.getValidade();
    }
    
    public boolean verificaProdutoVencido(Data data) {
        if (data.getAno() > validade.getAno()) {
            return true;
        } else if (data.getAno() == validade.getAno()) {
            if (data.getMes() > validade.getMes()) {
                return true;
            } else if (data.getMes() == validade.getMes()) {
                if (data.getDia() > validade.getDia()) {
                    return true;
                }
            }
        }
        return false;
    }
    
}