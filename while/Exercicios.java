public class Exercicios {
    public void contador(int x) {
        while (x <= 300) {
            System.out.println(x);
            x++;
        }
    }
    
    public void imprimePares(int x) {
        if (x < 0) {
            System.out.println("ERRO: O valor de X deve ser nao negativo.");
            return;
        }
        int i = 0;
        while (i <= x) {
            if (i % 2 == 0) {
                System.out.println(i);
                i += 2;
            } 
        }
    }
    
    public boolean verificaPrimo(int x) {
        if (x <= 1) {
            return false;
        }
        int divisor = 2;
        while ((divisor * divisor) <= x) {
            if (x % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
}
