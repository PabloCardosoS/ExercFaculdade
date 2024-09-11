package ex003;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Digite o primeiro número inteiro: ");
		int A = scanner.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		int B = scanner.nextInt();
		System.out.print("Digite o terceiro número inteiro: ");
		int C = scanner.nextInt();
		System.out.print("Digite o quarto número inteiro: ");
		int D = scanner.nextInt();
		System.out.print("Digite o quinto número inteiro: ");
		int E = scanner.nextInt();
		
		float areaTriangulo = (float) (B * C) / 2;
		System.out.println("A área do triângulo é: " + areaTriangulo);
		
		float perRetangulo = (float) (A + B + C + D);
		System.out.println("O perímetro do retângulo é: " + perRetangulo);
		
		float areaCirculo = (float) (Math.PI * E * 2);
		System.out.println("A área do círculo é: " + areaCirculo);
	}

}
