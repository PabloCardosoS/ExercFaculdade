package ex002;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número inteiro: ");
		int num1 = scanner.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		int num2 = scanner.nextInt();
		System.out.print("Digite o terceiro número inteiro: ");
		int num3 = scanner.nextInt();
		System.out.print("Digite o quarto número inteiro: ");
		int num4 = scanner.nextInt();
		System.out.print("Digite o quinto número inteiro: ");
		int num5 = scanner.nextInt();

		int soma = num1 + num2 + num3 + num4 + num5;
		int produto = num1 * num2 * num3 * num4 * num5;
		
		System.out.println("---------------------------------------------");
		System.out.println("A soma dos 5 números inteiro é: " + soma);
		System.out.println("---------------------------------------------");
		System.out.println("O produto dos 5 números inteiro é: " + produto);	
		System.out.println("---------------------------------------------");
	
	}

}
