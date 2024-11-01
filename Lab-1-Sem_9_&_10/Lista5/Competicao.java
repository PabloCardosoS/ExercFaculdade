public class Competicao {
    private String nome;
    private Data data;
    
    public Competicao(String nome, Data data) {
        this.nome = nome;
        this.data = data;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
    
    public void imprimeData() {
        System.out.println("Competicao: Nome: " + nome + ", Data: " + data); 
    }
}