public class Grau {
    private String dataInicio;
    private String dataFim;

    // Construtor que recebe parâmetros
    public Grau(String dataInicio, String dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Construtor sem parâmetros (inicializa com null)
    public Grau() {
        this.dataInicio = null;
        this.dataFim = null;
    }

    // Métodos de acesso
    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    // Método toString
    @Override
    public String toString() {
        return "Grau [dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
    }
}
