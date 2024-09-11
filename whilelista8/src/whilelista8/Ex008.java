package whilelista8;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		System.out.print("Digite quantas vezes quer digitar um número inteiro: ");
		int quant = scanner.nextInt();
		while (i < quant) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			int num = scanner.nextInt();
			i++;
			if (num > 0) {
				System.out.println("O número é positivo.");
			} else if (num < 0) {
				System.out.println("O número é negativo.");
			} else {
				System.out.println("É zero.");
			}
		}
		

	}

}
