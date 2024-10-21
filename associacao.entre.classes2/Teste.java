public class Teste {
    public static void main(String[] args) {
        FuncionarioCaixa funcionario = new FuncionarioCaixa(
            Teclado.leString("Digite o nome: "),
            Teclado.leString("Digite o endereco: "),
            Teclado.leChar("Digite o sexo: "),
            new Calculadora(Teclado.leString("Digite a cor da calculadora: "))
        );
        System.out.println("Operaçoes do Funcionario:");
        System.out.println("Resultado de 2 + 2 = " + funcionario.soma(2, 2));
        System.out.println("Resultado de 5 - 4 = " + funcionario.subtrai(5, 4));
        System.out.println("Resultado de 2 x 3 = " + funcionario.multiplica(2, 3));
        System.out.println("Resultado de 6 / 3 = " + funcionario.divide(6, 3));
        System.out.println("Resultado de 7 ao quadrado = " + funcionario.elevadoAoQuadrado(7));
        System.out.println("Resultado de 8 ao cubo = " + funcionario.elevadoAoCubo(8));
        
        
        Empresa empresa1 = new Empresa(
            Teclado.leString("Digite o nome da empresa: "), 
            funcionario, 
            new FuncionarioCaixa(
                Teclado.leString("Digite o nome do funcionario 2: "),
                Teclado.leString("Digite o endereco do funcionario 2: "),
                Teclado.leChar("Digite o sexo do funcionario 2: "),
                new Calculadora(Teclado.leString("Digite a cor da calculadora: "))
            )
        );
        
        
            
        empresa1.imprimeInfo();
    }
}
