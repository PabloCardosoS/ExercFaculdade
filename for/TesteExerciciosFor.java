public class TesteExerciciosFor {
    public static void main(String[] args) {
        ExerciciosFor exercicios = new ExerciciosFor();
        
        int x1 = Teclado.leInt("Digite o numero de pessoas que quer escrever o nome: ");
        exercicios.exercicio1(x1);
        
        int x2 = Teclado.leInt("Digite um numero inteiro positivo para printar na " 
            + "tela de zero a esse numero: ");
        exercicios.exercicio2(x2);
        
        int x3 = Teclado.leInt("Digite um numero inteiro positivo para printar todos os pares de " 
            + "zero ate esse numero: ");
        exercicios.exercicio3(x3);
        
        int x4 = Teclado.leInt("Digite um numero inteiro positivo para printar na "
            + "tela dele ate zero (decrescente): ");
        exercicios.exercicio4(x4);
        
        int x5 = Teclado.leInt("Digite a quantidade de torcedores: ");
        exercicios.exercicio5(x5);
        
        int x6 = Teclado.leInt("Digite o numero de numeros reais que vai querer digitar: ");
        exercicios.exercicio6(x6);
        
        exercicios.exercicio7();
        
        exercicios.exercicio8();
        
        int x9x1 = Teclado.leInt("Digite o primeiro numero inteiro: ");
        int x9x2 = Teclado.leInt("Digite o segundo numero inteiro: ");
        exercicios.exercicio9(x9x1, x9x2);
        
        exercicios.exercicio10();
        
        int x11e1 = Teclado.leInt("Digite o primeiro numero inteiro: ");
        int x11e2 = Teclado.leInt("Digite o segundo numero inteiro: ");
        exercicios.exercicio11(x11e1, x11e2);
        
        exercicios.exercicio12();
        
        int x13 = Teclado.leInt("Digite um numero inteiro positivo para verificar o fatorial: ");
        exercicios.exercicio13(x13);
        
        int x14 = Teclado.leInt("Digite um numero primo: ");
        exercicios.exercicio14(x14);
        
        int x15 = Teclado.leInt("Digite um numero primo para somar os primos ate ele: ");
                
    }
}
