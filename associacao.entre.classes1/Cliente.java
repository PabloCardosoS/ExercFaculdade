public class Cliente {
    private String name, email, password;
    private int age;
    private char sex;
    private Livro livro;
    
    public Cliente(String name, int age, char sex, String email, String password, Livro livro) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.password = password;
        this.livro = livro;
    }
    
    public Cliente(String name, int age, char sex, String email, String password) {
        this(name, age, sex, email, password, null);
    }
    
    public Cliente(String name, Livro livro) {
        this(name, 0, '-', "", "", livro);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public void imprimeInformacoes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("E-mail: " + email);
        System.out.println("Password: " + password);
        System.out.println("Livro: " + (livro != null ? livro.getTitulo() : "Nenhum"));
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "name='" + name + '\'' + "age='" + age + '\'' + "sex='" + sex + '\'' 
                + "email='" + email + '\'' + "password='" + password + '\''
                + "livro=" + (livro != null ? livro.getTitulo() : "Nenhum") + '}';
    }
    
}
