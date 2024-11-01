public class Cadeira {
    private Cor cor;
    private Aluno aluno;
    
    public Cadeira(Cor cor) {
        this.cor = cor;
        this.aluno = null;
    }
    
    public Cor getCor() {
        return cor;
    }
    public void setCor(Cor cor) {
        this.cor = cor;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void ocupar(Aluno aluno) { // se comporta como setAluno
        this.aluno = aluno;
    }
    public void desocupar() {
        this.aluno = null;
    }
    public boolean isOcupada() {
        return aluno != null;
    }
    @Override
    public String toString() {
        return "Cadeira{" + "cor=" + cor + ", aluno=" 
            + (aluno != null ? aluno : "desocupada") + '}';
    }
}