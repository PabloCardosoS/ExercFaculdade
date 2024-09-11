package whilelista9;

import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número inteiro: ");
		int val1 = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		int val2 = scanner.nextInt();
		if (val1 >= 0 && val2 >= 0) {
			if (val1 < val2) {
				System.out.println("O primeiro valor é menor que o segundo.");
			} else if (val2 < val1) {
				System.out.println("O segundo valor é menor que o primeiro.");
			} else {
				System.out.println("Os valores são iguais.");
			}
		} else if (val1 < 0 && val2 >= 0) {
			System.out.println("O primeiro número é negativo. \nPortanto, não será feita a comparação.");
		} else if (val2 < 0 && val1 >= 0) {
			System.out.println("O segundo número é negativo. \nPortanto, não será feita a comparação.");
		} else {
			System.out.println("Os dois valores são negativo. \nPortanto, não será feita a comparação.");
		}
	}

}
