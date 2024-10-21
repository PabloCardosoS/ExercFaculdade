public class Pessoa {
    private String nome, endereco;
    private char sexo;
    private int idade, qtIrmaos;
    private double altura;
    
    public Pessoa(String nome, char sexo, int idade, double altura, int qtIrmaos, String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.qtIrmaos = qtIrmaos;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getQtIrmaos() {
        return qtIrmaos;
    }
    public void setQtIrmaos(int qtIrmaos) {
        this.qtIrmaos = qtIrmaos;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void imprimeInformacoes() {
        System.out.println("______________________________");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Quantidade de Irmãos: " + qtIrmaos);
        System.out.println("Endereço: " + endereco);
    }
    
    public boolean isFilhoUnico() {
        return qtIrmaos == 0;
    }
    
}
