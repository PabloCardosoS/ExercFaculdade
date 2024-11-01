public class Turma {
    private String codigo;
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;
    
    public Turma(String codigo, Aluno aluno1, Aluno aluno2, Aluno aluno3) {
        this.codigo = codigo;
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
    }
    
    public double mediaNotasTurma() {
        double soma = 0;
        int contador = 0;
        if (aluno1 != null) {
            soma += aluno1.calculaNotaFinal();
            contador++;
        }
        if (aluno2 != null) {
            soma += aluno2.calculaNotaFinal();
            contador++;
        }
        if (aluno3 != null) {
            soma += aluno3.calculaNotaFinal();
            contador++;
        }
        return (contador == 0) ? -1 : soma / contador;
    }
    
    public void alteraNotasGrauA(String nome, double novaNotaTrabalho, double novaNotaProva) {
        Aluno aluno = encontrarAlunoPorNome(nome);
        if (aluno != null) {
            GrauA ga = aluno.getGa();
            if (ga != null) {
                ga.setNotaTrabalho(novaNotaTrabalho);
                ga.setNotaProva(novaNotaProva);
                System.out.println("Notas do Grau A do aluno " + nome + " atualizadas.");
            }
        } else {
            System.out.println("Aluno no encontrado: " + nome);
        }
    }
    public void alteraNotasGrauB(String nome, double novaNotaAtividades, 
        double novaNotaSeminario, double novaNotaParticipacao) {
        Aluno aluno = encontrarAlunoPorNome(nome);
        if (aluno != null) {
            GrauB gb = aluno.getGb();
            if (gb != null) {
                gb.setNotaAtividades(novaNotaAtividades);
                gb.setNotaSeminario(novaNotaSeminario);
                gb.setNotaParticipacao(novaNotaParticipacao);
                System.out.println("Notas do Grau B do aluno " + nome + " atualizadas.");
            }
        }
    }
    
    private Aluno encontrarAlunoPorNome(String nome) {
        if (aluno1 != null && aluno1.getNome().equalsIgnoreCase(nome))
            return aluno1;
        if (aluno2 != null && aluno2.getNome().equalsIgnoreCase(nome))
            return aluno2;
        if (aluno3 != null && aluno3.getNome().equalsIgnoreCase(nome))
            return aluno3;
        return null;
    }
    
    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Aluno getAluno1() {
        return aluno1;
    }

    public void setAluno1(Aluno aluno1) {
        this.aluno1 = aluno1;
    }

    public Aluno getAluno2() {
        return aluno2;
    }

    public void setAluno2(Aluno aluno2) {
        this.aluno2 = aluno2;
    }

    public Aluno getAluno3() {
        return aluno3;
    }

    public void setAluno3(Aluno aluno3) {
        this.aluno3 = aluno3;
    }

    @Override
    public String toString() {
        return "Turma [codigo=" + codigo + ", aluno1=" + aluno1 + ", aluno2=" + aluno2 + 
        ", aluno3=" + aluno3 + "]";
    }
}
