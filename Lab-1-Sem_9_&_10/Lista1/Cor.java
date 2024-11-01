public class Cor {
    private int r, g, b;
    
    public Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public int getR() {
        return g;
    }
    public void setR(int r) {
        this.r = r;
    }
    public int getG() {
        return g;
    }
    public void setG(int g) {
        this.g = g;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    
    @Override
    public String toString() {
        return String.format("Quantidades das cores: Red %d, Green %d e Blue %d.", r, g, b);
    }
}