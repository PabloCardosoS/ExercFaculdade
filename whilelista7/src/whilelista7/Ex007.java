package whilelista7;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int soma = 0;
		while (i < 3) {
			System.out.print("Digite um número inteiro: ");
			int n = scanner.nextInt();
			soma += n;
			i++;
		}
		System.out.println("A soma dos números é: " + soma);
	}
}
