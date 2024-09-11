package lista2while04;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int num1 = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		int num2 = scanner.nextInt();
		
		int maxNum = Math.max(num1, num2);
		int minNum = Math.min(num1, num2);
		
		int i = minNum + 1;
		int j = maxNum;
		int soma = 0;
		
		while (i < j) {
			soma += i;
			i++;
		}
		System.out.println("A soma dos números " + minNum + " e " + maxNum + " é de: " + soma);
		
	}

}
