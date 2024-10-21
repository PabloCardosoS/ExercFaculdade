public class FuncionarioCaixa {
    private String nome;
    private String endereco;
    private char sexo;
    private Calculadora calculadora; // Associcao de classes aprendida na sem 7-8
    
    public FuncionarioCaixa() {
        this.nome = "Nome nao cadastrado";
        this.endereco = "Endereco nao cadastrado";
        this.sexo = '-';
        this.calculadora = new Calculadora("Preta");
    }
    public FuncionarioCaixa(String nome, String endereco, char sexo, Calculadora calculadora) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = calculadora;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Calculadora getCalculadora() {
        return calculadora;
    }
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    public double soma(double a, double b) {
        return calculadora.soma(a, b);
    }
    public double subtrai(double a, double b) {
        return calculadora.subtrai(a, b);
    }
    public double multiplica(double a, double b) {
        return calculadora.multiplica(a, b);
    }
    public double divide(double a, double b) {
        return calculadora.divide(a, b);
    }
    public long elevadoAoQuadrado(int a) {
        return calculadora.elevadoAoQuadrado(a);
    }
    public long elevadoAoCubo(int a) {
        return calculadora.elevadoAoCubo(a);
    }
    
    public void imprimeInfo() {
        System.out.printf("\nNome: %s ; Endereco: %s ; Sexo: %c.\n", nome, endereco, sexo);
        System.out.printf("\nCALCULADORA DO FUNCIONARIO: %s\n", nome);
        calculadora.imprimeInfo();
    }
}
