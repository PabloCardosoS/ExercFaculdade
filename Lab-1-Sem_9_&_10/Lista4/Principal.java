import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[4];
        Random random = new Random();
        
        for (int i = 0; i < produtos.length; i++) {
            String nome = Teclado.leString("Digite o nome do produto: ");
            String descricao = Teclado.leString("Digite a descricao do produto: ");
            double valor = Teclado.leDouble("Digite o valor do produto: ");
            
            int sorteio = random.nextInt(100) + 1;
            
            if (sorteio % 2 == 0) {
                int diaValidade = Teclado.leInt("Digite o dia da validade: ");
                int mesValidade = Teclado.leInt("Digite o mes da validade: ");
                int anoValidade = Teclado.leInt("Digite o ano da validade: ");

                Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
                produtos[i] = new Perecivel(nome, descricao, valor, dataValidade);
            } else {
                int diaFabricacao = Teclado.leInt("Digite o dia da fabricacao: ");
                int mesFabricacao = Teclado.leInt("Digite o mes da fabricacao: ");
                int anoFabricacao = Teclado.leInt("Digite o ano da fabricacao: ");
                
                Data dataFabricacao = new Data(diaFabricacao, mesFabricacao, anoFabricacao);
                produtos[i] = new NaoPerecivel(nome, descricao, valor, dataFabricacao);
            }
        }
        
        double maxValorPerecivel = Double.NEGATIVE_INFINITY;
        Perecivel produtoMaisCaro = null;
        
        for (Produto produto : produtos) {
            if (produto instanceof Perecivel) {
                if (produto.getValor() > maxValorPerecivel) {
                    maxValorPerecivel = produto.getValor();
                    produtoMaisCaro = (Perecivel) produto; 
                }
            }
        }
        
        if (produtoMaisCaro != null) {
            System.out.println("O produto perecivel mais caro e: " + produtoMaisCaro);
        }
        
        System.out.println("Produtos nao-pereciveis fabricados antes de 2023: ");
        for (Produto produto : produtos) {
            if (produto instanceof NaoPerecivel) {
                NaoPerecivel naoPerecivel = (NaoPerecivel) produto;
                if (naoPerecivel.getDataFabricacao().getAno() < 2023) {
                    System.out.println(naoPerecivel.getDataFabricacao());
                }
            }
        }
        
        Data dataReferencia = new Data(1, 5, 2023);
        System.out.println("Produtos pereciveis que ja passaram da validade no dia 01/05/23: ");
        for (Produto produto : produtos) {
            if (produto instanceof Perecivel) {
                Perecivel perecivel = (Perecivel) produto;
                if (perecivel.getDataValidade().getAno() < dataReferencia.getAno() ||
                    (perecivel.getDataValidade().getAno() == dataReferencia.getAno() &&
                    (perecivel.getDataValidade().getMes() < dataReferencia.getMes() ||
                    (perecivel.getDataValidade().getMes() == dataReferencia.getMes() &&
                    perecivel.getDataValidade().getDia() < dataReferencia.getDia())))) {
                        System.out.println(perecivel);
                }
            }
        }
    }
}
