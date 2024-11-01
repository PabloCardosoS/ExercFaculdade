public class Principal {
    public static void main(String[] args) {
        // Le informacoes da turma
        String codigo = Teclado.leString("Digite o codigo da turma: ");
        
        // Le os dados dos alunos
        Aluno aluno1 = criarAluno(1);
        Aluno aluno2 = criarAluno(2);
        Aluno aluno3 = criarAluno(3);        
        
        // Criacao da turma
        Turma turma = new Turma(codigo, aluno1, aluno2, aluno3);
        
        // Imprime a media de notas da turma
        double media = turma.mediaNotasTurma();
        System.out.println("Media de notas da turma: " + media);
        
        // Avaliacao de cada aluno
        avaliarAlunos(turma);
        
    }
    
    private static Aluno criarAluno(int numero) {
        String nome = Teclado.leString("Digite o nome do aluno " + numero + ": ");
        GrauA ga = criarGrauA();
        GrauB gb = criarGrauB();
        return new Aluno(nome, ga, gb);
    }
    
    private static GrauA criarGrauA() {
        String dataInicioGA = Teclado.leString("Digite a data inicio do Grau A: ");
        String dataFimGA = Teclado.leString("Digite a data fim do Grau A: ");
        double notaTrabalho = Teclado.leDouble("Digite a nota do trabalho do Grau A: ");
        double notaProva = Teclado.leDouble("Digite a nota da prova do Grau A: ");
        return new GrauA(dataInicioGA, dataFimGA, notaTrabalho, notaProva);
    }
    
    private static GrauB criarGrauB() {
        String dataInicioGB = Teclado.leString("Digite a data inicio do Grau B: ");
        String dataFimGB = Teclado.leString("Digite a data fim do Grau B: ");
        double notaAtividades = Teclado.leDouble("Digite a nota das atividades do Grau B: ");
        double notaSeminario = Teclado.leDouble("Digite a nota do seminario do Grau B: ");
        double notaParticipacao = Teclado.leDouble("Digite a nota da participacao do Grau B: ");
        return new GrauB(dataInicioGB, dataFimGB, notaAtividades, notaSeminario, notaParticipacao);
    }
    
    private static void avaliarAlunos(Turma turma) {
        for (int i = 1; i <= 3; i++) {
            Aluno aluno = null;
            switch(i) {
                case 1:
                    aluno = turma.getAluno1();
                    break;
                case 2:
                    aluno = turma.getAluno2();
                    break;
                case 3:
                    aluno = turma.getAluno3();
                    break;
            }
            double notaFinal = aluno.calculaNotaFinal();
            if (notaFinal >= 6.0) {
                System.out.println("Aluno " + aluno.getNome() + ": Passou por media!");
            } else {
                System.out.println("Aluno " + aluno.getNome() + ": Fico em Grau C.");
            }
        }
    }  
}
