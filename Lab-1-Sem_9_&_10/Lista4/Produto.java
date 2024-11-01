public class Produto {
    private String nome;
    private String descricao;
    private double valor;

    // Construtor
    public Produto(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método toString
    @Override
    public String toString() {
        return "Produto: " + nome + ", Descrição: " + descricao + ", Valor: R$ " + valor;
    }
}