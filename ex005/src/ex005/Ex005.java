package ex005;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota da atividade prátiva do GA: ");
		float a1 = scanner.nextFloat();
		System.out.print("Digite a nota da atividade teórica do GA: ");
		float a2 = scanner.nextFloat();
		System.out.print("Digite a nota da prova em laboratório do GB: ");
		float b1 = scanner.nextFloat();
		System.out.print("Digite a nota do teste teórico do GB: ");
		float b2 = scanner.nextFloat();
		System.out.print("Digite a nota do trabalho extraclasse do GB: ");
		float b3 = scanner.nextFloat();
		
		float aTotal = (float) (a1 * 0.45 + a2 * 0.55);
		float bTotal = (float) (b1 * 0.6 + b2 * 0.2 + b3 * 0.2);
		float notaTotal = (float) (aTotal * 0.33 + bTotal * 0.67);
		
		if (notaTotal > 6.0) {
			System.out.printf("PARABÉNS!!! Você foi aprovado e sua nota final foi de %.2f\n", notaTotal);
		} else {
			System.out.println("Você foi reprovado. Sua nota foi de " + notaTotal);
		}
	}

}