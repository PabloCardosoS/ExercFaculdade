package listafor02;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int n1 = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		int n2 = scanner.nextInt();
		
		int valMin = Math.min(n1, n2);
		int valMax = Math.max(n1, n2);
		
		for (int i = valMin; i <= valMax; i++) {
			System.out.print(i + " ");
		}

	}

}
