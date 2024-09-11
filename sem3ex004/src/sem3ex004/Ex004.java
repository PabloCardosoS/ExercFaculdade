package sem3ex004;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int a = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		int b = scanner.nextInt();
		System.out.print("Digite o terceiro número: ");
		int c = scanner.nextInt();
		if (a < b && a < c) {
			System.out.println("O primeiro digitado é o menor.");
		} else if (b < a && b < c) {
			System.out.println("O segundo digitado é o menor.");
		} else if (c < a && c < b) {
			System.out.println("O terceiro digitado é o menor.");
		} else if (a == b && a == c) {
			System.out.println("Todos os 3 números digitados são iguais.");
		} else if (a == b && a < c) {
			System.out.println("O primeiro e o segundo são iguais e menores.");
		} else if (a == c && a < b) {
			System.out.println("O primeiro e o terceiro digitados são os menores.");
		} else if (b == c && b < a) {
			System.out.println("O segundo e terceiro digitado são menores.");
		}
		
	}

}
