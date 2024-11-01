public class GrauB extends Grau {
    private double notaAtividades;
    private double notaSeminario;
    private double notaParticipacao;

    // Construtor que recebe parâmetros
    public GrauB(String dataInicio, String dataFim, 
    double notaAtividades, double notaSeminario, double notaParticipacao) {
        super(dataInicio, dataFim);
        this.notaAtividades = notaAtividades;
        this.notaSeminario = notaSeminario;
        this.notaParticipacao = notaParticipacao;
    }

    // Construtor sem parâmetros (inicializa as notas em 0)
    public GrauB() {
        super();
        this.notaAtividades = 0;
        this.notaSeminario = 0;
        this.notaParticipacao = 0;
    }

    // Métodos de acesso
    public double getNotaAtividades() {
        return notaAtividades;
    }

    public void setNotaAtividades(double notaAtividades) {
        this.notaAtividades = notaAtividades;
    }

    public double getNotaSeminario() {
        return notaSeminario;
    }

    public void setNotaSeminario(double notaSeminario) {
        this.notaSeminario = notaSeminario;
    }

    public double getNotaParticipacao() {
        return notaParticipacao;
    }

    public void setNotaParticipacao(double notaParticipacao) {
        this.notaParticipacao = notaParticipacao;
    }

    // Método para calcular a nota final do Grau B
    public double calculaNotaFinalGrau() {
        return (notaAtividades * 0.3) + (notaSeminario * 0.6) + (notaParticipacao * 0.1);
    }
    
    // Método toString (sobrescrito)
    @Override
    public String toString() {
        return "GrauB [dataInicio=" + getDataInicio() + ", dataFim=" + getDataFim() +
               ", notaAtividades=" + notaAtividades + ", notaSeminario=" + notaSeminario +
               ", notaParticipacao=" + notaParticipacao + "]";
    }
}
