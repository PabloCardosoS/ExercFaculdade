public class Aluno {
    private String nome;
    private GrauA ga;
    private GrauB gb;
    
    public Aluno(String nome, GrauA ga, GrauB gb) {
        this.nome = nome;
        this.ga = ga;
        this.gb = gb;
    }
    
     // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GrauA getGa() {
        return ga;
    }

    public void setGa(GrauA ga) {
        this.ga = ga;
    }

    public GrauB getGb() {
        return gb;
    }

    public void setGb(GrauB gb) {
        this.gb = gb;
    }

    public double calculaNotaFinal() {
        return (ga.calculaNotaFinalGrau() * 0.33) + (gb.calculaNotaFinalGrau() * 0.67);
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", grauA=" + ga + ", grauB=" + gb + "]";
    }
}
