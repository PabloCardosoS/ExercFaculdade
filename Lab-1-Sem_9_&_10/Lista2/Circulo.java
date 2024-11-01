public class Circulo extends Figura {
    private double raio;
    
    // Construtor com parametros
    public Circulo(double x, double y, double raio) {
        super(x, y);
        this.raio = raio;
    }
    // Construtor padrao
    public Circulo() {
        super();
        this.raio = 1;
    }
    //Construtor apenas com raio
    public Circulo(double raio) {
        super();
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public String toString() {
        return "Circulo{" +
               "Cordenada x: " + getX() + 
               ", Cordenada y: " + getY() +
               ", Raio: " + raio +
               '}';
    }
    public double calculaArea() {
        return 3.14 * raio * raio;
    }
}
