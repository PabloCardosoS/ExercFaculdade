public class Retangulo extends Figura {
    private double base;
    private double altura;
    
    public Retangulo(double x, double y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    public Retangulo() {
        super();
        this.base = 1;
        this.altura = 1;
    }
    public Retangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculaArea() {
        return base * altura;
    }
    
    public String toString() {
        return "Retangulo{" +
            "Coordenada x: " + getX() +
            ", Coordenada y: " + getY() +
            ", Base: " + base +
            ", Altura: " + altura +
            '}';
    }
    
}
