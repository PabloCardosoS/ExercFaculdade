public class Calculadora {
    private double memoria;
    private String cor;
    
    public Calculadora(String cor) {
        this.memoria = 0;
        this.cor = cor;
    }
    
    public double getMemoria() {
        return memoria;
    }
    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public double soma(double a, double b) {
        return a + b;
    }
    public double subtrai(double a, double b) {
        return a - b;
    }
    public double multiplica(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;           
        } else {
            System.out.println("Erro. Divisao por zero");
            return Double.NaN; // Retrona 'Not a Number' se a condiçao for falsa.
        }
    }
    public long elevadoAoQuadrado(int a) {
        return a * a;
    }
    public long elevadoAoCubo(int a) {
        return a * a * a;
    }
    
    public void imprimeInfo() {
        System.out.printf("\nA calculadora de cor %s tem %f de memoria.\n", cor, memoria);
    }
    
}
