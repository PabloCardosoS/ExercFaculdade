public class Corredor extends Atleta {
    private double peso;
    private Competicao competicao;
    
    public Corredor(String nome, int idade, double peso, Competicao competicao) {
        super(nome, idade);
        this.peso = peso;
        this.competicao = competicao;
    } 
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public Competicao competicao() {
        return competicao;
    }
    public void setCompeticao(Competicao competicao) {
        this.competicao = competicao;
    }
    
    public void imprimeCompeticao() {
        System.out.println("A competicao que o corredor " + getNome() + " esta participando e "
                + competicao + ".");
    }
    
    @Override
    public void imprimeInfo() {
        System.out.println("Corredor{Nome: " + getNome() + ", Idade: " + getIdade() +
                            ", Peso: " + peso + ", Competicao: " + competicao + "}");
    }
}