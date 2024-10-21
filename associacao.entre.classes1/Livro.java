public class Livro {
    private String titulo, autor;
    private int ano, qt;
    private double preco;
    
    // Construtor padrao
    public Livro(String titulo, String autor, int ano, int qt, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.qt = qt;
        this.preco = preco;
    }
     public Livro(String titulo, String autor) {
        this(titulo, autor, 2024, 1, 0.0); 
    }
    
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getQt() {
        return qt;
    }
    public void setQt(int qt) {
        this.qt = qt;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double calcularPrecoPorPagina() {
        return preco / qt;
    }
    
    @Override
    public String toString() {
        return String.format("Titulo: %s\nAutor: %s\nAno: %d\nQuantidade por pagina: %d\nPreço: %f\n",
                titulo, autor, ano, qt, preco);
    }
}
