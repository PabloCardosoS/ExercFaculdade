package ex004;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do trabalho: ");
		float trabalho = scanner.nextFloat();
		System.out.print("Digite a nota da prova: ");
		float prova = scanner.nextFloat();
		System.out.println("Digite a nota do teste: ");		
		float teste = scanner.nextFloat();
		
		double notaFinal = trabalho * 0.1 + prova * 0.6 + teste * 0.3;
		
		System.out.println("A sua nota final é de: " + notaFinal);
		
		if (notaFinal > 6.0) {
			System.out.println("Você foi aprovado!\nParabéns!!!!!!!");
		} else {
			System.out.println("Você foi reporvado.");
		}

	}

}
