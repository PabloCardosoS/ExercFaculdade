package sem3ex002;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escreva um número (n1): ");
		int n1 = scanner.nextInt();
		System.out.println("Escreva outro número (n2): ");
		int n2 = scanner.nextInt();
		
		if (n1 > n2) {
			System.out.println("n1 é maior que n2");
		} else if (n1 < n2) {
			System.out.println("n1 é menor que n2");
		} else {
			System.out.println("n1 é igual a n2");
		}
	}

}
