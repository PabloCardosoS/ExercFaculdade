package lista2while03;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("Erro!\nO num1 é menor que o num2.");
		} else {
			int soma = 0;
			int cont = num1;
			while (cont < (num2 - 1)) {
				soma += cont + 1;
				cont++;
			}
			System.out.println("A soma dos valores inteiros entre " + num1 + " e " + num2 + " é: " + soma);
		}
		
		
	}

}
