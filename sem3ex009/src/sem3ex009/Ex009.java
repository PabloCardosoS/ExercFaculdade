package sem3ex009;

import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a nota do GA: ");
		float grauA = scanner.nextFloat();
		System.out.print("Digite a nota do GB: ");
		float grauB = scanner.nextFloat();

		if (grauA < 0 || grauA > 10 || grauB < 0 || grauB > 10) {
			System.out.println("ERRO! O valor está fora do intervalo de 0 a 10.");
		} else {
			float notaFinal = (float) (grauA * 0.3 + grauB * 0.7);
			if (notaFinal < 6) {
			System.out.println("Será necessário fazer o Grau C.");
			} else {
				System.out.println("APROVADO!!!!!!");
			}
		}
	}
}
