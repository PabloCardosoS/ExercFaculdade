public class Sala {
    private String nome;
    private Cadeira[] cadeiras;
    
    public Sala(String nome) {
        this.nome = nome;  
        this.cadeiras = new Cadeira[4];
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cadeira[] getCadeiras() {
        return cadeiras;
    }
    public void adicionarCadeira(Cadeira cadeira, int posicao) {
        if (posicao >= 0 && posicao < cadeiras.length) {
            cadeiras[posicao] = cadeira;
        } else {
            throw new IndexOutOfBoundsException("Posiçao invalidada. Use um indice entre 0 e 3.");
        }
    }
    // Questao 8
    public int cadeirasComMesaDisponiveis() {
        int count = 0;
        for (Cadeira cadeira : cadeiras) {
            if (cadeira instanceof CadeiraComMesa && !cadeira.isOcupada()) {
                count++;
            }
        }
        return count;
    }
    // Questao 9
    public int cadeirasComRodinhasDisponiveis() {
        int count = 0;
        for (Cadeira cadeira : cadeiras) {
            if (cadeira instanceof CadeiraComRodinhas && !cadeira.isOcupada()) {
                count++;
            }
        }
        return count;
    }
    // Questao 10
    public Cadeira entraAluno(Aluno aluno, String tipoCadeira) {
        Cadeira cadeiraEscolhida = null;
        
        if (tipoCadeira.equalsIgnoreCase("mesa")) {
            for (Cadeira cadeira : cadeiras) {
                if (cadeira instanceof CadeiraComMesa && !cadeira.isOcupada()) {
                    cadeira.ocupar(aluno);
                    cadeiraEscolhida = cadeira;
                    break;
                }
            }
        } else if (tipoCadeira.equalsIgnoreCase("rodinha")) {
            for (Cadeira cadeira : cadeiras) {
                if (cadeira instanceof CadeiraComRodinhas && !cadeira.isOcupada()) {
                    cadeira.ocupar(aluno);
                    cadeiraEscolhida = cadeira;
                    break;
                }
            }
        }
        
        if (cadeiraEscolhida == null) {
            for (Cadeira cadeira : cadeiras) {
                if (!cadeira.isOcupada()) {
                    cadeira.ocupar(aluno);
                    cadeiraEscolhida = cadeira;
                    break;
                }
            }
        }
        return cadeiraEscolhida;  
    }
    
    @Override
    public String toString() {
        String cadeirasStr = "";
        for (Cadeira cadeira : cadeiras) {
            cadeirasStr += (cadeira != null ? cadeira.toString() : "null") + ", ";
        }
        if (cadeirasStr.length() > 0) {
            cadeirasStr = cadeirasStr.substring(0, cadeirasStr.length() - 2);
        }
        
        return "Sala{" +
            "nome='" + nome + '\'' +
            ", cadeiras=[" + cadeirasStr + "]" +
            '}';
    }
}
