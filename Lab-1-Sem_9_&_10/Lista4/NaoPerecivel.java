public class NaoPerecivel extends Produto {
    private Data dataFabricacao;
    
    public NaoPerecivel(String nome, String descricao, double valor, Data dataFabricao) {
        super(nome, descricao, valor);
        this.dataFabricacao = dataFabricacao;
    }
    
    // Métodos de acesso
    public Data getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Data dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    public String toString() {
        return super.toString() + ", Data de Fabricacao: " + dataFabricacao;
    }
}
