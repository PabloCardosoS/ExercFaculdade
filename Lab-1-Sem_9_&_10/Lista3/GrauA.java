public class GrauA extends Grau {
    private double notaTrabalho;
    private double notaProva;

    // Construtor que recebe parâmetros
    public GrauA(String dataInicio, String dataFim, double notaTrabalho, double notaProva) {
        super(dataInicio, dataFim);
        this.notaTrabalho = notaTrabalho;
        this.notaProva = notaProva;
    }

    // Construtor sem parâmetros (inicializa as notas em 0)
    public GrauA() {
        super();
        this.notaTrabalho = 0;
        this.notaProva = 0;
    }

    // Métodos de acesso
    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }

    // Método para calcular a nota final do Grau A
    public double calculaNotaFinalGrau() {
        return (notaTrabalho * 0.3) + (notaProva * 0.7);
    }
    
    // Método toString (sobrescrito)
    @Override
    public String toString() {
        return "GrauA [dataInicio=" + getDataInicio() + ", dataFim=" + getDataFim() +
               ", notaTrabalho=" + notaTrabalho + ", notaProva=" + notaProva + "]";
    }
}
