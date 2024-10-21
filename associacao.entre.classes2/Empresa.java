public class Empresa {
    private String nome;
    private FuncionarioCaixa func1;
    private FuncionarioCaixa func2;
    
    public Empresa(String nome, FuncionarioCaixa func1, FuncionarioCaixa func2) {
        this.nome = nome;
        this.func1 = func1;
        this.func2 = func2;
    }
    public Empresa(String nome) {
        this.nome = nome;
        this.func1 = null;
        this.func2 = null;
    }
    public Empresa() {
        this.nome = "Empresa padrão";
        this.func1 = null;
        this.func2 = null;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public FuncionarioCaixa func1() {
        return func1 = func1;
    }
    public void setFunc1(FuncionarioCaixa func1) {
        this.func1 = func1;
    }
    public FuncionarioCaixa func2() {
        return func2 = func2;
    }
    public void setFunc2(FuncionarioCaixa func2) {
        this.func2 = func2;
    }
    
    public void imprimeInfo() {
        System.out.println("Empresa: " + nome);
        if (func1 != null) {
            System.out.println("Funcionario 1: ");
            func1.imprimeInfo();
        } else {
            System.out.println("Funcionario 1 sem cargo definido.");
        }
        if (func2 != null) {
            System.out.println("Funcionario 2: ");
            func2.imprimeInfo();
        } else {
            System.out.println("Funcionario 2 sem cargo definido.");
        }
    }
    
}
