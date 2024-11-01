public class Perecivel extends Produto {
    private Data dataValidade;
    
    public Perecivel(String nome, String descricao, double valor, Data dataValidade) {
        super(nome, descricao, valor);
        this.dataValidade = dataValidade;
    }

    // Métodos de acesso
    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Data de Validade: " + dataValidade;
    }
}
