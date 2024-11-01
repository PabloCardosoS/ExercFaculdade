public class CadeiraComRodinhas extends Cadeira {
    private Data ultimaManutencao;
    
    public CadeiraComRodinhas(Cor cor, Data ultimaManutencao) {
        super(cor);
        this.ultimaManutencao = ultimaManutencao;
    }
    public Data getUltimaManutencao() {
        return ultimaManutencao;
    }
    
    @Override
    public String toString() {
        return "CadeiraComRodinhas{" +
            "cor=" + getCor() +
            ", aluno=" + getAluno() +
            ", data da ultima manutencao=" + ultimaManutencao +
            '}';
    }
}
