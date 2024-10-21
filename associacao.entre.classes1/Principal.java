public class Principal {
    public static void main(String[] args) {
        int idCliente = 1;
        System.out.format("Informe o %dº cliente:", idCliente);
        Cliente cliente1 = new Cliente(
            Teclado.leString("Nome: "),
            Teclado.leInt("Idade: "),
            Teclado.leChar("Sexo: "),
            Teclado.leString("E-mail: "),
            Teclado.leString("Senha: "),
            new Livro(Teclado.leString("Titulo: "),
                Teclado.leString("Autor: "),
                Teclado.leInt("Ano: "),
                Teclado.leInt("Quantidade: "),
                Teclado.leDouble("Preço: ")
            )
        );
        
        idCliente++;
        System.out.format("Informe o %dº cliente:", idCliente);
        Cliente cliente2 = new Cliente(
            Teclado.leString("Nome: "),
            Teclado.leInt("Idade: "),
            Teclado.leChar("Sexo: "),
            Teclado.leString("E-mail: "),
            Teclado.leString("Senha: "),
            new Livro(Teclado.leString("Titulo: "),
                Teclado.leString("Autor: "),
                Teclado.leInt("Ano: "),
                Teclado.leInt("Quantidade: "),
                Teclado.leDouble("Preço: ")
            )
        );
        
        idCliente++;
        System.out.format("Informe o %dº cliente:", idCliente);
        Cliente cliente3 = new Cliente(
            Teclado.leString("Nome: "),
            Teclado.leInt("Idade: "),
            Teclado.leChar("Sexo: "),
            Teclado.leString("E-mail: "),
            Teclado.leString("Senha: "),
            new Livro(Teclado.leString("Titulo: "),
                Teclado.leString("Autor: "),
                Teclado.leInt("Ano: "),
                Teclado.leInt("Quantidade: "),
                Teclado.leDouble("Preço: ")
            )
        );
        
        System.out.printf(
            "O cliente %s esta com o livro %s, e o preco por pagina desse livro e R$%f", 
            cliente1.getName(), cliente1.getLivro().getTitulo(), cliente1.getLivro().calcularPrecoPorPagina()
            );
        System.out.printf(
            "O cliente %s esta com o livro %s, e o preco por pagina desse livro e R$%f", 
            cliente2.getName(), cliente2.getLivro().getTitulo(), cliente2.getLivro().calcularPrecoPorPagina()
            );
        System.out.printf(
            "O cliente %s esta com o livro %s, e o preco por pagina desse livro e R$%f", 
            cliente3.getName(), cliente3.getLivro().getTitulo(), cliente3.getLivro().calcularPrecoPorPagina()
        );          
  
    }
}
