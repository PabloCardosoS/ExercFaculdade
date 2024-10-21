public class Principal {
    public static void main(String[] args) {
        Exercicios ex = new Exercicios();
    
        int opcao = 0;
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Conta ate 300");
            System.out.println("2. Imprime pares");
            System.out.println("3. Verifica primo");
            System.out.print("Digite a opçao desejada (ou qualquer numero fora do intervalor para sair): ");
        
            opcao = Teclado.leInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite um numero inicial (menor ou igual a 300): ");
                    int numContador = Teclado.leInt();
                    ex.contador(numContador);
                    break;
                case 2:
                    System.out.print("Digite um numero para imprimir pares ate ele: ");
                    int numPares = Teclado.leInt();
                    ex.imprimePares(numPares);
                    break;
                case 3:
                    System.out.print("Digite um numero para verificar se e primo: ");
                    int numPrimo = Teclado.leInt();
                    boolean resultado = ex.verificaPrimo(numPrimo);
                    System.out.println(numPrimo + (resultado ? " e primo." : "nao e primo."));
                    break;
                default:
                    System.out.println("Opçao invalida. Encerrando o programa.");
                    return;
            }
        }
        
        
    }
}
