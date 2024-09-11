package sem3ex003;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escreva um número inteiro (A): ");
		int A = scanner.nextInt();
		System.out.print("Escreva outro número inteiro (B): ");
		int B = scanner.nextInt();
		double div = (double) A / B;
		
		if (B == 0) {
			System.out.println("ERRO! B é igual a zero.");
		} else {
			System.out.printf("A divisão de A por B é %.2f", div);
		}
		
	}

}
